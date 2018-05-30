<%--
  Created by IntelliJ IDEA.
  User: Pino
  Date: 18-5-30
  Time: 下午4:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件测试</title>
</head>
<body>
<form action="/header" enctype="multipart/form-data" method="post">
    Header: <input type="file" accept="image/jpeg,image/png,image/gif" name="header"/>
    <input value="提交" type="submit"/>
</form>
</body>
</html>
