<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by home controller</h1>
<h1>url /home</h1>
<%   String name = (String) request.getAttribute("name");
        String idString = (String) request.getAttribute("id");
        Integer id = null;
        try {
            id = Integer.parseInt(idString);
        } catch (NumberFormatException e) {
            // Handle the case where the idString cannot be parsed as an Integer
        }
        List<String> fr = (List<String>) request.getAttribute("f");
        for(String s: fr){
%>
      <h2>  Friends is =  <%=s%> </h2>
<%
        }
%>

 <h2>  Name is =  <%=name%> </h2>
 <h2>  Id is =  <%=id%> </h2>


</body>
</html>
