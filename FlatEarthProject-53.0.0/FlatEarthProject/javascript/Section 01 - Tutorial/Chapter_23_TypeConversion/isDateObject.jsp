<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Is Date Object</title>
</head>
<body>
<p>This "home made" function, when used on an date, returns true.</p>

<p id="demo"></p>

<script>
var myDate = new Date();
document.getElementById("demo").innerHTML = isDate(myDate);

function isDate(myDate) {
    return myDate.constructor.toString().indexOf("Date") > -1;
}
</script>
</body>
</html>