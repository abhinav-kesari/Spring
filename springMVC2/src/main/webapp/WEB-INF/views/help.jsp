<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>This is help page</h1>
<h1>Called by help</h1>
<h1>url /help</h1>
<%
        String sname = (String) request.getAttribute("sname");
        Integer idString = (Integer) request.getAttribute("sid");
        LocalDateTime time =  (LocalDateTime) request.getAttribute("time");

%>
<!--<%=sname%>-->
<h2>hiii ${sname}</h2>
<h2>     ${time}</h2>
<h2>     ${listA}</h2>

List using JSTL=>
<c:forEach var="item" items="${listA}" >
<h2>     ${item }</h2>
</c:forEach>


Time : <%=time.toString()%>





</body>
</html>