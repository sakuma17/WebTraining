<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--form action無しの場合自分自身に送信 --%>
<form action="/formlesson3/os2.jsp" method="post">
お使いのOSを選んでください<br>
<input type="checkbox" name="os" value="Windows">Windows
<input type="checkbox" name="os" value="Mac">Mac
<input type="checkbox" name="os" value="Linux">Linux
<input type="submit" value="送信">
</form>
<%--submitに name="btn"を設定するとbtnのvalueも送信される(nullではない) --%>
</body>
</html>