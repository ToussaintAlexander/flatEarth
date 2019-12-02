<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Number to String</title>
</head>
<body>
	<p>Remove the comment (at the beginning of the lines) to test each
		case:</p>

	<p id="demo"></p>

	<script>
		var x = 5;
		//x = 5 + 7;         // x.valueOf() is 12, typeof x is a number
		//x = 5 + "7";       // x.valueOf() is 57, typeof x is a string
		//x = "5" + 7;       // x.valueOf() is 57, typeof x is a string
		//x = 5 - 7;         // x.valueOf() is -2, typeof x is a number
		//x = 5 - "7";       // x.valueOf() is -2, typeof x is a number
		//x = "5" - 7;       // x.valueOf() is -2, typeof x is a number
		//x = 5 - "x";       // x.valueOf() is NaN, typeof x is a number

		document.getElementById("demo").innerHTML = x.valueOf() + " "
				+ typeof x;
	</script>
</body>
</html>