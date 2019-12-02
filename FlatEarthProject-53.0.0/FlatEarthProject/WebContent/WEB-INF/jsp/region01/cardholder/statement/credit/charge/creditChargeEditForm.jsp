
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Credit Charge Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Credit Charge Form</h1>
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
          			AccountNumber :  
          		</div>
          
          		<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
 				<!-- Sequence -->
 
           		<div style="position: absolute; top:220px; left:280px; width:200px; height:25px">
           			Sequence :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:325px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- Bank Name -->
           
           		<div style="position: absolute; top:250px; left:25px; width:200px; height:25px"> 
          			Bank Name :   
           		</div>
           
           		<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="bankName" size="30" /> 
          		</div>

				<!-- Association Name -->

           		<div style="position: absolute; top:250px; left:280px; width:200px; height:25px">
           			Association Name :   
           		</div>
           
          		<div style="position: absolute; top:250px; left:325px; width:200px; height:25px">
           			<form:input path="associationName" size="30" /> 
          		</div>
 
 				<!-- Closing Date -->
                  
           		<div style="position: absolute; top:275px; left:25px; width:200px; height:25px">
           			Closing Date : 
           		</div>
           
            	<div style="position: absolute; top:275px; left:120px; width:200px; height:25px">
           			<form:input path="closingDate" size="10" /> 
           		</div>
                
                <!-- Purchase APR -->
                  
            	<div style="position: absolute; top:305px; left:25px; width:200px; height:25px">
           			Purchase APR :  
           		</div>
           
           		<div style="position: absolute; top:305px; left:120px; width:200px; height:25px"> 
           			<form:input path="purchaseAPR" size="8" /> 
          		</div>
                  
 				<!-- Advance APR -->
                  
          		<div style="position: absolute; top:305px; left:280px; width:200px; height:25px">  
           			Advance APR :  
           		</div>
           
           		<div style="position: absolute; top:305px; left:325px; width:200px; height:25px"> 
           			<form:input path="advanceAPR" size="8" /> 
          		</div>

				<!-- Purchase FCR -->

          		<div style="position: absolute; top:330px; left:25px; width:200px; height:25px">
           			Purchase FCR :
           		</div>
           
           		<div style="position: absolute; top:330px; left:120px; width:200px; height:25px">   
           			<form:input path="purchaseFCR" size="8" />  
         		</div>

				<!-- Advance FCR -->

        		<div style="position: absolute; top:330px; left:280px; width:200px; height:25px">
          			Advance FCR :   
          		</div>
          
          		<div style="position: absolute; top:330px; left:325px; width:200px; height:25px">
           			<form:input path="advanceFCR" size="8" /> 
            	</div>

				<!-- Purchase ADB -->

            	<div style="position: absolute; top:355px; left:25px; width:200px; height:25px">
           			Purchase ADB :   
           		</div>
           
           		<div style="position: absolute; top:355px; left:120px; width:200px; height:25px">
           			<form:input path="purchaseADB" size="8" /> 
          		</div>
          
				<!-- Advance ADB -->
          
            	<div style="position: absolute; top:355px; left:280px; width:200px; height:25px">
           			Advance ADB :   
          		</div>
           
           		<div style="position: absolute; top:355px; left:325px; width:200px; height:25px">
           			<form:input path="advanceADB" size="8" /> 
          		</div>
          
          		<!-- Composite APR -->
           
           		<div style="position: absolute; top:385px; left:25px; width:200px; height:25px">   
           			Composite APR :   
           		</div>
           
           		<div style="position: absolute; top:385px; left:120px; width:200px; height:25px">
           			<form:input path="compositeAPR" size="8"/>  
           		</div>
           
           		<!-- Total Fees Charged This Period -->
           
           		<div style="position: absolute; top:385px; left:280px; width:200px; height:25px">
           			Total Fees Charged :   
           		</div>
           
           		<div style="position: absolute; top:385px; left:325px; width:200px; height:25px">
           			<form:input path="totalFeesChargedThisPeriod" size="8"/> 
           		</div>
           
				<!-- Purchase Variable APR -->

           		<div style="position: absolute; top:415px; left:25px; width:200px; height:25px"> 
           			Purchase Variable APR :  
           		</div>
            
            	<div style="position: absolute; top:415px; left:120px; width:200px; height:25px">
           			<form:input path="purchaseVariableAPR" size="8" /> 
           		</div>
                       
                <!-- Cash Advance Variable APR -->
                       
            	<div style="position: absolute; top:415px; left:280px; width:200px; height:25px">
           			Cash Advance Variable APR :   
           		</div>
           
           		<div style="position: absolute; top:415px; left:325px; width:200px; height:25px">
           			<form:input path="cashAdvanceVariableAPR" size="8" /> 
           		</div>

				<!-- Purchase Balance Subject -->
          
            	<div style="position: absolute; top:440px; left:25px; width:200px; height:25px">
           			Purchase Balance Subject :   
           		</div>
           
           		<div style="position: absolute; top:440px; left:120px; width:200px; height:25px">
           			<form:input path="purchaseBalanceSubject" size="7" /> 
          		</div>
     
     			<!-- Cash Advance Balance Subject -->
     
           		<div style="position: absolute; top:440px; left:280px; width:200px; height:25px"> 
           			Cash Advance Balance Subject :   
           		</div>
           
           		<div style="position: absolute; top:440px; left:325px; width:200px; height:25px">
           			<form:input path="cashAdvanceBalanceSubject" size="8" /> 
           		</div>
    
     			<!-- Purchase Days In Billing Cycle -->
     
           		<div style="position: absolute; top:465px; left:25px; width:200px; height:25px"> 
           			Purchase Days In Billing Cycle :   
           		</div>
           
           		<div style="position: absolute; top:465px; left:120px; width:200px; height:25px">
           			<form:input path="purchaseDaysInBillingCycle" size="8" /> 
           		</div>
 
     			<!-- Cash Advance Days In Billing Cycle -->
     
           		<div style="position: absolute; top:465px; left:280px; width:200px; height:25px"> 
           			Cash Advance Balance Subject :   
           		</div>
           
           		<div style="position: absolute; top:465px; left:325px; width:200px; height:25px">
           			<form:input path="cashAdvanceDaysInBillingCycle" size="8" /> 
           		</div>
 
     			<!-- Purchase Interest Charge -->
     
           		<div style="position: absolute; top:490px; left:25px; width:200px; height:25px"> 
           			Purchase Interest Charge :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:120px; width:200px; height:25px">
           			<form:input path="purchaseInterestCharge" size="8" /> 
           		</div>
    
     			<!-- Cash Advance Interest Charge -->
     
           		<div style="position: absolute; top:490px; left:280px; width:200px; height:25px"> 
           			Cash Advance Interest Charge :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:325px; width:200px; height:25px">
           			<form:input path="cashAdvanceInterestCharge" size="8" /> 
           		</div>
    
     			<!-- Total Fees Charged YTD -->
     
           		<div style="position: absolute; top:515px; left:25px; width:200px; height:25px"> 
           			Total Fees Charged YTD :   
           		</div>
           
           		<div style="position: absolute; top:515px; left:120px; width:200px; height:25px">
           			<form:input path="totalFeesChargedYTD" size="8" /> 
           		</div>
    
     			<!-- Total Interest Charged YTD -->
     
           		<div style="position: absolute; top:515px; left:280px; width:200px; height:25px"> 
           			Total Interest Charged YTD :   
           		</div>
           
           		<div style="position: absolute; top:515px; left:325px; width:200px; height:25px">
           			<form:input path="totalInterestChargedYTD" size="8" /> 
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
