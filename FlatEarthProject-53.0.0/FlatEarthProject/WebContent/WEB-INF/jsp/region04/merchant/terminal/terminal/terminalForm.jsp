<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt"	       %>  

		<h1>Add New Acquirer</h1>
       <form:form method="post" action="acquirerFormJSPPostAction">  
      	<table >  
      	
         <tr>  
          <td>Acquirer Identifier : </td> 
          <td><form:input path="acquirerIdentifier"  /></td>
         </tr> 
          
         <tr>  
          <td>Merchant Identifier :</td>  
          <td><form:input path="merchantIdentifier" /></td>
         </tr> 
         
         <tr>  
          <td>Terminal Identification :</td>  
          <td><form:input path="terminalIdentification" /></td>
         </tr> 
         
         <tr>  
          <td>Merchant Category Code :</td>  
          <td><form:input path="merchantCategoryCode" /></td>
         </tr>     
              
         <tr>  
          <td>Merchant Name and Location :</td>  
          <td><form:input path="merchantNameandLocation" /></td>
         </tr> 
         
         <tr>  
          <td>Interface Device Serial Number :</td>  
          <td><form:input path="interfaceDeviceSerialNumber" /></td>
         </tr> 
         
         <tr>  
          <td>Terminal Type :</td>  
          <td><form:input path="terminalType" /></td>
         </tr> 

        
         <tr>  
          <td>Terminal Country Code :</td>  
          <td><form:input path="terminalCountryCode" /></td>
         </tr> 
        
         <tr>  
          <td>Terminal Capabilities :</td>  
          <td><form:input path="terminalCapabilities" /></td>
         </tr> 
        
         <tr>  
          <td>Kernel 4 Reader Capabilities :</td>  
          <td><form:input path="kernel4ReaderCapabilities" /></td>
         </tr> 
                
         <tr>  
          <td>Additional Terminal Capabilities :</td>  
          <td><form:input path="additionalTermCapabilities" /></td>
         </tr> 
                
         <tr>  
          <td>Terminal Transaction Qualifiers :</td>  
          <td><form:input path="terminalTransQualifiers" /></td>
         </tr> 
                
         <tr>  
          <td>VLPTermSupportIndicator :</td>  
          <td><form:input path="vLPTermSupportIndicator" /></td>
         </tr> 
                
         <tr>  
          <td>VLPTermTransactionLimit :</td>  
          <td><form:input path="vLPTermTransactionLimit" /></td>
         </tr> 
                
         <tr>  
          <td>Terminal Floor Limit :</td>  
          <td><form:input path="terminalFloorLimit" /></td>
         </tr> 
                
         <tr>  
          <td>Terminal Action Code Default :</td>  
          <td><form:input path="terminalActionCodeDefault" /></td>
         </tr> 
                
         <tr>  
          <td>Terminal Action Code Decline :</td>  
          <td><form:input path="terminalActionCodeDecline" /></td>
         </tr> 
        
         <tr>  
          <td>Terminal Risk Management Data :</td>  
          <td><form:input path="terminalRiskManagementData" /></td>
         </tr> 
                
         <tr>  
          <td>Terminal Verification Results :</td>  
          <td><form:input path="terminalVerificationResults" /></td>
         </tr> 
          
         <tr>  
          <td>Create User :</td>  
          <td><form:input path="createUser" /></td>
         </tr> 
          
         <tr>  
          <td>Create Timestamp :</td>  
          <td><form:input path="createTimestamp" /></td>
         </tr> 
          
         <tr>  
          <td>Modify User:</td>  
          <td><form:input path="modifyUser" /></td>
         </tr> 
          
         <tr>  
          <td>Modify Timestamp :</td>  
          <td><form:input path="modifyTimestamp" /></td>
         </tr> 
          
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
         
        </table>  
       </form:form>