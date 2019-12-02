<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pop Method</title>
</head>
<body>
	<p>The pop method removes the last element from an array.</p>

	<button onclick="myFunction()">Try it</button>

	<div id="demo" style="position: absolute; top:100px; left:200px; width:200px; height:25px"></div>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits;

		function myFunction() {
			fruits.pop();
			document.getElementById("demo").innerHTML = fruits;
		}
	</script>
</body>
</html>