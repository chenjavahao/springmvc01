<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/23
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="goods/login" method="post">
    用户名:<input type="text" name="goodsName"/><br/>
    用户密码:<input type="password" name="goodsPwd"/><br/>
    <input type="submit" value="提交"/>
</form>
<a href="goods/login?goodsName=java&goodsPwd=abc">login</a>
</body>
</html>
