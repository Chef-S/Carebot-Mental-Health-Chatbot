<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<style>
.button {
	display: inline-block;
	border-radius: 4px;
	background-color: #008CBA;
	border: none;
	color: #FFFFFF;
	text-align: center;
	font-size: 28px;
	padding: 20px;
	width: 200px;
	transition: all 0.5s;
	cursor: pointer;
	margin: 5px;
}

.button span {
	cursor: pointer;
	display: inline-block;
	position: relative;
	transition: 0.5s;
}

.button span:after {
	content: '\00bb';
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

.button:hover span {
	padding-right: 25px;
}

.button:hover span:after {
	opacity: 1;
	right: 0;
}
</style>
</head>
<body background="background.png">
	<center>
		<img src="ChatbotLogo2.png" alt="Logo" width="400" height="332">
	</center>

	<h1 align="center">
		<font face="Comic sans MS" size="10">Carebot</font>
	</h1>
	<h1 align="center">
		<font face="Comic sans MS" size="5">How are you feeling today?</font>
	</h1>
	<br>
	<center>
	<form method="get" action="http://localhost:9002/CareBot/Registration_Page.jsp"> 
		<button class="button" style="vertical-align: middle">
			<span>CareBot</span>
		</button>
		</form>
	</center>
</body>
</html>