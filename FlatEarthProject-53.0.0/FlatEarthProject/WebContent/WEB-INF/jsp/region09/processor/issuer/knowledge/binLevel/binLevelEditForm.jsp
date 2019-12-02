
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Knowledge: BIN Level Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Knowledge: BIN Level Edit Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/chipCardEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Low Bin Range :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:150px; width:200px; height:25px">
           			<form:input path="lowBinRangeNumber" size="19" /> 
           		</div>
            
           		<!-- Bin Length -->
           
           		<div style="position: absolute; top:190px; left:330px; width:400px; height:25px">
           			Bin Length :   
           		</div>
           
          		<div style="position: absolute; top:190px; left:500px; width:200px; height:25px">
           			<form:input path="binLength" size="2" /> 
          		</div>
 
           		<div style="position: absolute; top:220px; left:20px; width:330px; height:25px">
           			<b>High Bin Range :</b>  
           		</div>
           
            	<div style="position: absolute; top:220px; left:150px; width:200px; height:25px">
           			<form:input path="highBinRangeNumber" size="19"/> 
          		</div>
          
          		<!-- Account Number Length -->
                  
           		<div style="position: absolute; top:220px; left:330px; width:400px; height:25px">
           			Account Number Length : 
           		</div>
           
            	<div style="position: absolute; top:220px; left:500px; width:500px; height:25px">
           			<form:input path="accountNumberLength" size="2" /> 
           		</div>
          		
          		<!-- Card Type -->
          
          		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			Card Type :  
          		</div>
 
          		<div style="position: absolute; top:270px; left:150px; width:200px; height:25px">
           			<form:input path="cardType" size="15" /> 
          		</div>

                <!-- Card Subtype -->
                  
            	<div style="position: absolute; top:270px; left:330px; width:200px; height:25px">
           			Card Subtype :  
           		</div>
           
           		<div style="position: absolute; top:270px; left:500px; width:200px; height:25px"> 
           			<form:input path="cardSubtype" size="10" /> 
          		</div>
           		
                <!-- Product Group -->

            	<div style="position: absolute; top:300px; left:20px; width:200px; height:25px">
           			Product Group :   
           		</div>

           		<div style="position: absolute; top:300px; left:150px; width:200px; height:25px">
           			<form:input path="productGroup" size="15" /> 
          		</div>          		
          		
				<!-- Product Type -->

            	<div style="position: absolute; top:300px; left:330px; width:400px; height:25px">
           			Product Type :   
           		</div>
           
           		<div style="position: absolute; top:300px; left:500px; width:200px; height:25px">
           			<form:input path="productType" size="10" /> 
          		</div>
  
           		<!-- Country Code -->
                            
          		<div style="position: absolute; top:330px; left:20px; width:400px; height:25px">  
           			Country Code :  
           		</div>
           
           		<div style="position: absolute; top:330px; left:150px; width:200px; height:25px"> 
           			<form:input path="countryCode" size="3" /> 
          		</div>

				<!-- Currency Code -->

          		<div style="position: absolute; top:330px; left:330px; width:400px; height:25px">
           			Currency Code :
           		</div>
           
           		<div style="position: absolute; top:330px; left:500px; width:400px; height:25px">   
           			<form:input path="currencyCode" size="3" /> 
         		</div>

				<!-- Checking Switch -->

            	<div style="position: absolute; top:380px; left:20px; width:400px; height:25px">
           			Checking Switch :   
           		</div>
           
           		<div style="position: absolute; top:380px; left:150px; width:200px; height:25px">
           			<form:input path="checkingSwitch" size="1" /> 
          		</div>

				<!-- ATM Overdraft Switch -->

            	<div style="position: absolute; top:380px; left:330px; width:400px; height:25px">
           			ATM Overdraft Switch :   
           		</div>
           
           		<div style="position: absolute; top:380px; left:500px; width:200px; height:25px">
           			<form:input path="atmOverdraftSwitch" size="1" /> 
          		</div>
 
				<!-- Savings Switch -->

            	<div style="position: absolute; top:410px; left:20px; width:400px; height:25px">
           			Savings Switch :   
           		</div>
           
           		<div style="position: absolute; top:410px; left:150px; width:200px; height:25px">
           			<form:input path="savingsSwitch" size="1" /> 
          		</div>
 
				<!-- POS Overdraft Switch -->

            	<div style="position: absolute; top:410px; left:330px; width:400px; height:25px">
           			POS Overdraft Switch :   
           		</div>
           
           		<div style="position: absolute; top:410px; left:500px; width:200px; height:25px">
           			<form:input path="posOverdraftSwitch" size="1" /> 
          		</div>
 
				<!-- Expiration Date -->

            	<div style="position: absolute; top:460px; left:20px; width:400px; height:25px">
           			Expiration Date :   
           		</div>
           
           		<div style="position: absolute; top:460px; left:150px; width:200px; height:25px">
           			<form:input path="expirationDate" size="8" /> 
          		</div>
 
				<!-- Range Level All -->

            	<div style="position: absolute; top:460px; left:330px; width:400px; height:25px">
           			Range Level All :   
           		</div>
           
           		<div style="position: absolute; top:460px; left:500px; width:200px; height:25px">
           			<form:input path="rangeLevelAll" size="7" /> 
          		</div>
 
				<!-- Production Date -->

            	<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			Production Date :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:150px; width:200px; height:25px">
           			<form:input path="productionDate" size="8" /> 
          		</div>
   
				<!-- Partial Authorization -->

            	<div style="position: absolute; top:490px; left:330px; width:400px; height:25px">
           			Partial Authorization :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:500px; width:200px; height:25px">
           			<form:input path="partialAuthorization" size="1" /> 
          		</div>
   
				<!-- Certification Date -->

            	<div style="position: absolute; top:520px; left:20px; width:400px; height:25px">
           			Certification Date :   
           		</div>
           
           		<div style="position: absolute; top:520px; left:150px; width:200px; height:25px">
           			<form:input path="certificationDate" size="8" /> 
          		</div>

				<!-- Derivation Type -->

            	<div style="position: absolute; top:520px; left:330px; width:400px; height:25px">
           			Derivation Type :   
           		</div>
           
           		<div style="position: absolute; top:520px; left:500px; width:200px; height:25px">
           			<form:input path="deriviationType" size="10" /> 
          		</div>
 
				<!-- INCLUDE FOOTPRINT -->

               <div style="position: absolute; top:560px; left:20px; width:200px; height:25px">
           			<b>Foot Print</b>   
           		</div>

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
