<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Browser Version Support</title>
</head>
<body>

	<p>The addEventListener() method is not supported Internet Explorer
		8 and earlier versions.</p>

	<p>This example demonstrates a solution that will work for all
		browsers.</p>

	<button id="myBtn">Try it</button>

	<script>
		var x = document.getElementById("myBtn");
		if (x.addEventListener) {
			x.addEventListener("click", myFunction);
		} else if (x.attachEvent) {
			x.attachEvent("onclick", myFunction);
		}

		function myFunction() {
			alert("Hello World!");
		}
	</script>


</body>
</html>