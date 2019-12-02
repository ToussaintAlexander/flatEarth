<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt"	       %>  

		<h1>Add New Currency</h1>
       <form:form method="post" action="currencyFormJSPPostAction">  
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
          <td>Account Type :</td>  
          <td><form:input path="accountType" /></td>
         </tr>     
              
         <tr>  
          <td>Amount Authorized :</td>  
          <td><form:input path="amountAuthorized" /></td>
         </tr> 
         
         <tr>  
          <td>Amount Other :</td>  
          <td><form:input path="amountOther" /></td>
         </tr> 
         
         <tr>  
          <td>Amount Reference Currency :</td>  
          <td><form:input path="amountReferenceCurrency" /></td>
         </tr> 
        
         <tr>  
          <td>Currency Code Transaction Reference Code :</td>  
          <td><form:input path="currencyCodeTransReferenceCode" /></td>
         </tr> 
                
         <tr>  
          <td>Currency Exponent Transaction Reference :</td>  
          <td><form:input path="currencyExponentTransReference" /></td>
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
