<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.Avatar" import="model.StatusLogic"%>
<%
Avatar avatar=(Avatar)request.getAttribute("avatar");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first_status</title>
</head>
<body>
<p>初期ステータスが決定しました</p>
<p><%=StatusLogic.displayStatus(avatar) %></p>
<form action="/selfintro/phase2" method="post">
種族を選んでください<br>
<label><input type="radio" name="raceNum" value="0">人間</label>
<label><input type="radio" name="raceNum" value="1">ハイエルフ</label>
<label><input type="radio" name="raceNum" value="2">トロル</label>
<label><input type="radio" name="raceNum" value="3">ノーム</label>
<input type="hidden" name="name" value="<%=avatar.getName() %>">
<input type="hidden" name="hp" value="<%=avatar.getHp() %>">
<input type="hidden" name="mp" value="<%=avatar.getMp() %>">
<input type="hidden" name="power" value="<%=avatar.getPower() %>">
<input type="hidden" name="dex" value="<%=avatar.getDex() %>">
<input type="hidden" name="spd" value="<%=avatar.getSpd() %>">
<input type="submit" value="決定">
</form>

</body>
</html>