<%--
  Created by IntelliJ IDEA.
  User: XJC·AW
  Date: 2020/9/1
  Time: 1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h3>欢迎你:${sessionScope.loginUser}</h3> <br/>
    <a href="${pageContext.request.contextPath}/controller/loginOut">注销</a>
</body>
</html>
