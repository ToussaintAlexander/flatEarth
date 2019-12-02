<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Self-Invoking Function</title>
</head>
<body>
	<p>Functions can be invoked automatically without being called:</p>

	<p id="demo"></p>

	<script>
		(function() {
			document.getElementById("demo").innerHTML = "Hello! I called myself";
		})();
	</script>

</body>
</html>