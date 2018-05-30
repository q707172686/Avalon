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
<div class="container">
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="#">Avalon</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Go</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Java</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Linux</a>
            </li>
        </ul>
        <form class="form-inline navbar-form pull-right">
            <input class="form-control" type="text" placeholder="Search">
            <button class="btn btn-success-outline" type="submit">Search</button>
        </form>
    </nav>
</div>

<div class="container-fluid">
</div>

<%-- JQuery必须先引用 --%>
<script src="${ctx}/static/js/jquery.min.js"></script>
<%-- 然后是BootStrap --%>
<script src="${ctx}/static/js/bootstrap.min.js"></script>
</body>
</html>
