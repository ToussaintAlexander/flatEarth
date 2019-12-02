<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Attribute Value</title>
</head>
<body>
	<img id="image" src="smiley.gif" width="160" height="120">

	<script>
		document.getElementById("image").src = "landscape.jpg";
	</script>

	<p>The original image was smiley.gif, but the script changed it to
		landscape.jpg</p>
</body>
</html>