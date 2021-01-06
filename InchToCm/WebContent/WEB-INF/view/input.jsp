<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力</title>
</head>
<body>
<form action="/InchToCm/ItoC" method="post">
インチを入力<input type="text" name="inch" step="0.01" min="0.0">
<input type="submit" value="送信">
</form>

</body>
</html>