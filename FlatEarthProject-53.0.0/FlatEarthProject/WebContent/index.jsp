<!-- HEADER -->

<jsp:include page="/include/pageHeader/pageHeader.jsp" />

<!-- Include Core Tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!-- Include Functions Tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
     
<!-- Include Format Tags -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     
<!-- Include SQL Tags -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!-- Include XML Tags -->
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Flat Earth Login Form</title>
</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Flat Earth Login</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form name="actionForm" action="AuthenticationServlet" method="get">

				<div style="position: absolute; top:180px; left:25px; width:400px; height:25px">
					<h3>Please Enter Your Credentials:</h3>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/welcomeDate.jsp" />

				<!-- Flat Earth Logo -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- USERNAME -->
				
				<div style="position: absolute; top:260px; left:200px; width:200px; height:25px">
					Username
				</div> 
				
				<div style="position: absolute; top:260px; left:280px; width:200px; height:25px">
					
					<select name="username">
					
						<option>TAlexand</option>
						<option selected="selected">MeiChang</option>
						<option>MMatsuko</option>
						
					</select> 
					
				</div> 

				<!-- PASSWORD -->
				
				<div style="position: absolute; top:290px; left:200px; width:200px; height:25px">
 					Password
				</div>
				
				<div style="position: absolute; top:290px; left:280px; width:200px; height:25px">
					
					<select name="password">
					
						<option>secret1</option>
						<option selected="selected">secret2</option>
						<option>secret3</option>
						
					</select> 
					
				</div>
				
				<!-- DOMAIN -->
				
				<div style="position: absolute; top:320px; left:200px; width:200px; height:25px">
 					Domain:
				</div>
				
				<div style="position: absolute; top:320px; left:280px; width:200px; height:25px">
				
					<select name="domain">
					
						<option>Engineer</option>
						<option selected="selected">Management</option>
						<option>Client</option>
						
					</select> 
					
				</div>
		
				<!-- REMEMBER ME -->
				
				<div style="position: absolute; top:350px; left:200px; width:200px; height:25px">
 					<input type="checkbox" name="rememberMe" value="No"></input> 
				</div>
				
				<div style="position: absolute; top:350px; left:230px; width:500px; height:25px">
					Remember Me
				</div> 

				<!-- I FORGOT MY USERNAME/PASSWORD -->
		
				<div style="position: absolute; top:380px; left:200px; width:500px; height:25px">
					<h5><a href="ForgotUsernamePassword.htm">Forgot My Username/Password</a></h5>
				</div>

				<!-- CREATE MY FLATEARTH ACCOUNT -->
		
				<div style="position: absolute; top:410px; left:200px; width:500px; height:25px">
					<h5><a href="CreateFlatEarthAccount.htm">Create My FlatEarth Account</a></h5>
				</div>
		
				<!-- BUTTON PANEL -->	
											
				<div style="position: absolute; top:480px; left:230px; width:500px; height:25px">
					<input	type="submit" name="submitAction" value="Login" ></input>	
				</div> 	
				
				<div style="position: absolute; top:480px; left:300px; width:500px; height:25px">
					<input	type="reset" name="submitAction" value="Reset" ></input>	
				</div> 	
				
				<!-- LINE DELIMITER -->
				
				<div style="position: absolute; top:640px; left:30px; width:600px; height:25px">
					______________________________________________________________________
				</div> 	
				
				<!-- VERSION NUMBER -->
				
				<div style="position: absolute; top:670px; left:30px; width:600px; height:25px">
					Version: 1.00
				</div> 	
							
			</form>

		</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
	</div>

</body>
</html>