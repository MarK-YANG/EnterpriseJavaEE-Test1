<%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 4/28/15
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
  #table-2 {
    border: 1px solid #e3e3e3;
    background-color: #f2f2f2;
    width: 100%;
    border-radius: 6px;
    -webkit-border-radius: 6px;
    -moz-border-radius: 6px;
  }
  #table-2 td, #table-2 th {
    padding: 5px;
    color: #333;
  }
  #table-2 thead {
    font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
    padding: .2em 0 .2em .5em;
    text-align: left;
    color: #4B4B4B;
    background-color: #C8C8C8;
    background-image: -webkit-gradient(linear, left top, left bottom, from(#f2f2f2), to(#e3e3e3), color-stop(.6,#B3B3B3));
    background-image: -moz-linear-gradient(top, #D6D6D6, #B0B0B0, #B3B3B3 90%);
    border-bottom: solid 1px #999;
  }
  #table-2 th {
    font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 17px;
    line-height: 20px;
    font-style: normal;
    font-weight: normal;
    text-align: left;
    text-shadow: white 1px 1px 1px;
  }
  #table-2 td {
    line-height: 20px;
    font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
    font-size: 14px;
    border-bottom: 1px solid #fff;
    border-top: 1px solid #fff;
  }
  #table-2 td:hover {
    background-color: #fff;
  }
</style>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Welcome to toy store</title>
</head>
<body >
<h1>Product Category</h1>
<table id="table-2">
  <thead>
  <tr>
    <th>Code</th>
    <th>Description</th>
  </tr>
  </thead>
  <tbody>
  <%--<tr>--%>
    <%--<td><a href="http://">SW</a></td>--%>
    <%--<td>Software</td>--%>
  <%--</tr>--%>
  <%--<tr>--%>
    <%--<td><a href="http://">HW</a></td>--%>
    <%--<td>Hardware</td>--%>
  <%--</tr>--%>
  <c:forEach items="${codes}" var="var">
    <tr>
      <td><a href="/books/ShowProducts?action=code&code=${var.PROD_CODE}">${var.PROD_CODE}</a></td>
      <td>${var.DESCRIPTION}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<h1>All Manufacturers</h1>
<table id="table-2">
  <thead>
  <tr>
    <th>NAME</th>
    <th>ADDRESS</th>
    <th>CITY</th>
    <th>STATE</th>
    <th>ZIP</th>
    <th>PHONE</th>
    <th>FAX</th>
    <th>EMAIL</th>
  </tr>
  </thead>
  <tbody>
  <%--<tr>--%>
    <%--<td><a href="http://">Google</a></td>--%>
    <%--<td>7654 1st Street, Suite 100--%>
    <%--</td>--%>
    <%--<td>Mountain View</td>--%>
    <%--<td>CA</td>--%>
    <%--<td>94043</td>--%>
    <%--<td>650-456-6688</td>--%>
    <%--<td>408-456-9900</td>--%>
    <%--<td>www.google@gmail.com</td>--%>
  <%--</tr>--%>

  <c:forEach items="${manufacturers}" var="var">
    <tr>
      <td><a href="/books/ShowProducts?action=manu&manu=${var.MANUFACTURER_ID}">${var.NAME}</a></td>
      <td>${var.ADDRESSLINE1}, ${var.ADDRESSLINE2}</td>
      <td>${var.CITY}</td>
      <td>${var.STATE}</td>
      <td>${var.ZIP}</td>
      <td>${var.PHONE}</td>
      <td>${var.FAX}</td>
      <td>${var.EMAIL}</td>
    </tr>
  </c:forEach>

  </tbody>
</table>
<h1><a href="/books/ShowProducts">Show All Products</a></h1>

</body>
</html>

