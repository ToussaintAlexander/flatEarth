
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Cardholder2 Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Cardholder2 Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="CardholderServiceImpl">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Cardholder2 List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:220px; left:25px; width:200px; height:25px">   
          			First Name :  
          		</div>
          
          		<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="firstName" size="20" /> 
           		</div>
 
           		<div style="position: absolute; top:220px; left:280px; width:200px; height:25px">
           			Initial :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:325px; width:200px; height:25px">
           			<form:input path="middleName" size="1"/> 
          		</div>
           
           		<div style="position: absolute; top:220px; left:365px; width:200px; height:25px"> 
          			Last Name :   
           		</div>
           
           		<div style="position: absolute; top:220px; left:450px; width:200px; height:25px">
           			<form:input path="lastName" /> 
          		</div>

				<!-- SOCIAL SECURITY -->

           		<div style="position: absolute; top:270px; left:20px; width:200px; height:25px">
           			Social Security :   
           		</div>
           
          		<div style="position: absolute; top:270px; left:120px; width:200px; height:25px">
           			<form:input path="socialSecurity" size="11" /> 
          		</div>
 
 				<!-- COMPANY -->
                  
           		<div style="position: absolute; top:320px; left:20px; width:200px; height:25px">
           			Company : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:120px; width:200px; height:25px">
           			<form:input path="company" /> 
           		</div>
                
                <!-- DEPARTMENT -->
                  
            	<div style="position: absolute; top:320px; left:280px; width:200px; height:25px">
           			Department :  
           		</div>
           
           		<div style="position: absolute; top:320px; left:365px; width:200px; height:25px"> 
           			<form:input path="department" /> 
          		</div>
                  
 				<!-- TITLE -->
                  
          		<div style="position: absolute; top:350px; left:20px; width:200px; height:25px">  
           			Title :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:120px; width:200px; height:25px"> 
           			<form:input path="title" /> 
          		</div>

				<!-- SALARY -->

          		<div style="position: absolute; top:350px; left:280px; width:200px; height:25px">
           			Salary :
           		</div>
           
           		<div style="position: absolute; top:350px; left:365px; width:200px; height:25px">   
           			<form:input path="salary" size="12" /> USD
         		</div>

				<!-- MARITAL STATUS -->

        		<div style="position: absolute; top:380px; left:20px; width:200px; height:25px">
          			Marital Status :   
          		</div>
          
          		<div style="position: absolute; top:380px; left:120px; width:200px; height:25px">
           			<form:input path="maritalStatus" size="10" /> 
            	</div>

				<!-- DATE OF BIRTH -->

            	<div style="position: absolute; top:380px; left:280px; width:200px; height:25px">
           			Birth Date :   
           		</div>
           
           		<div style="position: absolute; top:380px; left:365px; width:200px; height:25px">
           			<form:input path="dateOfBirth" size="7" /> 
          		</div>
          
				<!-- EDUCATION -->
          
            	<div style="position: absolute; top:410px; left:20px; width:200px; height:25px">
           			Education :   
          		</div>
           
           		<div style="position: absolute; top:410px; left:120px; width:200px; height:25px">
           			<form:input path="education" /> 
          		</div>
          
          		<!-- AGE -->
           
           		<div style="position: absolute; top:410px; left:280px; width:200px; height:25px">   
           			Age :   
           		</div>
           
           		<div style="position: absolute; top:410px; left:365px; width:200px; height:25px">
           			<form:input path="age" size="3'"/> Years
           		</div>
           
           		<!-- INTERESTS -->
           
           		<div style="position: absolute; top:460px; left:20px; width:200px; height:25px">
           			Interests :   
           		</div>
           
           		<div style="position: absolute; top:460px; left:120px; width:200px; height:25px">
           			<form:input path="interests" size="15"/> 
           		</div>
           
				<!-- USER NAME -->

           		<div style="position: absolute; top:510px; left:20px; width:200px; height:25px"> 
           			User Name :  
           		</div>
            
            	<div style="position: absolute; top:510px; left:120px; width:200px; height:25px">
           			<form:input path="userName" size="8" /> 
           		</div>
                       
            	<div style="position: absolute; top:510px; left:280px; width:200px; height:25px">
           			Secret :   
           		</div>
           
           		<div style="position: absolute; top:510px; left:365px; width:200px; height:25px">
           			<form:input path="secret" size="8" /> 
           		</div>

				<!-- USER ID -->
          
            	<div style="position: absolute; top:540px; left:20px; width:200px; height:25px">
           			User Id :   
           		</div>
           
           		<div style="position: absolute; top:540px; left:120px; width:200px; height:25px">
           			<form:input path="userId" size="7" /> 
          		</div>
     
           		<div style="position: absolute; top:540px; left:280px; width:200px; height:25px"> 
           			Clear Text :   
           		</div>
           
           		<div style="position: absolute; top:540px; left:365px; width:200px; height:25px">
           			<form:input path="clearTextPin" size="8" /> 
           		</div>
 
				<!-- INCLUDE FOOTPRINT -->

				<jsp:include page="/include/pageFooter/footprint.jsp" />

				<!-- INCLUDE BUTTON PANEL -->

				<!--  
				<jsp:include page="/include/pageFooter/buttonHeaderPanel.jsp" />
				-->
				
				<!-- LINE DELIMITER -->
				
				<div style="position: absolute; top:640px; left:20px; width:600px; height:25px">
					________________________________________________________________________
				</div> 																


				<div style="position: absolute; top:670px; left:20px; width:500px; height:25px">
					<input type="submit" value="Prv Rec"  name="submitAction"></input>
				</div>

				<div style="position: absolute; top:670px; left:130px; width:500px; height:25px">
					<input type="submit" value="Insert"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:220px; width:500px; height:25px">
					<input type="submit" value="Select"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:325px; width:500px; height:25px">
					<input type="submit" value="Update"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:433px; width:500px; height:25px">
					<input type="submit" value="Delete"  name="submitAction"></input>
				</div>

				<div style="position: absolute; top:670px; left:530px; width:500px; height:25px">
					<input type="submit" value="Nxt Rec"  name="submitAction"></input>
				</div>
				
      		</form:form> 

		</div>
 
		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
		</div>
		
</body>

</html>
