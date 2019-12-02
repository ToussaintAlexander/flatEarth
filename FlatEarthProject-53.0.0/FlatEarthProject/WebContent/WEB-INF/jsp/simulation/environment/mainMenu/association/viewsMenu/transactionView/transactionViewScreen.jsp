<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction View Form</title>
</head>
<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Transaction View Form</h1>
		</div>

		<!-- CONTENT BODY -->

        <div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">
        
        <form> 
        
        		<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />
        
        		<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/world.jsp" />
        
         		<!-- Authorization Transaction -->
         
        		<div style="position: absolute; top:250px; left:25px; width:400px; height:25px">   
          			<a href="cardholderForm"><b>0100/0110      Authorization Transaction</b></a>
          		</div>
          
 				<!-- Authorization Advice -->
 
           		<div style="position: absolute; top:280px; left:25px; width:400px; height:25px"> 
           			<a href="cardholderForm"><b>0120/0121/0130 Authorization Advice Transaction</b></a>
           		</div>
           
  				<!-- Acquirer Financial  -->
                  
           		<div style="position: absolute; top:310px; left:25px; width:400px; height:25px">
           			<a href="cardholderForm"><b>0200/0210      Acquirer Financial Transaction</b></a>
           		</div>
           
          		<!-- Acquirer Financial Advice -->
                  
           		<div style="position: absolute; top:340px; left:25px; width:400px; height:25px"> 
           			<a href="cardholderForm"><b>0220/0221/0230 Acquirer Financial Advice Transaction</b></a>
           		</div>
           
          		<!-- Batch Upload -->
                  
           		<div style="position: absolute; top:370px; left:25px; width:400px; height:25px">
           			<a href="cardholderForm"><b>0320/0330      Batch Upload Transaction</b></a>
           		</div>
           
          		<!-- Acquirer Reversal Request -->
                  
           		<div style="position: absolute; top:400px; left:25px; width:400px; height:25px"> 
           			<a href="cardholderForm"><b>0400/0410/0420 Acquirer Reversal Transaction</b></a>
           		</div>
           
          		<!-- Batch Settlement response -->
                  
           		<div style="position: absolute; top:430px; left:25px; width:400px; height:25px"> 
           			<a href="cardholderForm"><b>0500/0510      Batch Settlement Transaction</b></a>
           		</div>
           
          		<!-- Administrative -->
                  
           		<div style="position: absolute; top:460px; left:25px; width:400px; height:25px">
           			<a href="cardholderForm"><b>0600/0610      Administrative Transaction</b></a>
           		</div>
           
          		<!-- Network Management Request -->
                  
           		<div style="position: absolute; top:490px; left:25px; width:400px; height:25px"> 
           			<a href="cardholderForm"><b>0800/0810/0820 Network Management Transaction</b></a>
           		</div>
           
				<!-- INCLUDE FOOTPRINT -->

               <div style="position: absolute; top:560px; left:20px; width:400px; height:25px">
           			<b>Foot Print</b>   
           		</div>

				<!-- BUTTON PANEL -->	
											
				<jsp:include page="/include/pageFooter/buttonDetailPanel.jsp" />

           		</form> 
           		
      	</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />

</div>

</body>
</html>