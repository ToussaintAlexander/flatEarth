
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Checking Summary Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Checking Summary Form</h1>
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
         
         		<!-- PRIMARY ACCOUNT NUMBER -->
         
        		<div style="position: absolute; top:220px; left:25px; width:200px; height:25px">   
          			Primary Acct :  
          		</div>
          
          		<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
 				<!-- SEQUENCE -->
 
           		<div style="position: absolute; top:220px; left:330px; width:200px; height:25px">
           			Sequence :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:470px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- CLOSING DATE -->
           
           		<div style="position: absolute; top:250px; left:25px; width:200px; height:25px"> 
          			Closing Date :   
           		</div>
           
           		<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="closingDate" size="8" /> 
          		</div>

				<!-- BANK NAME -->

           		<div style="position: absolute; top:300px; left:25px; width:200px; height:25px">
           			Bank Name :   
           		</div>
           
          		<div style="position: absolute; top:300px; left:120px; width:200px; height:25px">
           			<form:input path="bankName" size="15" /> 
          		</div>
 
 				<!-- ASSOCIATION NAME -->
                  
           		<div style="position: absolute; top:300px; left:330px; width:200px; height:25px">
           			Association: 
           		</div>
           
            	<div style="position: absolute; top:300px; left:470px; width:200px; height:25px">
           			<form:input path="associationName" size="15" /> 
           		</div>
                
                <!-- CREDIT LINE -->
                  
            	<div style="position: absolute; top:350px; left:25px; width:200px; height:25px">
           			Credit Line :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:120px; width:200px; height:25px"> 
           			<form:input path="creditLine" size="8" /> 
          		</div>
                  
 				<!-- AVAILABLE CREDIT -->
                  
          		<div style="position: absolute; top:350px; left:330px; width:200px; height:25px">  
           			Available Credit :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:470px; width:200px; height:25px"> 
           			<form:input path="availableCredit" size="8" /> 
          		</div>

				<!-- PREVIOUS BALANCE -->

          		<div style="position: absolute; top:400px; left:25px; width:200px; height:25px">
           			Previous Blnc :
           		</div>
           
           		<div style="position: absolute; top:400px; left:120px; width:200px; height:25px">   
           			<form:input path="previousBalance" size="8" />  
         		</div>

				<!-- CREDITS -->

        		<div style="position: absolute; top:450px; left:25px; width:200px; height:25px">
          			Credits :   
          		</div>
          
          		<div style="position: absolute; top:450px; left:120px; width:200px; height:25px">
           			<form:input path="credits" size="8" /> 
            	</div>

				<!-- PAYMENTS -->

            	<div style="position: absolute; top:450px; left:330px; width:200px; height:25px">
           			Payments :   
           		</div>
           
           		<div style="position: absolute; top:450px; left:470px; width:200px; height:25px">
           			<form:input path="payments" size="8" /> 
          		</div>
          
				<!-- PURCHASES -->
          
            	<div style="position: absolute; top:480px; left:25px; width:200px; height:25px">
           			Purchases :   
          		</div>
           
           		<div style="position: absolute; top:480px; left:120px; width:200px; height:25px">
           			<form:input path="purchases" size="8" /> 
          		</div>
          
          		<!-- CHARGES -->
           
           		<div style="position: absolute; top:480px; left:330px; width:200px; height:25px">   
           			Charges :   
           		</div>
           
           		<div style="position: absolute; top:480px; left:470px; width:200px; height:25px">
           			<form:input path="charges" size="8"/>  
           		</div>
           
           		<!-- CASH ADVANCES -->
           
           		<div style="position: absolute; top:510px; left:25px; width:200px; height:25px">
           			Cash Advcs :   
           		</div>
           
           		<div style="position: absolute; top:510px; left:120px; width:200px; height:25px">
           			<form:input path="cashAdvances" size="8"/> 
           		</div>
           
				<!-- FIANNCE CHARGE -->

           		<div style="position: absolute; top:510px; left:330px; width:200px; height:25px"> 
           			Finance Charge :  
           		</div>
            
            	<div style="position: absolute; top:510px; left:470px; width:200px; height:25px">
           			<form:input path="financeCharge" size="8" /> 
           		</div>
                       
                <!-- NEW BALANCE -->       
                       
            	<div style="position: absolute; top:550px; left:25px; width:200px; height:25px">
           			New Balance :   
           		</div>
           
           		<div style="position: absolute; top:550px; left:120px; width:200px; height:25px">
           			<form:input path="newBalance" size="8" /> 
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
