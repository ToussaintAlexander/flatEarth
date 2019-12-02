<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Strings Example</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var carName1 = "Volvo XC60";
		var carName2 = 'Volvo XC60';
		var answer1 = "It's alright";
		var answer2 = "He is called 'Johnny'";
		var answer3 = 'He is called "Johnny"';

		document.getElementById("demo").innerHTML = carName1 + "<br>"
				+ carName2 + "<br>" + answer1 + "<br>" + answer2 + "<br>"
				+ answer3;
	</script>

</body>
</html>