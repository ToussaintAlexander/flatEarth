<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
#myDIV {
	background-color: coral;
	border: 1px solid;
	padding: 50px;
	color: white;
}
</style>

</head>
<body>

	<div id="myDIV">
		This div element has an onmousemove event handler that displays a
		random number every time you move your mouse inside this orange field.
		<p>Click the button to remove the DIV's event handler.</p>
		<button onclick="removeHandler()" id="myBtn">Try it</button>
	</div>

	<p id="demo"></p>

	<script>
		document.getElementById("myDIV").addEventListener("mousemove",
				myFunction);

		function myFunction() {
			document.getElementById("demo").innerHTML = Math.random();
		}

		function removeHandler() {
			document.getElementById("myDIV").removeEventListener("mousemove",
					myFunction);
		}
	</script>

</body>
</html>