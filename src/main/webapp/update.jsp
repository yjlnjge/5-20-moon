<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<body>
<form method="post" action="update">
    <input type="hidden" value="${good1.id}" name="id"><br>
    日期<input type="text" name="date" value="<fmt:formatDate value="${good1.date}" type="date"/>"><br>
    价格<input type="text" name="price" value="${good1.price}"><br>
    名称<input type="text" name="name" value="${good1.name}"><br>
    <input type="submit" value="确认">
</form>

</body>
</html>