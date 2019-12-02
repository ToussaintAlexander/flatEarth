<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Keys</h1>
       <form:form method="post" action="keysFormJSPPostAction">  
      	<table >  
      	
         
         <tr>  
          <td>Primary Account Number : </td> 
          <td><form:input path="primaryAccountNumber"  /></td>
         </tr> 
          
         <tr>  
          <td>Primary Account Number Sequence : </td>  
          <td><form:input path="primaryAccountNumberSeq" /></td>
         </tr> 
         
         <tr>  
          <td>ICC PIN Encipherment Public Key Certificate : </td>  
          <td><form:input path="pinEncipherPublicKeyCert" /></td>
         </tr> 
         
         <tr>  
          <td>ICC PIN Encipherment Public Key Exponent : </td>  
          <td><form:input path="pinEncipherPublicKeyExp" /></td>
         </tr>     
              
         <tr>  
          <td>ICC PIN Encipherment Public Key Remainder : </td>  
          <td><form:input path="pinEncipherPublicKeyRemain" /></td>
         </tr> 
         
         <tr>  
          <td>ICC Public Key Certificate : </td>  
          <td><form:input path="publicKeyCertificate" /></td>
         </tr> 
         
         <tr>  
          <td>ICC Public Key Index : </td>  
          <td><form:input path="publicKeyIndex" /></td>
         </tr> 

         <tr>  
          <td>ICC Public Key Exponent : </td>  
          <td><form:input path="publicKeyExponent" /></td>
         </tr> 
                 
         <tr>  
          <td>ICC Public Key Remainder : </td>  
          <td><form:input path="publicKeyRemainder" /></td>
         </tr> 
                 
         <tr>  
          <td>ICC Dynamic Number : </td>  
          <td><form:input path="dynamicNumber" /></td>
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
