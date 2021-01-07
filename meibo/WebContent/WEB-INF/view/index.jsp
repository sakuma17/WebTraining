<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" import="model.Person" %>
<%
	List<Person> list=(List<Person>)application.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<title>名簿</title>
</head>
<body>
<div class="container">
<table class="table table-striped table-bordered table-dark">
<% for(Person p:list){ %>
<tr>
<td><%=p.getName() %></td>
<td><%=p.getfName() %></td>
<td><%=p.getGender() %></td>
<td><%=p.getBloodType() %></td>
</tr>
<%} %>
</table>
</div>

</body>
</html>