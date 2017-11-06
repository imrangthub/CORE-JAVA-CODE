<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>simple | example</title>
</head>
<body>
<h2 align="center">Test simple JSTL</h2>
<hr/>

<%= "Hello" %>

<br/><br/><br/>

<c:out value="MD IMRAN HOSSAIN"  default="hi" />
<br/><br/><br/>

<!-- variable declaration -->
<c:set var="stName" value="BABU"></c:set>
<c:out value = "${stName }" />

<br/><br/><br/><br/>



<!-- for Dynamic value -->

<c:set var="userName" value="${param.userName }"></c:set>
<c:out value = "${userName }" />

<form action="" method="post">
<input type="text" name="userName"/>
<input type="submit"/>
</form>
<br/><br/><br/><br/>

<!-- forEach loop -->

<c:forEach var="i" begin="0" end="${param.userName }" step="2">
  
  <c:out value="${ i }"></c:out>
  
</c:forEach>

<br/><br/><br/><br/>
<!-- forEach loop with Items -->
<%
List<String> cityList = new ArrayList<String>();
cityList.add("Dhaka");
cityList.add("Shariatpur");
cityList.add("Gazipur");
request.setAttribute("cityList", cityList);

%>

<%=cityList %>
<br/>
${cityList[1] }

<ul>
 <c:forEach items="${cityList}" var="singleCity">
  <li><c:out value="${singleCity}"/></li>
 </c:forEach>
</ul>

<c:forEach var="singleCity" items = "${ cityList }" >
   <c:out value ="${ singleCity }" />
</c:forEach>

<!-- Another forEach -->
<%
 ArrayList list = new ArrayList();
 list.add("Dhaka,Damudya,Borisal");
 list.add("NewYourk, Varginaya");
 request.setAttribute("list", list);
%>


<h1>Iterating over ArrayList</h1>
<ul>
 <c:forEach items="${list}" var="value">
  <li><c:out value="${value}"/></li>
 </c:forEach>
</ul>

<h1>Iterating over first element of ArrayList</h1>
<ul>
 <c:forEach items="${list[0]}" var="value">
  <li><c:out value="${value}"/></li>
 </c:forEach>
</ul>

<!-- If -->
<c:if test="${ 5>4 }">
<h1>true</h1>
</c:if>




</body>
</html>