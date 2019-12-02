<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sort Array</title>
</head>
<body>
	<p>The sort() method sorts an array alphabetically.</p>

	<button onclick="myFunction()">Try it</button>
	<br>
	<button onclick="myFunction2()">Try it - 2</button>
	<br>
	
	<p id="demo1"></p>
	<br>
	<p id="demo2"></p>
	<br><br>
	
	<p id="demo3"></p>
	
	<script>
var fruits = ["Banana", "Orange", "Apple", "Mango"];
var trees = ["Redwood", "Oakwood", "Sycamore", "Pinewood"];

document.getElementById("demo1").innerHTML = fruits;

function myFunction() {
    fruits.sort();
    document.getElementById("demo2").innerHTML = fruits;
    
function myFunction2() {
    document.getElementById("demo3").innerHTML = trees;
    }
}


</script>
</body>
</html>