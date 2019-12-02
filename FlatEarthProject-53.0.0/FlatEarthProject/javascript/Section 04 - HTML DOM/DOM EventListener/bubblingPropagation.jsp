<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bubbling Propagation</title>

<style>
div {
	background-color: coral;
	border: 1px solid;
	padding: 50px;
}
</style>

</head>
<body>

	<p>This example demonstrates the difference between bubbling and
		capturing when adding event listeners.</p>

	<div id="myDiv">
		<p id="myP">Click this paragraph, I am Bubbling.</p>
	</div>
	<br>

	<div id="myDiv2">
		<p id="myP2">Click this paragraph, I am Capturing.</p>
	</div>

	<script>
		document.getElementById("myP").addEventListener("click", function() {
			alert("You clicked the P element!");
		}, false);

		document.getElementById("myDiv").addEventListener("click", function() {
			alert("You clicked the DIV element!");
		}, false);

		document.getElementById("myP2").addEventListener("click", function() {
			alert("You clicked the P element!");
		}, true);

		document.getElementById("myDiv2").addEventListener("click", function() {
			alert("You clicked the DIV element!");
		}, true);
	</script>

</body>
</html>