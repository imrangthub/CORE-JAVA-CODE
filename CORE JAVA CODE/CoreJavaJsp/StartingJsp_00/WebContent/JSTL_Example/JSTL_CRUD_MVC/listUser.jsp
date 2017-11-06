 <%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
 
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jstl | User List</title>
</head>
<body>
<h1 align="center">JSTL MVC CRUD</h1>
<hr/>

<h2>User List</h2>

<table style="width:60%; border-style: solid;">
<tr>
<th># User Id</th><th>User name</th><th>Email</th><th>Reg_data</th><th> Action </th>
</tr>

<c:forEach items="${ userList }" var="singleUser">
 <tr>
  <td><c:out value="${ singleUser.getId() }"></c:out></td>
 <td><c:out value="${ singleUser.getUserName() }"></c:out></td>
  <td><c:out value="${ singleUser.getEmail() }"></c:out></td>
  
  <td><fmt:formatDate pattern="dd MMM, yyyy" value="${ singleUser.getRegistrdtionDate()  }" /></td>
  <td>
   <a href="../../UserControllerServlate?action=edit&userId=<c:out value="${  singleUser.getId()}" />">Edit</a> |
   <a href="../../UserControllerServlate?action=delete&userId=<c:out value="${  singleUser.getId()}" />">Delete</a>
 </td>
  
 
 </tr>
</c:forEach>

</table>

<br/><br/>

<a href="../../UserControllerServlate?action=addUser">User Registration</a>



</body>
</html>