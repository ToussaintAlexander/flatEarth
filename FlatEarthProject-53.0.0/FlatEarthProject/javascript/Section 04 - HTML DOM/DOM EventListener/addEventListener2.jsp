<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Event Listener 2</title>
</head>
<body>
	<p>This example uses the addEventListener() method on the window
		object.</p>

	<p>Try resizing this browser window to trigger the "resize" event
		handler.</p>

	<p id="demo"></p>

	<script>
		window.addEventListener("resize", function() {
			document.getElementById("demo").innerHTML = Math.random();
		});
	</script>
</body>
</html>