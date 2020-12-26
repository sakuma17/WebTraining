<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="model.Avatar" import="model.StatusLogic"%>
<%
Avatar self=(Avatar)request.getAttribute("self");
int[] status=self.getStatus();
String st=StatusLogic.displayStatus(status);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first_status</title>
</head>
<body>
<p>初期ステータスが決定しました</p>
<p><%=st %></p>
<form action="/selfintro/phase2" method="post">
種族を選んでください<br>
<label><input type="radio" name="race" value="0">人間</label>
<label><input type="radio" name="race" value="1">ハイエルフ</label>
<label><input type="radio" name="race" value="2">トロル</label>
<label><input type="radio" name="race" value="3">ノーム</label>
<input type="hidden" name="status" value="<%=status %>">
<input type="submit" value="決定">
</form>

</body>
</html>