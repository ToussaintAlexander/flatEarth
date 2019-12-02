<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lowest Value</title>
</head>
<body>
	<p>
		The lowest number is <span id="demo"></span>
	</p>

	<script>
		var points = [ 40, 100, 1, 5, 25, 10 ];
		points.sort(function(a, b) {
			return a - b
		});
		document.getElementById("demo").innerHTML = points[0];
	</script>
</body>
</html>