<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<!DOCTYPE html>
<%
Person person=(Person)request.getAttribute("person");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ConnectLesson/Update" method="post">
名前:<input type="text" name="name" value="<%=person.getName() %>"><br>
年齢:<input type="number" name="age" value="<%=person.getAge() %>"><br>
<input type="hidden" name="id" value="<%=person.getId() %>"><br>
<button type="submit">更新</button>
</form>
</body>
</html>