<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnMouse Over</title>
</head>
<body>
	<div onmouseover="mOver(this)" onmouseout="mOut(this)"
		style="background-color: #D94A38; width: 120px; height: 20px; padding: 40px;">
		First Mouse Over Me</div>

	<script>
		function mOver(obj) {
			obj.innerHTML = "Thank You"
		}

		function mOut(obj) {
			obj.innerHTML = "Mouse Over Me"
		}
	</script>
</body>
</html>