
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Issuer Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Issuer Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Issuer List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
       
         		<!-- INTERNATIONAL BANK ACCOUNT NUMBER -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Int'l Bank Account Number :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:210px; width:200px; height:25px">
           			<form:input path="intlBankAccountNumber" size="34" /> 
           		</div>
 
         		<!-- BANK IDENTIFIER CODE -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Bank Identifier Code :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:210px; width:200px; height:25px">
           			<form:input path="bankIdentifierCode" size="11" /> 
           		</div>
        
         		<!-- BANK IDENTIFICATION NUMBER -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Bank Identification Number :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:210px; width:200px; height:25px">
           			<form:input path="bankIdentificationNumber" size="6" /> 
           		</div>
 
         		<!-- BANK NAME -->
         
        		<div style="position: absolute; top:310px; left:25px; width:200px; height:25px">   
          			Bank Name :  
          		</div>
          
          		<div style="position: absolute; top:310px; left:210px; width:200px; height:25px">
           			<form:input path="name" size="30" /> 
           		</div>
 
				<!-- STREET -->

           		<div style="position: absolute; top:360px; left:20px; width:200px; height:25px">
           			Street :   
           		</div>
           
          		<div style="position: absolute; top:360px; left:210px; width:200px; height:25px">
           			<form:input path="street" size="30" /> 
          		</div>
 
 				<!-- CITY -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			City : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:210px; width:200px; height:25px">
           			<form:input path="city" size="30" /> 
           		</div>
                
                <!-- STATE -->
                  
            	<div style="position: absolute; top:420px; left:20px; width:200px; height:25px">
           			State :  
           		</div>
           
           		<div style="position: absolute; top:420px; left:210px; width:200px; height:25px"> 
           			<form:input path="state" size="30" /> 
          		</div>
                  
 				<!-- COUNTRY -->
                  
          		<div style="position: absolute; top:450px; left:20px; width:200px; height:25px">  
           			Country :  
           		</div>
           
           		<div style="position: absolute; top:450px; left:210px; width:200px; height:25px"> 
           			<form:input path="country" size="3" /> 
          		</div>

				<!-- ZIP CODE -->

          		<div style="position: absolute; top:480px; left:20px; width:200px; height:25px">
           			Zip Code :
           		</div>
           
           		<div style="position: absolute; top:480px; left:210px; width:200px; height:25px">   
           			<form:input path="zipCode" size="10" />  
         		</div>

				<!-- TELEPHONE NUMBER -->

        		<div style="position: absolute; top:530px; left:20px; width:200px; height:25px">
          			Telephone :   
          		</div>
          
          		<div style="position: absolute; top:530px; left:210px; width:200px; height:25px">
           			<form:input path="phoneNumber" size="14" /> 
            	</div>

				<!-- INCLUDE FOOTPRINT -->

				<jsp:include page="/include/pageFooter/footprint.jsp" />

				<!-- INCLUDE COPYRIGHT -->

				<jsp:include page="/include/pageFooter/buttonHeaderPanel.jsp" />
				
      		</form:form> 

		</div>
 
		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
		</div>
		
</body>

</html>
