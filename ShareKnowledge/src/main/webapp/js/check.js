$(document).ready(function() {
    var ui = $.cookie("_ui");
    if(ui == null || ui == ""){
        window.location="/index.html";
        return ;
    }else {
        $.ajax({
            type: "POST",
            url: "/checkUser.do",
            contentType: 'application/json;charset=UTF-8',
            data: ui,
            datatype: 'text',
            success: function (data) {
                if(data != "OK"){
                    window.location="/index.html";
                }
                return ;
            },
            error: function (e) {
                alert("服务器错误");
            }
        });
    }
});