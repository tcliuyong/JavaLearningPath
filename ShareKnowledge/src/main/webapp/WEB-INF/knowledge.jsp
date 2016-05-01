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
    <script type="text/javascript" charset="utf-8" src="../umeditor/third-party/mathquill/mathquill.js"></script>
    <link href="../umeditor/third-party/mathquill/mathquill.css" rel="stylesheet" />
    <link href="../umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" charset="utf-8" src="../umeditor/umeditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="../umeditor/umeditor.min.js"></script>
    <script type="text/javascript" src="../umeditor/lang/zh-cn/zh-cn.js"></script>
</head>
<body>

<div class="main-container">
    <%--<div class="search-list-con">--%>
        <%--<img src="../images/scroll.jpg" style="width: 850px;height: 140px;">--%>
    <%--</div>--%>
    <br>
    <h2> 知识题目： ${knowledge.title}</h2>
    <br>
    <h3> 标签： ${knowledge.tag}&nbsp;&nbsp;&nbsp;&nbsp;</h3>

    <div class="search-list-con">
        ${knowledge.content}
    </div>
<c:choose>
    <c:when test="${knowledge.filePath ne null}">
            <a href=${knowledge.filePath} ><img id="edFile" style="width: 50px;height: 50px;" src="../images/zip.png"></a>
    </c:when>
    </c:choose>
    <div style="height:96px;"> </div>

</div>
</body>
</html>
