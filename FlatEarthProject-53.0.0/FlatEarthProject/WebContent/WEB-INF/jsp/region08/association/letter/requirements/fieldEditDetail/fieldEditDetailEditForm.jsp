
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Usage: Field Edit Detail Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Usage: Field Edit Detail Edit Form</h1>
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
          		
         		<!-- Field -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Field :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:140px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
           		</div>
 
         		<!-- SubField -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			SubField :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="subfield" size="2" /> 
           		</div>
        
         		<!-- seq -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			seq :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:140px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
           		</div>
 
         		<!-- fire -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			fire :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:140px; width:200px; height:25px">
           			<form:input path="fire" size="1" /> 
           		</div>
 
         		<!-- type -->
         
        		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">   
          			type :  
          		</div>
          
          		<div style="position: absolute; top:320px; left:140px; width:200px; height:25px">
           			<form:input path="type" size="2" /> 
           		</div>
 
				<!-- group -->

           		<div style="position: absolute; top:350px; left:25px; width:200px; height:25px">
           			group :   
           		</div>
           
          		<div style="position: absolute; top:350px; left:140px; width:200px; height:25px">
           			<form:input path="group" size="2" /> 
          		</div>
 
 				<!-- binLayer -->
                  
           		<div style="position: absolute; top:380px; left:25px; width:200px; height:25px">
           			binLayer : 
           		</div>
           
            	<div style="position: absolute; top:380px; left:140px; width:200px; height:25px">
           			<form:input path="binLayer" size="2" /> 
           		</div>
                
                <!-- accountLayer -->
                  
            	<div style="position: absolute; top:410px; left:25px; width:200px; height:25px">
           			accountLayer :  
           		</div>
           
           		<div style="position: absolute; top:410px; left:140px; width:200px; height:25px"> 
           			<form:input path="accountLayer" size="2" /> 
          		</div>
                
                <!-- transactionLayer -->
                  
            	<div style="position: absolute; top:440px; left:25px; width:200px; height:25px">
           			transactionLayer :  
           		</div>
           
           		<div style="position: absolute; top:440px; left:140px; width:200px; height:25px"> 
           			<form:input path="transactionLayer" size="2" /> 
          		</div>

                <!-- routineSequence -->
                  
            	<div style="position: absolute; top:470px; left:25px; width:200px; height:25px">
           			routineSequence :  
           		</div>
           
           		<div style="position: absolute; top:470px; left:140px; width:200px; height:25px"> 
           			<form:input path="routineSequence" size="2" /> 
          		</div>
          		
                <!-- pointer -->
                  
            	<div style="position: absolute; top:500px; left:25px; width:200px; height:25px">
           			pointer :  
           		</div>
           
           		<div style="position: absolute; top:500px; left:140px; width:200px; height:25px"> 
           			<form:input path="pointer" size="2" /> 
          		</div>
        		
                <!-- value -->
                  
            	<div style="position: absolute; top:530px; left:25px; width:200px; height:25px">
           			value :  
           		</div>
           
           		<div style="position: absolute; top:530px; left:140px; width:200px; height:25px"> 
           			<form:input path="fieldValue" size="30" /> 
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
