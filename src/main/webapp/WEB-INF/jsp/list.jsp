<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2020/10/23
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询</h2>
<table border="1" width="600px">

        <th>编号</th><th>姓名</th><th>类型</th><th>价格</th><th>日期</th>

    <c:forEach items="${list}" var="goods">
        <tr>
        <td>${goods.id}</td><td>${goods.name}</td><td>${goods.typeid}</td>
        <td>${goods.price}</td><td>${goods.createtime}</td></tr>
    </c:forEach>
</table>
</body>
</html>
