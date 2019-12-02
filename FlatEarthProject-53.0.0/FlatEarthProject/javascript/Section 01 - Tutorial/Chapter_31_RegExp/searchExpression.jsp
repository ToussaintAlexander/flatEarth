<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Expression</title>
</head>
<body>
<p>Search a string for "w3Schools", and display the position of the match:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    var str = "Visit W3Schools!"; 
    var n = str.search(/w3Schools/i);
    document.getElementById("demo").innerHTML = n;
}
</script>
</body>
</html>