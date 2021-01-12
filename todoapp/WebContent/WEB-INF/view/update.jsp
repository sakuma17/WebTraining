<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Todo"%>
<!DOCTYPE html>
<%
Todo todo=(Todo)request.getAttribute("todo");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Todoapp</title>
</head>
<body>
<form action="/todoapp/Update" method="post">
Title:<input type="text" name="title" value="<%=todo.getTitle() %>"><br>
重要度:<select name="importance">
<%for(int i=1;i<=5;i++){ %>
	<option value="<%=i %>" <%=todo.getImportance()==i?" selected ":"" %>><%=i %></option>
<%} %>
</select><br>
<input type="hidden" name="id" value="<%=todo.getId() %>"><br>
<button type="submit">更新</button>
</form>

</body>
</html>