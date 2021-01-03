<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Names" %>
<%
	Names names=(Names)session.getAttribute("Names");
	String[] fileNames=names.getNames();
	int [] nums=names.getNums();
	int [] opend=names.getOpend();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" href="css/main.css">
<title>jsp1</title>
</head>
<body>
<p class="title">星や背景の色が同じキャラがペア！めくりっぱなし神経衰弱</p>
<p class="pink">作者の力不足により、めくるだけのアプリケーションになってしまいました…</p>
	<form action="/2021app/start" method="post">
	<% for(int i=0;i<nums.length;i++){ %>
		<%if(opend[i]==0){ %>
			<button class="circle" type="submit" name="btn" value="<%=i %>"><img src="images/kuromon.png"></button>
		<%}else{ %>
			<img src="images/<%=fileNames[nums[i]] %>.png">
		<%} %>
	<% if(i!=0 &&(i+1)%4==0){ %><br><% } %>
	<%} %>
	</form>
</body>
</html>