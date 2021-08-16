<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><html>
<head>
    <title>查询学生信息</title>
</head>
<body>
<div align="center">
    <input type="button" id="btn" value="查询数据">
    <table>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>email</td>
            <td>age</td>
        </tr>
        <c:forEach items="${allStud }" var="emp">
                <td>${emp.id }</td>
                <td>${emp.name }</td>
                <td>${emp.email }</td>
                <td>${emp.age }</td>
        </c:forEach>
    </table>
</div>
</body>
</html>