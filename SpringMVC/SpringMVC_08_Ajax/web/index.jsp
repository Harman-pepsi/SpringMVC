<%--
  Created by IntelliJ IDEA.
  User: XJC·AW
  Date: 2020/8/31
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
    <title>Index</title>
    <script type="application/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
      function a1(){
        $.post({
          url:"${pageContext.request.contextPath}/controller/testJson1",
          data:{'name':$("#username").val()},
          success:function (data,status) {
            alert(data);
            alert(status);
          }
        });
      }
    </script>
  </head>
  <body>
    用户名:<input id="username" type="text" onblur="a1()">
  </body>
</html>
