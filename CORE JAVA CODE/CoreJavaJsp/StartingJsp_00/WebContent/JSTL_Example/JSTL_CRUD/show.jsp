<%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show | data</title>

 <script>
 function confirmGo (m,u){
	 if(confirm(m)){
		 window.location = u;
	 }
 }
 </script>

</head>
<body>
<h2 align="center">Book List</h2>
<hr/>

<font color="green">
<c:if test="${ not empty param.updateMsg }">
 <c:out value=" ${ param.updateMsg }" />
</c:if>
</font>

<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/core_java" 
                    user="root"  password="admin" />
   
   <sql:query dataSource="${ dbsource }" var="tempResult">
    SELECT * FROM `jstl_crud`;
   </sql:query>
   
<table style="border-style: solid;  width: 60%; margin: auto;">
<tr>
<th># Data Id</th><th>Book Title</th><th>Authority</th><th>Action</th>
</tr>

<c:forEach var="singleRow" items="${ tempResult.rows }">

 <tr>
  <td><c:out value="${ singleRow.id }" /></td>
  <td><c:out value="${ singleRow.title }" /></td>
  <td><c:out value="${ singleRow.authority }" /></td>
  <td>
  <a href="edit.jsp?id=<c:out value="${singleRow.id }" />">Edit</a> | 
  <a href="javascript:confirmGo('Delete this record, are you sure ?', 'delete.jsp?id=<c:out value="${ singleRow.id }" />')">Delete</a>
  </td>
 </tr>

</c:forEach>

</table>
<br/>
<a href="index.jsp">Go to Home.</a>

</body>
</html>