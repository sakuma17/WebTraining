<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="main.css">
  <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
  <title>じゃんけんぽん</title>
</head>
<body>
  <form method="post">
    <label><input type="radio" name="hand" value="0">ぐー</label><br>
    <label><input type="radio" name="hand" value="1">ちょき</label><br>
    <label><input type="radio" name="hand" value="2">ぱー</label><br>
    <button type="submit" name="btn">ショウブ</button>
  </form>
  <% if(request.getParameter("hand")==null && request.getParameter("btn")!=null){ %>
  	<p>なにをだすかえらんでください</p>
  <% }else if(request.getParameter("btn")!=null){%>
  <%
  	int com_hand=new java.util.Random().nextInt(3);
  	int your_hand=Integer.parseInt(request.getParameter("hand"));
  	String result="";
  	int judge=(your_hand-com_hand+3)%3;
  	if(judge==0){
  		result="あいこです";
  	}else if(judge==2){
  		result="あなたのかちです";
  	}else{
  		result="あなたのまけです";
  	}
  	String[] hand={"gu","choki","pa"};
  	String yh=hand[your_hand];
  	String ch=hand[com_hand];
  %>
  <div>
  	<img src="images/<%=yh %>.png">
  	<img src="images/<%=ch %>.png">
  </div>
  <p><%=result %></p>
  <%} %>

</body>
</html>
