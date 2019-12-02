
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Credit Detail Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Credit Detail Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/cardholderEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:220px; left:25px; width:200px; height:25px">   
          			primaryAccountNumber :  
          		</div>
          
          		<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
 				<!-- Primary Account Number Sequence -->
 
           		<div style="position: absolute; top:220px; left:280px; width:200px; height:25px">
           			Sequence :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:325px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- Closing Date -->
           
           		<div style="position: absolute; top:250px; left:365px; width:200px; height:25px"> 
          			Closing Date :   
           		</div>
           
           		<div style="position: absolute; top:250px; left:450px; width:200px; height:25px">
           			<form:input path="closingDate" /> 
          		</div>

				<!-- Bank Name -->

           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Bank Name :   
           		</div>
           
          		<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="bankName" size="30" /> 
          		</div>
 
 				<!-- associationName -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Association Name : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="associationName" size="30" /> 
           		</div>
                
                <!-- Transaction Date -->
                  
            	<div style="position: absolute; top:340px; left:280px; width:200px; height:25px">
           			Transaction Date :  
           		</div>
           
           		<div style="position: absolute; top:340px; left:365px; width:200px; height:25px"> 
           			<form:input path="transactionDate" size="10" /> 
          		</div>
                  
 				<!-- Posting Date -->
                  
          		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">  
           			Posting Date :  
           		</div>
           
           		<div style="position: absolute; top:370px; left:120px; width:200px; height:25px"> 
           			<form:input path="postingDate" size="10" /> 
          		</div>

				<!-- Reference Number -->

          		<div style="position: absolute; top:400px; left:280px; width:200px; height:25px">
           			Reference Number :
           		</div>
           
           		<div style="position: absolute; top:400px; left:365px; width:200px; height:25px">   
           			<form:input path="referenceNumber" size="10" />  
         		</div>

				<!-- Product Description -->

        		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
          			Product Description :   
          		</div>
          
          		<div style="position: absolute; top:430px; left:120px; width:200px; height:25px">
           			<form:input path="productDescription" size="30" /> 
            	</div>

				<!-- Credit Amount -->

            	<div style="position: absolute; top:480px; left:280px; width:200px; height:25px">
           			Credit Amount :   
           		</div>
           
           		<div style="position: absolute; top:480px; left:365px; width:200px; height:25px">
           			<form:input path="creditAmount" size="8" /> 
          		</div>
          
				<!-- Charge Amount -->
          
            	<div style="position: absolute; top:510px; left:20px; width:200px; height:25px">
           			Charge Amount :   
          		</div>
           
           		<div style="position: absolute; top:510px; left:120px; width:200px; height:25px">
           			<form:input path="chargeAmount" size="8" /> 
          		</div>
 
				<!-- INCLUDE FOOTPRINT -->

				<jsp:include page="/include/pageFooter/footprint.jsp" />

				<!-- INCLUDE BUTTON PANEL -->

				<jsp:include page="/include/pageFooter/buttonHeaderPanel.jsp" />
				
      		</form:form> 

		</div>
 
		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
		</div>
		
</body>

</html>
