<%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert | Data</title>
</head>
<body>


<c:if test="${ empty param.title or empty param.authority }">

  <c:redirect url="insert.jsp">
    <c:param name="errMsg" value="Please enter Book title and Authorty." />
  </c:redirect>
  
</c:if>

 <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/core_java" 
                    user="root"  password="admin" />
                    
 <sql:update dataSource="${ dbsource }" var="tempResult">
 
  INSERT INTO `jstl_crud` (`title`, `authority`) VALUES (?,?);
  <sql:param value="${ param.title }" />
  <sql:param value="${ param.authority }" />
  
 </sql:update>
 
  <c:if test="${ tempResult >=1 }">
   <font size="5" color="green">Successfully Insert Your data..! </font>
   <c:redirect url="insert.jsp">
    <c:param name="susMsg" value="Successfully Insert Your data..! " />
   </c:redirect>  
  </c:if>

 

















</body>
</html>