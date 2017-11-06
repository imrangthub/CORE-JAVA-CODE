<%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit | data</title>
</head>
<body>
<h1>Update your data</h1>
<hr/>

<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/core_java" 
                    user="root"  password="admin" />
                    
   <sql:query var="tempResult" dataSource="${ dbsource }">
     SELECT * FROM `jstl_crud` WHERE `id` = ?;
     <sql:param value="${ param.id }" />
   </sql:query>
                    
                    
 <form action="update.jsp" method="post">
<fieldset>
<legend>Current data</legend>

<table>

<c:forEach var="row" items="${tempResult.rows }">

<tr>
<td>Book Title: </td>
<td><input type="text" name="title" value="${row.title }" /></td>
</tr>
<tr>
<td>Book Authority: </td>
<td><input type="text" name="authority" value="${row.authority }" /></td>
</tr>
 <input type="hidden" name="id" value="${ param.id }" />

</c:forEach>

<tr>
<td></td>
<td><input type="submit" value="Update Now" /></td>
</tr>
</table>

</fieldset>
</form>



</body>
</html>