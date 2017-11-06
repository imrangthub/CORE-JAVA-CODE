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
<title>Insert | User</title>
</head>
<body>
<h2>Add new User</h2>
<hr/>

<form action="../../StartingJsp_00/UserControllerServlate" method="POST">
<%
String action = request.getParameter("action");
 System.out.println(action);
%>


<table>
<tr>
<th>User Name: </th>
<%
if(action.equalsIgnoreCase("edit")) { %>
	<td><input type="text" name="userName" value="<c:out value="${ userById.getUserName()}" />" /></td>
<% } else { %>
<td><input type="text" name="userName" /></td>
<% } %>
</tr>
<tr>
<th>User Email: </th>
<%
  if(action.equalsIgnoreCase("edit")) { %>
 <td><input type="text" name="userEmail" value="<c:out value="${ userById.getEmail() }" />" readonly="readonly" /> [You can't change email]</td>
  
<% }else{ %>
<td><input type="text" name="userEmail" /></td>
<% } %>
</tr>
<tr>
<th>User Password: </th>
<%
if(action.equalsIgnoreCase("edit")) { %>
 <td><input type="text" name="userPassword" value="<c:out value="${ userById.getPassword() }" />" /> </td>
 
<%}else{ %>
<td><input type="password" name="userPassword" /></td>
<% } %>
</tr>
<tr>
<th></th>
<td><input type="submit" name="sub" value="SUBMIT NOW" /></td>
</tr>
</table>

</form>

</body>
</html>