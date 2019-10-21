<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
<link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script type="text/javascript" src="js/welcome.js"></script>
<html>
<head>
    <meta charset="utf-8" />
    <title></title>

</head>
<body>
<!-- 导航栏 -->
<div id="page1">
    <%@include file="WEB-INF/jsp/include/welcome/welcome_navigation.jsp" %>
</div>
<!-- 主体功能-->

<!-- <div >
    <ul class="nav nav-tabs">
        <li role="presentation" class="active"><a href="#">首页</a></li>
        <li role="presentation"><a href="#">商品介绍</a></li>
    <li role="presentation"><a href="#">商品购买</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
    </ul>


</div> -->



<!-- 		<ol class="breadcrumb">
		<li><a href="#">商品介绍</a></li>
		<li><a href="#">商品购买</a></li>
		<li class="active">BootStrap 面包屑导航 </li>
		</ol> -->
<div class="jumbotron">
    <div class="container" align="center">
        <h2 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">面团</h2>
        <br>
        <div class="text-muted">与世界分享你的面团</div>
        <br>
        <br>
        <p><a role="button" href="#" class="btn btn-success">查看详情</a></p>

    </div>
</div>
<div class="jumbotron">
    <div class="container" align="center">
        <h2 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">面团产地</h2>
        <br>
        <div class="text-muted">介绍产地</div>
        <br>
        <br>
        <p><a role="button" href="introuduce.html" class="btn btn-success">更详细的介绍</a></p>
    </div>
</div>
<div class="jumbotron">
    <div class="container" align="center">
        <h2 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">面团优势</h2>
        <br>
        <div class="text-muted">有什么优势</div>
        <br>
        <br>
        <p><a role="button" href="introuduce.html" class="btn btn-success">优势点还有哦</a></p>
    </div>
</div>
<div class="jumbotron">
    <div class="container" align="center">
        <h2 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">如何买面团</h2>
        <br>
        <div class="text-muted">介绍如何买</div>
        <br>
        <br>
        <p><a role="button" href="pay.html" class="btn btn-success">买就完事了</a></p>
    </div>
</div>

</body>
</html>
