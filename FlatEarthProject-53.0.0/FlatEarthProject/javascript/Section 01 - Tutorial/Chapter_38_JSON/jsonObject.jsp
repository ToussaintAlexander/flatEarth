<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSON Object</title>
</head>
<body>
	<h2>Create Object from JSON String</h2>

	<p id="demo"></p>

	<script>
		var text = '{"employees":[' + '{"firstName":"John","lastName":"Doe" },'
				+ '{"firstName":"Anna","lastName":"Smith" },'
				+ '{"firstName":"Peter","lastName":"Jones" }]}';

		obj = JSON.parse(text);
		document.getElementById("demo").innerHTML = obj.employees[1].firstName
				+ " " + obj.employees[1].lastName;
	</script>
</body>
</html>