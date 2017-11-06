<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert | jstl</title>
</head>
<body>

<form action="create.jsp" method="post">
<fieldset>
<legend>Insert Data</legend>

<table>
<tr>
<td>Book Title: </td>
<td><input type="text" name="title" /></td>
</tr>
<tr>
<td>Book Authority: </td>
<td><input type="text" name="authority" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="SAVE" /></td>
</tr>
</table>
</fieldset>
</form>
<br/>



<font color="red">
<c:set var="msg" value="${ param.errMsg }" scope="page" />
  
<c:if test="${ not empty msg }"> 
  <c:out value="${msg }" />
</c:if>
</font>


<font color="green">
<c:if test="${ not empty param.susMsg }">
 <c:out value=" ${ param.susMsg }" />
</c:if>
</font>

<br/>
<a href="index.jsp">Go back</a>


</body>
</html>