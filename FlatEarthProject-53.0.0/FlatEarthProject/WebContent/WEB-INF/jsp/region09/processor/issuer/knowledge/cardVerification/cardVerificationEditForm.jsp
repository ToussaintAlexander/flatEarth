
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
          			<b>Low Bin Range Number :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:200px; width:200px; height:25px">
           			<form:input path="lowBinRangeNumber" size="19" /> 
           		</div>
 
        		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">   
          			<b>High Bin Range Number :</b> 
          		</div>
          
          		<div style="position: absolute; top:220px; left:200px; width:200px; height:25px">
           			<form:input path="highBinRangeNumber" size="19" /> 
           		</div>
            
           		<!-- cVV1 -->
           
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			CVV1 :   
           		</div>
           
          		<div style="position: absolute; top:270px; left:200px; width:200px; height:25px">
           			<form:input path="cVV1" size="3" /> 
          		</div>
 
           		<div style="position: absolute; top:300px; left:20px; width:330px; height:25px">
           			CVV2 :  
           		</div>
           
            	<div style="position: absolute; top:300px; left:200px; width:200px; height:25px">
           			<form:input path="cVV2" size="3"/> 
          		</div>
          
          		<!-- iCVV -->
                  
           		<div style="position: absolute; top:330px; left:20px; width:400px; height:25px">
           			iCVV : 
           		</div>
           
            	<div style="position: absolute; top:330px; left:200px; width:500px; height:25px">
           			<form:input path="iCVV" size="3" /> 
           		</div>
          		
          		<!-- dCVV -->
          
          		<div style="position: absolute; top:360px; left:20px; width:400px; height:25px">
           			DCVV :  
          		</div>
 
          		<div style="position: absolute; top:360px; left:200px; width:200px; height:25px">
           			<form:input path="dCVV" size="3" /> 
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
