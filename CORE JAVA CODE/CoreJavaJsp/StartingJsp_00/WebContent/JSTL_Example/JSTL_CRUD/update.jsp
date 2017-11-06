<%@page import="java.io.*, java.util.*, java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>

<sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/core_java" 
                    user="root"  password="admin" />
                    
    <sql:update dataSource="${ dbsource }" var="queryResult">
     UPDATE `jstl_crud` SET `title` = ?, `authority`=? WHERE `id` = '${param.id }'
     <sql:param value="${ param.title }" />
     <sql:param value="${ param.authority }" />
    </sql:update>
    
     <c:if test="${ queryResult >= 1 }">
     
      <c:redirect url="show.jsp">
      <c:param name="updateMsg" value="Successfully Update." />
      </c:redirect>

     </c:if>



</body>
</html>