<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	int[][] nums=new int[9][9];
	for(int i=0;i<nums.length;i++){
		for(int j=0;j<nums[i].length;j++){
			nums[i][j]=(i+1)*(j+1);
		}
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<caption>九九表</caption>
<% for(int i=0;i<nums.length;i++){ %>
<tr>
	<% for(int j=0;j<nums[i].length;j++){%>
	<td><%=nums[i][j] %></td>
	<% } %>
</tr>
<%} %>
</table>

</body>
</html>