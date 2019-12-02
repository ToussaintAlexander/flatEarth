<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>For Loop</title>
</head>
<body>
<p>Click the button to loop through a block of code five times.</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    var text = "";
    var i;
    for (i = 0; i < 5; i++) {
        text += "The number is " + i + "<br>";
    }
    document.getElementById("demo").innerHTML = text;
}
</script>
</body>
</html>