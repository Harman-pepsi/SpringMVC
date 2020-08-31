<%--
  Created by IntelliJ IDEA.
  User: XJC·AW
  Date: 2020/9/1
  Time: 0:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
    <h2>Admin:Welcome ${loginUser}</h2><br/>
    <a href="${pageContext.request.contextPath}/controller/loginOut">注销</a>
</body>
</html>
