<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comparison Sign</title>
</head>
<body>
	<p>Remove the comment (at the beginning of each line) to test each
		case:</p>

	<p id="demo"></p>

	<script>
		var x;
		//x = (0 == "");     // true
		//x = (1 == "1");    // true
		//x = (1 == true);   // true
		  x = (0 === "");    // false
		//x = (1 === "1");   // false
		//x = (1 === true);  // false
		document.getElementById("demo").innerHTML = x;
	</script>

</body>
</html>