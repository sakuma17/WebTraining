<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String fortune=(String)request.getAttribute("ft");
String weather=(String)request.getAttribute("wt");
int comfortIndex=(Integer)request.getAttribute("ci");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>フォワードのサンプル</h1>
<p>フォワードされたページです</p>
<p><%=fortune %></p>
<p><%=weather %></p>
<p><%=comfortIndex %></p>
</body>
</html>