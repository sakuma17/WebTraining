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
<p>ボーナスが適用されました</p>
<p><%=st %></p>
<form action="/selfintro/phase2" method="post">
職業を選んでください<br>
<label><input type="radio" name="job" value="0">戦士</label>
<label><input type="radio" name="job" value="1">盗賊</label>
<label><input type="radio" name="job" value="2">僧侶</label>
<label><input type="radio" name="job" value="3">魔術師</label>
<input type="hidden" name="status" value=<%=status %>>
<input type="submit" value="決定">
</form>

</body>
</html>