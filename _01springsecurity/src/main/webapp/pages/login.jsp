<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/17 0017
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/securityLogin" method="post">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password"/><br>
            <input type="submit" value="登录"/>
</form>
</body>
</html>
