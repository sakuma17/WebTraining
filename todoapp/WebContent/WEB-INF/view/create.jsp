<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todoapp</title>
</head>
<body>
<form action="/todoapp/Create" method="post">
Title:<input type="text" name="title"><br>
重要度:<select name="importance">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3" selected>3</option>
	<option value="4">4</option>
	<option value="5">5</option>
</select><br>
<button type="submit">登録</button>
</form>

</body>
</html>