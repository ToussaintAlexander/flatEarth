<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Negative Zero</title>
</head>
<body>
<p>Display the Boolean value of -0:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>


<script>
function myFunction() {
    var x = -0;
    document.getElementById("demo").innerHTML = Boolean(x);
}
</script>
</body>
</html>