<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unshift Method</title>
</head>
<body>
	<p>The unshift method adds new elements to the beginning of an
		array.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits;

		function myFunction() {
			fruits.unshift("Lemon");
			document.getElementById("demo").innerHTML = fruits;
		}
	</script>

	<p>
		<b>Note:</b> The unshift() method does not work properly in Internet
		Explorer 8 and earlier, the values will be inserted, but the return
		value will be <em>undefined</em>.
	</p>
</body>
</html>