<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Object - Bad</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var x1 = {};
		var x2 = "";
		var x3 = 0;
		var x4 = false;
		var x5 = [];
		var x6 = /()/;
		var x7 = function() {
		};

		document.getElementById("demo").innerHTML = "x1: " + typeof x1 + "<br>"
				+ "x2: " + typeof x2 + "<br>" + "x3: " + typeof x3 + "<br>"
				+ "x4: " + typeof x4 + "<br>" + "x5: " + typeof x5 + "<br>"
				+ "x6: " + typeof x6 + "<br>" + "x7: " + typeof x7 + "<br>";
	</script>
</body>
</html>