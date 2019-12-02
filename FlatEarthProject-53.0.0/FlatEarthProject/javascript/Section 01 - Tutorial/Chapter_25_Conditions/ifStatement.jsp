<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>If Statement</title>
</head>
<body>
<p>Display "Good day", only if the time is less than 20:00:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    if (new Date().getHours() < 20) {
        document.getElementById("demo").innerHTML = "Good day";
    }
}
</script>
</body>
</html>