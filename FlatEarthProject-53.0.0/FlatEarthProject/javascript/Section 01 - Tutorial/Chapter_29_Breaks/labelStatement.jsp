<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Break Label</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		cars = [ "BMW", "Volvo", "Saab", "Ford" ];
		text = "";

		list: {
			text += cars[0] + "<br>";
			text += cars[1] + "<br>";
			text += cars[2] + "<br>";
			break list;
			text += cars[3] + "<br>";
			text += cars[4] + "<br>";
			text += cars[5] + "<br>";
		}

		document.getElementById("demo").innerHTML = text;
	</script>
</body>
</html>