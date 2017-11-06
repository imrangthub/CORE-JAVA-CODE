<%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delate | page</title>
</head>
<body>

<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/core_java" 
                    user="root"  password="admin" /> 

   <sql:update dataSource="${ dbsource }" var="QueryResult">
    DELETE FROM `jstl_crud` WHERE id= '${ param.id }'
   </sql:update>
    
     <c:if test="${ QueryResult >=1 }">
     <font size="5" color="green">Successfully Delated data.</font>
     <a href="show.jsp">Go to Back</a>
     </c:if>




</body>
</html>