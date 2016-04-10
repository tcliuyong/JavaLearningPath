<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>mapdic</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet" />
    <link href="../css/font-awesome.css" rel="stylesheet" />
    <link href="../css/adminia.css" rel="stylesheet" />
    <link href="../css/adminia-responsive.css" rel="stylesheet" />
    <link href="../css/page.css" rel="stylesheet" />
    <link rel="stylesheet" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <link href="../css/bootstrap.css" rel="stylesheet">
    <link type="text/css" href="../css/main.css" rel="stylesheet">
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/jquery.autocomplete.min.js"></script>
    <script src="js/jquery-jtemplates.js"></script>
    <script src="../js/jquery.page.js"></script>
</head>
<body>

<div class="topadv">
</div>
<div class="main-container">
    <div class="con-l" nowrap>
        <div class="search-from2" style="position:relative"nowrap>
            <form id="form_search" action="/search.do" method="get">
                <div class="search-text-con2" style="position: relative; width: 500px;"nowrap>
                    <input type="text" name="page"  id="page" value="1" style="display:none;"/>
                    <input type="text" name="pagesize" id="pagesize" value="10" style="display:none;" />
                    <input type="text" name="category"  id="category"  value="0" style="display:none;" />
                    <input type="text"   name="keyword" id="keyword" value="${keyword}" style="height: 24px;font-size:20px;">

                </div>
                <%--<div id="droplist" nowrap></div>--%>
                <div class="search-btn-con2">
                    <input type="button" value="Map一下" onclick="searching()" class="search-btn2">
                </div>
            </form>

        </div>
    </div>


    <div class="add-tag-con" style="display:none">


    </div>

    <div class="search-list-con">
<c:forEach items="${knowList}" var="tmp">
        <dl class="search-list">
            <dt><a href=getKnowledge.do?kid=${tmp.k_id} target="_blank">${tmp.title}</a></dt>
            <dd class="author-time">标签：${tmp.tag} &nbsp;&nbsp; &nbsp;&nbsp; 适用系统：${tmp.system}</dd>
            <dd class="author-time">编程语言：${tmp.language}&nbsp;&nbsp; &nbsp;&nbsp; 所属类别：${tmp.category} </dd>

            <c:choose>
                <c:when test="${fn:length(tmp.orcontent) > 150}">
                    <dd class="search-detail">
                        <c:out value="${fn:substring(tmp.orcontent, 0, 150)}..." />
                    </dd>
                </c:when>
            </c:choose>
        </dl>
    <hr>
</c:forEach>
        <div class="tcdPageCode"></div>
    </div>

    <div style="display:none">
        <p class="pointout">抱歉，没有找到相关结果。</p>
    </div>

    <div style="height:96px;"> </div>




</div>
${current}
<script>
    $(".tcdPageCode").createPage({
        pageCount:${page},
        current:${current},
        backFn:function(p){
            $("#pagesize").val(10);
            $("#page").val(p);
            $("#category").val("0");
            $("#form_search").submit();
        }
    });
</script>
<script>
   function searching(){
        if($("#keyword").val() == ""){
            window.location="http://localhost:8080/";
            return false;
        }else {
            $("#form_search").submit();
        }
    }
</script>
</body>
</html>
