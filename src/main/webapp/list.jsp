
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employees</h1>
<p>
    <a href="create.jsp">Create new Employee</a>
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
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.maNhanVien}</td>
            <td>${employee.hoVaTen}</td>
            <td>${employee.tuoi}</td>
            <td>${employee.viTriCongViec}</td>
            <td>${employee.phongBan}</td>
            <td>${employee.mucLuong}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
