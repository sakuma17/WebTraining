<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User,model.Mutter,java.util.*"%>
<%
User loginUser=(User)session.getAttribute("loginUser");
List<Mutter>list=(List<Mutter>)request.getAttribute("mutterList");
String errorMsg=(String)request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<p>
<%=loginUser.getName() %>さん、ログイン中
<a href="/docoTsubuP/Logout">ログアウト</a>
</p>
<p><a href="/docoTsubuP/Main">更新</a></p>
<form action="/docoTsubuP/Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>
<% if(errorMsg!=null){ %>
	<p><%=errorMsg %></p>
<%} %>
<% if(list!=null&&list.size()>0){ %>
<table>
<tr>
<td>ID</td><td>NAME</td><td>TEXT</td>
</tr>
<%for(Mutter m:list){ %>
<tr>
<td><%=m.getId() %></td><td><%=m.getName() %></td><td><%=m.getText() %></td>
</tr>
<%} %>
</table>
<%} %>
</body>
</html>