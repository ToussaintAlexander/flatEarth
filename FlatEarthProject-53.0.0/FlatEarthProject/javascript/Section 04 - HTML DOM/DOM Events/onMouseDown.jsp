<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>On Mouse Down</title>
</head>
<body>
	<div onmousedown="mDown(this)" onmouseup="mUp(this)"
		style="background-color: #D94A38; width: 90px; height: 20px; padding: 40px;">
		Click Me</div>

	<script>
		function mDown(obj) {
			obj.style.backgroundColor = "#1ec5e5";
			obj.innerHTML = "Release Me";
		}

		function mUp(obj) {
			obj.style.backgroundColor = "#D94A38";
			obj.innerHTML = "Thank You";
		}
	</script>
</body>
</html>