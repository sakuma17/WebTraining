<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%
List<Word> list=(List<Word>)request.getAttribute("list");
String searchWord=(String)request.getAttribute("searchWord");
searchWord=searchWord==null?"":searchWord;
String mode=(String)request.getAttribute("mode");
mode=mode==null?"":mode;
Integer total=(Integer)request.getAttribute("total");
Integer limit=(Integer)request.getAttribute("limit");
Integer pageNo=(Integer)request.getAttribute("pageNo");
String pagination=(String)request.getAttribute("pagination");
%>
<!DOCTYPE html>
<style>
.container{
min-height:calc(100vh - 70px);
}
form{
margin:20px auto;
}
input,select{
margin-right:5px;
}
.pager{
text-align:left;
}
.paginationBox{
text-align:center;
}
footer{
height:40px;
background:#347ab7;
color:white;
text-align:center;
line-height:40px;
margin-top:30px;
}
</style>
<html>
<head>
<meta charset="UTF-8">
<title>EJWord</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
<form action="/ejword/main" method="get" class="form-inline">
<input type="text" name="searchWord" value="<%=searchWord%>" class="form-control" placeholder="検索語を入力" required>
<select name="mode" class="form-control">
<option value="startsWith" <%=mode.equals("startsWith")?"selected":"" %>>で始まる</option>
<option value="contains" <%=mode.equals("contains")?"selected":"" %>>を含む</option>
<option value="endsWith"  <%=mode.equals("endsWith")?"selected":"" %>>で終わる</option>
<option value="match"  <%=mode.equals("match")?"selected":"" %>>と一致する</option>
</select>
<button type="submit" class="btn btn-primary">検索</button>
</form>
<% if(list !=null && list.size() > 0){ %>
<%-- 件数表示部分作成 --%>

<% if(total <= limit){ %>
	<p>全<%=total %>件</p>
<%}else{ %>
<%--ページ番号を利用して何件から何件を表示しているのかを表示する --%>
		<p>全<%=total %>件中 <%=(pageNo-1)*limit+1 %>~<%=pageNo*limit > total? total:pageNo*limit %>件を表示</p>
<%--ページ番号が１より大きかったら前へのリンクを表示 --%>
		<ul class="pager">
		<%if(pageNo > 1) {%>
		  <li><a href="/ejword/main?searchWord=<%=searchWord %>&mode=<%=mode %>&page=<%=pageNo-1%>"><span aria-hidden="true">&larr;</span>前へ</a></li>

		<%} %>
		<%--件数が全件数に届かないときは次へのリンクを表示 --%>
		<%if(pageNo*limit < total) {%>
		<li><a href="/ejword/main?searchWord=<%=searchWord %>&mode=<%=mode %>&page=<%=pageNo+1%>">次へ<span aria-hidden="true">&rarr;</span></a></li>

		<%} %>
		</ul>
<%} %>

<table border="1" class="table table-borderd table-striped">
<% for(Word w:list){ %>
<tr><th><%=w.getTitle() %></th><td><%=w.getBody() %></td></tr>
<%} %>
</table>
<%} %>
<%if(pagination!=null){ %>
	<%=pagination %>
<%} %>
</div>
<footer>&copy; 2017 Joytas.net</footer>
</body>
</html>