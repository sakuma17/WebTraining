<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%
request.setCharacterEncoding("UTF-8");
String[] oss=request.getParameterValues("os");
String str="";
if(oss==null){
	str="選択なし";
}else{
	for(String s:oss){
	str+=s+",";
	}
	str=str.substring(0,str.length()-1);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%=str %></p>
</body>
</html>