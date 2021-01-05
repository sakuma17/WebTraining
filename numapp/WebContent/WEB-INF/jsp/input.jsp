<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力</title>
</head>
<body>
<p>数字をカンマ区切りで入力してください</p>
<form action="/numapp/Main" method="post">
<input type="text" name="input"><br>
<input type="submit" value="送信">
</form>

</body>
</html>