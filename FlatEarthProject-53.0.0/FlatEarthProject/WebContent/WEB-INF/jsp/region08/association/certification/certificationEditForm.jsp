
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Certification Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Association: Certification Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
        
         		<!-- Processor Number -->
         
        		<div style="position: absolute; top:200px; left:20px; width:200px; height:25px">   
          			Processor Number :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:160px; width:200px; height:25px">
           			<form:input path="processorNumber" size="3" /> 
           		</div>
 
         		<!-- Processor Name -->
         
        		<div style="position: absolute; top:200px; left:270px; width:200px; height:25px">   
          			Processor Name :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:390px; width:200px; height:25px">
           			<form:input path="processorName" size="30" /> 
           		</div>
        
         		<!-- Project Manager -->
         
        		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">   
          			Project Manager :  
          		</div>
          
          		<div style="position: absolute; top:250px; left:160px; width:200px; height:25px">
           			<form:input path="projectManager" size="10" /> 
           		</div>
 
         		<!-- Processor Tester -->
         
        		<div style="position: absolute; top:250px; left:270px; width:200px; height:25px">   
          			Processor Tester :  
          		</div>
          
          		<div style="position: absolute; top:250px; left:390px; width:200px; height:25px">
           			<form:input path="processorTester" size="10" /> 
           		</div>
 
				<!-- Telephone Number 1 -->

           		<div style="position: absolute; top:275px; left:20px; width:200px; height:25px">
           			Telephone Number :   
           		</div>
           
          		<div style="position: absolute; top:275px; left:160px; width:200px; height:25px">
           			<form:input path="telephoneNumber1" size="10" /> 
          		</div>
 
 				<!-- Telephone Number 2 -->
                  
           		<div style="position: absolute; top:275px; left:270px; width:200px; height:25px">
           			Telephone Number : 
           		</div>
           
            	<div style="position: absolute; top:275px; left:390px; width:200px; height:25px">
           			<form:input path="telephoneNumber2" size="10" /> 
           		</div>
                
                <!-- Email Address 1 -->
                  
            	<div style="position: absolute; top:300px; left:20px; width:200px; height:25px">
           			Email Address :  
           		</div>
           
           		<div style="position: absolute; top:300px; left:160px; width:200px; height:25px"> 
           			<form:input path="emailAddress1" size="10" /> 
          		</div>
              
                <!-- Email Address 2 -->
                  
            	<div style="position: absolute; top:300px; left:270px; width:200px; height:25px">
           			Email Address :  
           		</div>
           
           		<div style="position: absolute; top:300px; left:390px; width:200px; height:25px"> 
           			<form:input path="emailAddress2" size="10" /> 
          		</div>

                <!-- Test Dates 1 -->
                  
            	<div style="position: absolute; top:350px; left:20px; width:200px; height:25px">
           			Test Dates 1 :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:160px; width:200px; height:25px"> 
           			<form:input path="testDates1" size="10" /> 
          		</div>
              
                <!-- Test Time 1 -->
                  
            	<div style="position: absolute; top:350px; left:270px; width:200px; height:25px">
           			Test Time 1 :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:390px; width:200px; height:25px"> 
           			<form:input path="testTime1" size="10" /> 
          		</div>
               
                <!-- Test Dates 2 -->
                  
            	<div style="position: absolute; top:375px; left:20px; width:200px; height:25px">
           			Test Dates 2 :  
           		</div>
           
           		<div style="position: absolute; top:375px; left:160px; width:200px; height:25px"> 
           			<form:input path="testDates2" size="10" /> 
          		</div>
              
                <!-- Test Time 2 -->
                  
            	<div style="position: absolute; top:375px; left:270px; width:200px; height:25px">
           			Test Time 2 :  
           		</div>

           		<div style="position: absolute; top:375px; left:390px; width:200px; height:25px"> 
           			<form:input path="testTime2" size="10" /> 
          		</div>
  
                <!-- cVV1 -->
                  
            	<div style="position: absolute; top:425px; left:20px; width:200px; height:25px">
           			Card Verify Value 1 :  
           		</div>
           
           		<div style="position: absolute; top:425px; left:160px; width:200px; height:25px"> 
           			<form:input path="cVV1" size="1" /> 
          		</div>
              
                <!-- iCVV -->
                  
            	<div style="position: absolute; top:425px; left:270px; width:200px; height:25px">
           			Integrated CVV :  
           		</div>
           
           		<div style="position: absolute; top:425px; left:390px; width:200px; height:25px"> 
           			<form:input path="iCVV" size="1" /> 
          		</div>
                                         
                <!-- cVV2 -->
                  
            	<div style="position: absolute; top:450px; left:20px; width:200px; height:25px">
           			Card Verify Value 1 :  
           		</div>
           
           		<div style="position: absolute; top:450px; left:160px; width:200px; height:25px"> 
           			<form:input path="cVV2" size="1" /> 
          		</div>
              
                <!-- dCVV -->
                  
            	<div style="position: absolute; top:450px; left:270px; width:200px; height:25px">
           			Dynamic CVV :  
           		</div>
           
           		<div style="position: absolute; top:450px; left:390px; width:200px; height:25px"> 
           			<form:input path="dCVV" size="1" /> 
          		</div> 
            
                <!-- New Processor -->
                  
            	<div style="position: absolute; top:500px; left:20px; width:200px; height:25px">
           			New Processor :  
           		</div>
           
           		<div style="position: absolute; top:500px; left:160px; width:200px; height:25px"> 
           			<form:input path="newProcessor" size="1" /> 
          		</div>
              
                <!-- Connectivity Only -->
                  
            	<div style="position: absolute; top:500px; left:220px; width:200px; height:25px">
           			Connectivity Only :  
           		</div>
           
           		<div style="position: absolute; top:500px; left:360px; width:200px; height:25px"> 
           			<form:input path="connectivityOnly" size="1" /> 
          		</div>
                                          
                <!-- Processor Upgrade -->
                  
            	<div style="position: absolute; top:500px; left:420px; width:200px; height:25px">
           			Processor Upgrade :  
           		</div>
           
           		<div style="position: absolute; top:500px; left:560px; width:200px; height:25px"> 
           			<form:input path="processorUpgrade" size="1" /> 
          		</div>
              
                <!-- Key Encryption Key -->
                  
            	<div style="position: absolute; top:525px; left:220px; width:200px; height:25px">
           			Key Encryption Key :  
           		</div>
           
           		<div style="position: absolute; top:525px; left:360px; width:200px; height:25px"> 
           			<form:input path="keyEncryptionKey" size="1" /> 
          		</div>
                                          
               <!-- Pinless Bill Pay -->
                  
            	<div style="position: absolute; top:525px; left:20px; width:200px; height:25px">
           			Pinless Bill Pay :  
           		</div>
           
           		<div style="position: absolute; top:525px; left:160px; width:200px; height:25px"> 
           			<form:input path="pinlessBillPay" size="1" /> 
          		</div>
              
                <!-- Fraud System -->
                  
            	<div style="position: absolute; top:525px; left:420px; width:200px; height:25px">
           			Fraud System :  
           		</div>
           
           		<div style="position: absolute; top:525px; left:560px; width:200px; height:25px"> 
           			<form:input path="fraudSystem" size="1" /> 
          		</div>
                                    
                <!-- Pin Validation -->
                  
            	<div style="position: absolute; top:550px; left:20px; width:200px; height:25px">
           			Pin Validation :  
           		</div>
           
           		<div style="position: absolute; top:550px; left:160px; width:200px; height:25px"> 
           			<form:input path="pinValidation" size="1" /> 
          		</div>
              
                <!-- eCommerce Supported -->
                  
            	<div style="position: absolute; top:550px; left:220px; width:200px; height:25px">
           			eCommerce Support :  
           		</div>
           
           		<div style="position: absolute; top:550px; left:360px; width:200px; height:25px"> 
           			<form:input path="eCommerceSupported" size="1" /> 
          		</div>
                                   
                <!-- Account To Account -->
                  
            	<div style="position: absolute; top:550px; left:420px; width:200px; height:25px">
           			Account To Account :  
           		</div>
           
           		<div style="position: absolute; top:550px; left:560px; width:200px; height:25px"> 
           			<form:input path="accountToAccount" size="1" /> 
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
