<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Prototype Property</title>
</head>
<body>
<p id="demo"></p>

<script>
function person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
}
person.prototype.nationality = "English";

var myFather = new person("John", "Doe", 50, "blue");
document.getElementById("demo").innerHTML =
"My father is " + myFather.nationality; 
</script>
</body>
</html>