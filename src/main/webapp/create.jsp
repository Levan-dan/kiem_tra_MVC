<%--
  Created by IntelliJ IDEA.
  User: This  PC
  Date: 10/12/2024
  Time: 2:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new customer</h1>

<p>
  <a href="list.jsp">Back to customer list</a>
</p>
<form method="post">
  <fieldset>
    <legend>Employee information</legend>
    <table>
      <tr>
        <td>Ma: </td>
        <td><input type="text" name="ma" id="ma"></td>
      </tr>
      <tr>
        <td>Ho ten: </td>
        <td><input type="text" name="hoTen" id="hoTen"></td>
      </tr>
      <tr>
        <td>Tuoi: </td>
        <td><input type="text" name="tuoi" id="tuoi"></td>
      </tr>
      <tr>
        <td>Vi tri: </td>
        <td><input type="text" name="viTri" id="viTri"></td>
      </tr>
      <tr>
        <td>Phong ban: </td>
        <td><input type="text" name="phongBan" id="phongBan"></td>
      </tr>
      <tr>
        <td>Luong : </td>
        <td><input type="text" name="luong" id="luong"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Create"></td>
      </tr>
    </table>
  </fieldset>
</form>

</body>
</html>
