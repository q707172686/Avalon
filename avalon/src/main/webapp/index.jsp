<%--
  Created by IntelliJ IDEA.
  User: Pino
  Date: 18-5-30
  Time: 下午7:35
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="WEB-INF/jsp/base.jsp" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <link rel="SHORTCUT ICON" href="${ctx}/static/image/avalon.ico"/>
    <link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Avalon</title>

</head>
<body>
<%-- 一级导航栏开始 --%>
<nav class="navbar navbar-dark bg-dark navbar-expand-sm navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="nav-header">

            <a class="navbar-brand" href="#" style="font-family: 'Abril Fatface', cursive;">AVALON</a>
        </div>
        <div class="collapse navbar-collapse" id="navbar-menu">
            <ul class="nav navbar-nav navbar-right">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">前端</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">后端</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">区块链</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">操作系统</a>
                </li>
            </ul>

        </div>
    </div>

    <div class="btn-group">
        <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">
            <img src="${ctx}/static/image/avalon.ico" alt="" class="img-responsive"
                 style="max-width: 100%;height:auto;">
        </button>
        <div class="dropdown-menu">
            <a class="dropdown-item" href="#">个人主页</a>
            <a class="dropdown-item" href="#">设置</a>
            <a class="dropdown-item" href="#">登出</a>
        </div>
    </div>

    <form class="form-inline navbar-form pull-left">
        <input class="form-control" type="text" placeholder="搜索">
    </form>
</nav>
<%-- 一级导航栏结束 --%>
<%-- 主体开始 --%>
<div class="container-fluid">
    <%-- 二级标题开始 --%>
    <div class="row">
        <div class="col-md-1">
            <a href="" class="text-center">Java</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">JavaScript</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">Go</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">Linux</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">Node</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">React</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">Spring</a>
        </div>
        <div class="col-md-1">
            <a href="" class="text-center">ML</a>
        </div>
        <div class="col-md-4">
            <button type="button" class="btn btn-secondary">关注标签 <span>3</span></button>
            <button type="button" class="btn btn-secondary">关注用户 <span>5</span></button>
            <button type="button" class="btn btn-secondary">收藏帖子 <span>8</span></button>
        </div>
    </div>
    <%-- 二级标题结束 --%>

</div>

<%-- JQuery必须先引用 --%>
<script src="${ctx}/static/js/jquery.min.js"></script>
<%-- 然后是BootStrap --%>
<script src="${ctx}/static/js/bootstrap.min.js"></script>
</body>
</html>
