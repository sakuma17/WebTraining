<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.Avatar" import="model.StatusLogic"%>
<%
Avatar avatar=(Avatar)request.getAttribute("avatar");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second_status</title>
</head>
<body>
<p><%=avatar.getRace()%>のボーナスが適用されました</p>
<p><%=StatusLogic.displayStatus(avatar) %></p>
<form action="/selfintro/phase3" method="post">
職業を選んでください<br>
<label><input type="radio" name="jobNum" value="0">戦士</label>
<label><input type="radio" name="jobNum" value="1">盗賊</label>
<label><input type="radio" name="jobNum" value="2">僧侶</label>
<label><input type="radio" name="jobNum" value="3">魔術師</label>
<input type="hidden" name="name" value="<%=avatar.getName() %>">
<input type="hidden" name="raceNum" value="<%=avatar.getRaceNum() %>">
<input type="hidden" name="hp" value="<%=avatar.getHp() %>">
<input type="hidden" name="mp" value="<%=avatar.getMp() %>">
<input type="hidden" name="power" value="<%=avatar.getPower() %>">
<input type="hidden" name="dex" value="<%=avatar.getDex() %>">
<input type="hidden" name="spd" value="<%=avatar.getSpd() %>">
<input type="submit" value="決定">
</form>

</body>
</html>