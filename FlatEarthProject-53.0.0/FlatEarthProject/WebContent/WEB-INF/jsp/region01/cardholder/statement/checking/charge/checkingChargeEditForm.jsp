
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
                
                <!-- Credit Line -->
                  
            	<div style="position: absolute; top:340px; left:280px; width:200px; height:25px">
           			Credit Line :  
           		</div>
           
           		<div style="position: absolute; top:340px; left:365px; width:200px; height:25px"> 
           			<form:input path="creditLine" size="10" /> 
          		</div>
                  
 				<!-- Available Credit -->
                  
          		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">  
           			Available Credit :  
           		</div>
           
           		<div style="position: absolute; top:370px; left:120px; width:200px; height:25px"> 
           			<form:input path="availableCredit" size="10" /> 
          		</div>

				<!-- Previous Balance -->

          		<div style="position: absolute; top:400px; left:280px; width:200px; height:25px">
           			Previous Balance :
           		</div>
           
           		<div style="position: absolute; top:400px; left:365px; width:200px; height:25px">   
           			<form:input path="previousBalance" size="10" />  
         		</div>

				<!-- Credits -->

        		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
          			Credits :   
          		</div>
          
          		<div style="position: absolute; top:430px; left:120px; width:200px; height:25px">
           			<form:input path="credits" size="30" /> 
            	</div>

				<!-- Payments -->

            	<div style="position: absolute; top:460px; left:280px; width:200px; height:25px">
           			Payments :   
           		</div>
           
           		<div style="position: absolute; top:460px; left:365px; width:200px; height:25px">
           			<form:input path="payments" size="8" /> 
          		</div>
          
				<!-- Purchases -->
          
            	<div style="position: absolute; top:490px; left:20px; width:200px; height:25px">
           			Purchases :   
          		</div>
           
           		<div style="position: absolute; top:490px; left:120px; width:200px; height:25px">
           			<form:input path="purchases" size="8" /> 
          		</div>

				<!-- Charges -->
          
            	<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			Charges :   
          		</div>
           
           		<div style="position: absolute; top:520px; left:120px; width:200px; height:25px">
           			<form:input path="charges" size="8" /> 
          		</div>
          		
				<!-- Cash Advances -->
          
            	<div style="position: absolute; top:540px; left:20px; width:200px; height:25px">
           			Cash Advances :   
          		</div>
           
           		<div style="position: absolute; top:540px; left:120px; width:200px; height:25px">
           			<form:input path="cashAdvances" size="8" /> 
          		</div>
          		        
				<!-- Finance Charge -->
          
            	<div style="position: absolute; top:570px; left:20px; width:200px; height:25px">
           			Finance Charge :   
          		</div>
           
           		<div style="position: absolute; top:570px; left:120px; width:200px; height:25px">
           			<form:input path="financeCharge" size="8" /> 
          		</div>
          		        
				<!-- New Balance -->
          
            	<div style="position: absolute; top:600px; left:20px; width:200px; height:25px">
           			New Balance :   
          		</div>
           
           		<div style="position: absolute; top:600px; left:120px; width:200px; height:25px">
           			<form:input path="newBalance" size="8" /> 
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
