<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<title>数据 - AdminLTE2定制版 | Log in</title>

	<meta
			content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
			name="viewport">
	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: Arial;
			font-size: 12px;
		}

		.body, .grad {
			position: absolute;
			width: 100%;
			height: 100%;
		}

		.body {
			background-image: url('img/background.jpg');
			background-size: cover;
			-webkit-filter: blur(5px);
			z-index: 0;
		}

		.grad {
			background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(0, 0, 0, 0)), color-stop(100%,
			rgba(0, 0, 0, 0.65))); /* Chrome,Safari4+ */
			z-index: 1;
			opacity: 0.7;
		}

		.header {
			position: absolute;
			top: calc(50% - 35px);
			left: calc(50% - 255px);
			z-index: 2;
		}

		.header div {
			float: left;
			color: #fff;
			font-family: 'Exo', sans-serif;
			font-size: 35px;
			font-weight: 200;
		}

		.header div span {
			color: #5379fa !important;
		}

		.login {
			position: absolute;
			top: calc(50% - 75px);
			left: calc(50% - 50px);
			height: 150px;
			width: 350px;
			padding: 10px;
			z-index: 2;
		}

		.login input[type=text] {
			width: 250px;
			height: 30px;
			background: transparent;
			border: 1px solid rgba(255, 255, 255, 0.6);
			border-radius: 2px;
			color: #fff;
			font-family: 'Exo', sans-serif;
			font-size: 16px;
			font-weight: 400;
			padding: 4px;
		}

		.login input[type=password] {
			width: 250px;
			height: 30px;
			background: transparent;
			border: 1px solid rgba(255, 255, 255, 0.6);
			border-radius: 2px;
			color: #fff;
			font-family: 'Exo', sans-serif;
			font-size: 16px;
			font-weight: 400;
			padding: 4px;
			margin-top: 10px;
		}

		.login input[type=submit] {
			width: 260px;
			height: 35px;
			background: #fff;
			border: 1px solid #fff;
			cursor: pointer;
			border-radius: 2px;
			color: #a18d6c;
			font-family: 'Exo', sans-serif;
			font-size: 16px;
			font-weight: 400;
			padding: 6px;
			margin-top: 10px;
		}

		/* 属性选择器 属性选择器在为不带有 class 或 id 的表单设置样式时特别有用：
        对带有指定属性的 HTML 元素设置样式。
        */
		.login input[type=button]:hover {
			opacity: 0.8;
		}

		.login input[type=button]:active {
			opacity: 0.6;
		}

		.login input[type=text]:focus {
			outline: none;
			border: 1px solid rgba(255, 255, 255, 0.9);
		}

		.login input[type=password]:focus {
			outline: none;
			border: 1px solid rgba(255, 255, 255, 0.9);
		}

		.login input[type=button]:focus {
			outline: none;
		}

		::-webkit-input-placeholder {
			color: rgba(255, 255, 255, 0.6);
		}

		::-moz-input-placeholder {
			color: rgba(255, 255, 255, 0.6);
		}
	</style>


</head>

<body>

<div class="body"></div>
<div class="grad"></div>
<div class="header">
	<div>Site<span>Random</span></div>
</div>
<form action="${pageContext.request.contextPath}/login" method="post">
	<div class="login" id="login">
		<input type="text" placeholder="用户名" name="username" v-model='account'><br>
		<input type="password" placeholder="密码" name="password" v-model='password'><br>
		<input type="submit" value="登录" @click='login()'>
	</div>
</form>
<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>

<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' // optional
        });
    });
</script>

</body>
</html>
