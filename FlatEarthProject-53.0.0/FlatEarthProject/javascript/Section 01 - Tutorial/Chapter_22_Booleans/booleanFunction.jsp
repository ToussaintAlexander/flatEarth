<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Boolean Function</title>
</head>
<body>
<p>Display the value of Boolean(10 gt 9):</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>


<script>
function myFunction() {
    document.getElementById("demo").innerHTML = Boolean(10 > 9);
}
</script>
</body>
</html>