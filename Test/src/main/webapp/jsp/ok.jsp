<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<title>登录成功</title>

  </head>
  <a href="http://10.17.1.203:8080/Arthas/QuoteResultController?jsonStr='1234'">denglu</a>
  <body>
    OK!登录成功 <br>
  </body>
</html>
