<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person 2 Object</title>
</head>
<body>
<p id="demo"></p>

<script>
var person = {
    firstName: "John",
    lastName : "Doe",
    id       :  5566
};

document.getElementById("demo").innerHTML = person.firstName + " " + person["lastName"];
</script>
</body>
</html>