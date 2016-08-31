<%@page import="java.util.ArrayList"%>
<%@page import="lzh.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	User user = (User) session.getAttribute("user");
%>
<%
	if (user != null) {
		String a = user.getUsername();
		if (a != null) {
%><%=user.getUsername()%>
<%
	}
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function userLogin() {
		var username = $("#username").val();
		var password = $("#password").val();
		$("#uerror").text("");
		$("#perror").text("");
		if (username == "" || username == null) {
			$("#uerror").text("请输入用户名");
			return false;
		}
		if (password == "" || password == null) {
			$("#perror").text("请输入密码");
			return false;
		}
		//$("#checkLogin").submit();
	}
	function login1() {
		var path = "${pageContext.request.contextPath}";

		$.ajax({

			cache : false,//控制是否缓存数据（post请求默认false，而get请求会为true,容易造成页面数据缓存问题）

			type : "POST",//请求方式

			url : path + "/loginController.do",//请求地址

			async : false,//控制同步还是异步

			data : $("#checkLogin").serialize(),// 你的formid //传入参数
			success : function(mag) {
				if (mag != null && mag != "") {
					$("#checkLogin").hide(1000);
					$("#mag").html(mag);//从后台获取数据的回调函数
					var user = "0000";
					window.open(strURL);
					$("#password").show;
					$("#username").hide;
					$("#password").val(user);
				}
			}

		});
	}
</script>
</head>
<body>
	<h2></h2>

	<div id="mag"></div>
	<form id="checkLogin">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input id="username" type="text" name="userName"
					autocomplete="off" placeholder="请输入您的用户名" value="刘钊宏" /><span
					id="uerror" style="color:red"></span>
				</td>
			</tr>
			<tr>
				<td>密&nbsp;码：</td>
				<td><input id="password" name="password"
					autocomplete="off" placeholder="请输入您的密码"  /><span
					id="perror" style="color:red"></span>
				</td>
			</tr>
			<tr>
				<td><input id="login" type="button" value="登录"
					onclick="login1()" />
				</td>
			</tr>
		</table>

	</form>
	<!-- 	<form action="/Test/loginController.do" method="post">
			请输入用户ID:<input type="text" name="id">
			 <input type="submit" value="确定">  
		</form> -->

</body>
</html>
