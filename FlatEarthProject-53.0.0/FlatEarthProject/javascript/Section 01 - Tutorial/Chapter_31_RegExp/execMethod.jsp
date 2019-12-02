<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exec Method</title>
</head>
<body>
<p>Search for an "e" in the next paragraph:</p>

<p id="p01">The best things in life are free!</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    text = document.getElementById("p01").innerHTML; 
    document.getElementById("demo").innerHTML = /e/.exec(text);
}

</script>
</body>
</html>