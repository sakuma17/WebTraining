<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Vegetable,java.util.*"%>
<%
	List<Vegetable>list=(List<Vegetable>)session.getAttribute("list");
	String error=(String)request.getAttribute("error");
	String message=(String)request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>商品をカートに入れてください</p>
<%
	if(error!=null){
%>
	<div>
	<%=error%>
	</div>
<%
	}
%>
<%
	if(message!=null){
%>
	<div>
	<%=message%>
	</div>
<%
	}
%>
<form action="/vegecart/Main" method="post">
商品名:<br>
<input type="text" name="name"><br>
価格:<br>
<input type="text" name="price"><br>
<input type="submit" value="カートに追加">
</form>
<%
	if(list!=null &&list.size()>0){
%>
	<table>
	<tr><th>商品名</th><th>価格</th></tr>
	<%
		for(Vegetable v:list){
	%>
		<tr>
			<td><%=v.getName() %></td>
			<td><%=v.getPrice() %></td>
		</tr>
	<%} %>
	</table>
<%} %>

</body>
</html>