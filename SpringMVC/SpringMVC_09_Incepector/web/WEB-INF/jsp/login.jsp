<%--
  Created by IntelliJ IDEA.
  User: XJC·AW
  Date: 2020/9/1
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/login">
    用户名:<input type="text" name="username"/>
    密码:<input type="text" name="password"/>
    <input type="submit" value="提交"/>
</form>
<a href="${pageContext.request.contextPath}/index.jsp">回到首页</a>
</body>
</html>
