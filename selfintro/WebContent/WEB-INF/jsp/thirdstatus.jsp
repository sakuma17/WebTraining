<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.Avatar" import="model.StatusLogic"%>
<%
Avatar avatar=(Avatar)request.getAttribute("avatar");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>third_status</title>
</head>
<body>
<p><%=avatar.getJob() %>のボーナスが適用されました</p>
<p><%=StatusLogic.displayStatus(avatar) %></p>
<p>***作成成功***</p>
<p>私は<%=avatar.getJob() %>の<%=avatar.getRace() %>、<%=avatar.getName() %>です</p>
<p>能力値を高い順に並べると</p>
<p>です。今後ともよろしく</p>
</body>
</html>