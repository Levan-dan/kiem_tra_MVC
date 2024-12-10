<%--
  Created by IntelliJ IDEA.
  User: This  PC
  Date: 10/12/2024
  Time: 2:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employees</h1>
<p>
    <a href="/customers?action=create">Create new Employee</a>
</p>
<table border="1">
    <tr>
        <td>Mã nhân viên</td>
        <td>Họ và tên</td>
        <td>Tuổi</td>
        <td>Vị trí</td>
        <td>Phòng ban</td>
        <td>Lương</td>
        <td>Hanh dong</td>
    </tr>
<%--    <c:forEach items="" var="employee">--%>
        <tr>
            <td><a>1</a></td>
            <td>Le van dan</td>
            <td>19</td>
            <td>Quan ly</td>
            <td>Giao Thong</td>
            <td>1000000</td>
        </tr>
<%--    </c:forEach>--%>
</table>

</body>
</html>
