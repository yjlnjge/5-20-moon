<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<body>
    <form method="post" action="findGood">
        输入名称:<input type="text" name="name">
        </br><input type="submit" value="查询">
    </form>
    <a href="add.jsp">新增</a>
    <table border="1px">
        <tr>
            <th>编号</th>
            <th>日期</th>
            <th>价格</th>
            <th>名称</th>
            <th>名称</th>
            <th>名称</th>
        </tr>
        <c:forEach items="${goodList}" var="gd">
        <tr>
            <td>${gd.id}</td>
            <td>
<%--                <fmt:parseDate value="${gd.date}" var="d" pattern="yyyy-MM-dd"/>--%>
                <fmt:formatDate value="${gd.date}" pattern="yyyy-MM-dd"/></td>
            <td>${gd.price}</td>
            <td>${gd.name}</td>
            <td><a href="updateChange?id=${gd.id}">修改</a></td>
            <td><a href="delete?id=${gd.id}">删除</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>