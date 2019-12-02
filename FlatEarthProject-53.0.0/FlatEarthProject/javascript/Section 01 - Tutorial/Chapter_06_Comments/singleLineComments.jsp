<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 id="myH"></h1>
	<p id="myP"></p>

	<script>
		// Change heading:
		document.getElementById("myH").innerHTML = "My First Page";
		// Change paragraph:
		document.getElementById("myP").innerHTML = "My first paragraph.";
	</script>

	<p>
		<strong>Note:</strong> The comments are not executed.
	</p>

</body>
</html>