<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>By ClassName</title>
<style>
.mystyle {
	width: 300px;
	height: 100px;
	background-color: coral;
	text-align: center;
	font-size: 25px;
	color: white;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<p>Click the button to set a class for div.</p>

	<div id="myDIV">I am a DIV element</div>

	<button onclick="myFunction()">Try it</button>

	<script>
		function myFunction() {
			document.getElementById("myDIV").className = "mystyle";
		}
	</script>
</body>
</html>