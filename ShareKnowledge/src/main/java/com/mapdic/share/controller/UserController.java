package com.mapdic.share.controller;

import com.google.common.base.Preconditions;
import com.mapdic.share.common.*;
import com.mapdic.share.controller.dto.KnowledgeDTO;
import com.mapdic.share.controller.dto.OverviewUserDTO;
import com.mapdic.share.controller.dto.SelectListDTO;
import com.mapdic.share.controller.dto.UserDTO;
import com.mapdic.share.model.*;
import com.mapdic.share.serviceimpl.*;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by liuyong on 2016/3/10.
 */
@Controller
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    TokenServiceImpl tokenServiceImpl;
    @Resource
    DoCookie doCookie;
    @Resource
    KnowledgeServiceImpl knowledgeService;
    @Resource
    ProverbServiceImpl proverbService;

    @Resource
    LanguageServiceImpl languageService;
    @Resource
    CategoryServiceImpl categoryService;

    static final String face = "../face/default.jpg" ;
    static final String prefix = "../face/" ;
    Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public ModelAndView getAllUser(HttpServletRequest request, PrintWriter out, HttpServletResponse response){
        List<User> users = userServiceImpl.getAllUser();
        System.out.println(request.getParameter("username"));
        String s = request.getParameter("username");
        ModelAndView modelAndView = new ModelAndView("getAllUser");
        modelAndView.addObject("username",s);
        DoCookie doCookie = new DoCookie();
        doCookie.addCookie(response, users.get(0));
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping(value ="/login")
    public UserDTO userLogin(@RequestBody User user, HttpServletResponse response, HttpServletRequest request){
        Preconditions.checkArgument(user != null, "用户为空");
        User usr = userServiceImpl.login(user);
        if (usr != null){
            doCookie.addCookie(response, usr);
            return new UserDTO(usr.getId(), user.getUserName(), usr.getMail(),user.getLevel());
        }
        return null;
    }
    @ResponseBody
    @RequestMapping(value ="/addUser")
    public String addUser(@RequestBody User user, HttpServletResponse response){
        Preconditions.checkArgument(user != null, "用户为空");
        if(userServiceImpl.getUserByUserName(user.getUserName()) != null){
            return UserEnum.USERNAME.getName();
        }else if(userServiceImpl.getUserByMail(user.getMail()) != null){
            return UserEnum.MAIL.getName();
        }else {
            if(userServiceImpl.addUser(user))
                return UserEnum.OK.getName();
        }
        return UserEnum.FAIL.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/getUser")
    public User getUser(Integer id){
        Preconditions.checkArgument(id != null, "id无效");
        User user = userServiceImpl.getUserById(id);
        return  user;
    }
    @ResponseBody
    @RequestMapping(value ="/checkUser")
    public String checkUser(@RequestBody String token, HttpServletResponse response){
        Token ctoken = tokenServiceImpl.getTokenByKeepAlive(token);
        Date date = new Date();
        if(ctoken != null && ctoken.getTime().after(date)){
            return UserEnum.OK.getName();
        }
        doCookie.clearCookie(response);
        return UserEnum.FAIL.getName();
    }

    @ResponseBody
    @RequestMapping(value ="/getUserByToken")
    public UserDTO getUserByToken(@RequestBody String token, HttpServletResponse response){
        User user = userServiceImpl.getUserByToken(token);
        UserDTO userDTO = new UserDTO(user.getId(), user.getUserName(), user.getMail(),user.getLevel());
        userDTO.setPhone(user.getPhone());
        userDTO.setQq(user.getQq());
        if(user.getFace() == null || user.getFace().equals("")){
            userDTO.setFace(face);
        }else {
            userDTO.setFace(user.getFace());
        }
        if(user.getPhone() == null){
            userDTO.setPhone("");
        }
        userDTO.setWord(proverbService.getProverb());
        return userDTO;
    }

    @ResponseBody
    @RequestMapping(value ="/getOverviewUser")
    public OverviewUserDTO getOverviewUser(@RequestBody String token, HttpServletResponse response){
        List<KnowledgeDTO> knowledgeDTOs = new ArrayList();
        User usr = userServiceImpl.getUserByToken(token);
        int uid = usr.getId();
        OverviewUserDTO overviewUserDTO = new OverviewUserDTO();
        User user = userServiceImpl.getUserById(usr.getId());
        List<Knowledge> knowledges = knowledgeService.getTop5Knowledge(uid);
        overviewUserDTO.setUid(uid);
        overviewUserDTO.setUserName(user.getUserName());
        overviewUserDTO.setCountKnowledge(knowledgeService.countKnowledge(uid));
        overviewUserDTO.setCountBookmark(0);
        overviewUserDTO.setWord(proverbService.getProverb());
        if(user.getFace() == null || user.getFace().equals("")){
            overviewUserDTO.setFace(face);
        }else{
            overviewUserDTO.setFace(user.getFace());
        }
        for(Knowledge knowledge : knowledges){
            knowledgeDTOs.add(ModelToDTO.conKnowledgeToKnowledgeDTO(knowledge));
        }
        overviewUserDTO.setTop5KnowledgeList(knowledgeDTOs);
        return overviewUserDTO;
    }
    @ResponseBody
    @RequestMapping(value ="/uploadUserFace")
    public String uploadUserFace(@RequestParam("face") MultipartFile file, HttpServletRequest request, HttpServletResponse response, ModelMap map) {
        String path = request.getSession().getServletContext().getRealPath("face");
        String fileName = RenameUploadFile.rename(file.getOriginalFilename());
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        try {
            file.transferTo(targetFile);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return UserEnum.FAIL.getName();
        }
        User user = new User();
        user.setFace(prefix + fileName);
        user.setId(Integer.parseInt(request.getParameter("id")));
        userServiceImpl.updateUser(user);
        return UserEnum.OK.getName();
    }


    @ResponseBody
    @RequestMapping(value ="/updateUser")
    public String updateUser(@RequestBody User user) {
        if(user != null){
            userServiceImpl.updateUser(user);
            return UserEnum.OK.getName();
        }
        return UserEnum.FAIL.getName();
    }
    @ResponseBody
    @RequestMapping(value ="/getSelectList")
    public SelectListDTO getSelectList() {
        List<Category> categories = categoryService.getCategory();
        List<Language> languages = languageService.getLanguages();
        SelectListDTO selectListDTO = new   SelectListDTO(categories, languages);
       return  selectListDTO;
    }
}
