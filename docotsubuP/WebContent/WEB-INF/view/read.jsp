<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Mutter,java.util.*"%>
<%
	List<Mutter>list=(List<Mutter>)request.getAttribute("mutterList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>docotsubu</title>
</head>
<body>
<%if(list!=null){ %>
<table>
<%for(Mutter m:list){ %>
<tr>
<td></td>
</tr>
<%} %>
</table>
<%} %>

</body>
</html>