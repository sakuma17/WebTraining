<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Info"%>
<%
	Info info=(Info)request.getAttribute("info");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
<p><%=info.getInch() %>inchは<%=String.format("%.2f",info.getCm()) %>cmです。</p>
<a href="/InchToCm/ItoC">戻る</a>
</body>
</html>