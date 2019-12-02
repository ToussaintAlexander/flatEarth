<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fall Through</title>
</head>
<body>
<p>Click the button to display a message based on what day it is:</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    var text;
    switch (new Date().getDay()) {
        case 1:
        case 2:
        case 3:
        default:
            text = "Looking forward to the Weekend";
            break;
        case 4:
        case 5:
            text = "Soon it is Weekend";
            break;
        case 0:
        case 6:
            text = "It is Weekend";
    }
    document.getElementById("demo").innerHTML = text;
}
</script>
</body>
</html>