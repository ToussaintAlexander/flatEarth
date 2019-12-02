<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Object Collections</title>
</head>
<body>
	<form id="frm1" action="form_action.asp">
		First name: <input type="text" name="fname" value="Donald"><br>
		Last name: <input type="text" name="lname" value="Duck"><br>
		<br> <input type="submit" value="Submit">
	</form>

	<p>Click "Try it" to display the value of each element in the form.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var x = document.getElementById("frm1");
			var text = "";
			var i;
			for (i = 0; i < x.length; i++) {
				text += x.elements[i].value + "<br>";
			}
			document.getElementById("demo").innerHTML = text;
		}
	</script>
</body>
</html>