
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Application Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip: Application Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/applicationEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Chip: Application List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
         		<!-- PRIMARY ACCOUNT NUMBER -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			<b>Primary Account Number :</b>  
          		</div>
          
          		<div style="position: absolute; top:200px; left:210px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
				<!-- SEQUENCE NUMBER -->

           		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">
           			<b>Sequence :</b>   
           		</div>
           
          		<div style="position: absolute; top:230px; left:210px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2" /> 
          		</div>
 
 				<!-- VERSION NUMBER -->
                  
           		<div style="position: absolute; top:270px; left:25px; width:200px; height:25px">
           			Version Number  	: 
           		</div>
           
            	<div style="position: absolute; top:270px; left:210px; width:200px; height:25px">
           			<form:input path="versionNumber" size="2" /> 
           		</div>
                
                <!-- USAGE CONTROL -->
                  
            	<div style="position: absolute; top:300px; left:25px; width:200px; height:25px">
           			Usage Control   	:  
           		</div>
           
           		<div style="position: absolute; top:300px; left:210px; width:200px; height:25px"> 
           			<form:input path="usageControl" size="2" /> 
          		</div>
                  
 				<!-- CRYPTOGRAM INFORMATION -->
                  
          		<div style="position: absolute; top:340px; left:25px; width:200px; height:25px">  
           			Cryptogram Information	:  
           		</div>
           
           		<div style="position: absolute; top:340px; left:210px; width:200px; height:25px"> 
           			<form:input path="cryptogramInformationData" size="1" /> 
          		</div>

				<!-- APPLICATION CRYPTOGRAM -->

          		<div style="position: absolute; top:370px; left:25px; width:200px; height:25px">
           			Application Cryptogram	:
           		</div>
           
           		<div style="position: absolute; top:370px; left:210px; width:200px; height:25px">   
           			<form:input path="cryptogram" size="8" />  
         		</div>

				<!-- UNPREDICATABLE NUMBER -->

        		<div style="position: absolute; top:400px; left:25px; width:200px; height:25px">
          			Unpredictable Number	:   
          		</div>
          
          		<div style="position: absolute; top:400px; left:210px; width:200px; height:25px">
           			<form:input path="unpredictableNumber" size="8" /> 
            	</div>

				<!-- APPLICATION TRANSACTION COUNTERS -->
<!-- 
        		<div style="position: absolute; top:440px; left:25px; width:400px; height:25px">
          			Application Transaction Counters   
          		</div>
-->
				<!-- TRANSACTION COUNTER -->

        		<div style="position: absolute; top:440px; left:25px; width:200px; height:25px">
          			Transaction Counter	:   
          		</div>
          
          		<div style="position: absolute; top:440px; left:210px; width:200px; height:25px">
           			<form:input path="applicationTransCounter" size="2" /> 
            	</div>

				<!-- LAST ONLINE TRANSACTION COUNTER -->

        		<div style="position: absolute; top:470px; left:25px; width:200px; height:25px">
          			Last Online Counter	:   
          		</div>
          
          		<div style="position: absolute; top:470px; left:210px; width:200px; height:25px">
           			<form:input path="lastOnlineApplTransCounter" size="2" /> 
            	</div>

				<!-- EFFECTIVE DATE -->

        		<div style="position: absolute; top:510px; left:25px; width:200px; height:25px">
          			Effective Date	:   
          		</div>
          
          		<div style="position: absolute; top:510px; left:210px; width:200px; height:25px">
           			<form:input path="effectiveDate" /> 
            	</div>

				<!-- EXPIRATION DATE -->

        		<div style="position: absolute; top:540px; left:25px; width:200px; height:25px">
          			Expiration Date	:   
          		</div>
          
          		<div style="position: absolute; top:540px; left:210px; width:200px; height:25px">
           			<form:input path="expirationDate"  /> 
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
