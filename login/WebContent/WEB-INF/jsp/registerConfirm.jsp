<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User" %>
<!DOCTYPE html>
<% User registerUser=(User)session.getAttribute("registerUser"); %>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<p>下記のユーザーを登録します</p>
<p>
ログインID:<%=registerUser.getId() %>
名前:<%=registerUser.getName() %>
</p>
<a href="/login/RegisterUser">戻る</a>
<a href="/login/RegisterUser?action=done">登録</a>
<%--クエリパラメータ --%>

</body>
</html>