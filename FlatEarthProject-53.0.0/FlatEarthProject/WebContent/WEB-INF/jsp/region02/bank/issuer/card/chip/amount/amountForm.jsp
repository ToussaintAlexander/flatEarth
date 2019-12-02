<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Amount</h1>
       <form:form method="post" action="amountFormJSPPostAction">  
      	<table >  
  
         <tr>
      	 <td></td>  
         <td><form:hidden  path="id" /></td>
         </tr>     	
           
         <tr>  
          <td>Primary Account Number : </td> 
          <td><form:input path="primaryAccountNumber"  /></td>
         </tr> 
          
         <tr>  
          <td>Primary Account Number Sequence :</td>  
          <td><form:input path="primaryAccountNumberSeq" /></td>
         </tr> 
         
         <tr>  
          <td>Currency Code Application :</td>  
          <td><form:input path="currencyCodeApplication" /></td>
         </tr> 
         
         <tr>  
          <td>Currency Conversion Factor :</td>  
          <td><form:input path="currencyConversionFactor" /></td>
         </tr>     
              
         <tr>  
          <td>Currency Exponent Application :</td>  
          <td><form:input path="currencyExponentApplication" /></td>
         </tr> 
         
         <tr>  
          <td>Secondary Application Currency Code :</td>  
          <td><form:input path="secondaryApplCurrencyCode" /></td>
         </tr> 
         
         <tr>  
          <td>Consecutive Domestic Offline Counter :</td>  
          <td><form:input path="consecutDomOfflineCtr" /></td>
         </tr> 
          
         <tr>  
          <td>Consecutive Domestic Offline Lower Limit :</td>  
          <td><form:input path="consecutDomOfflineLwrLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Consecutive Domestic Offline Upper Limit :</td>  
          <td><form:input path="consecutDomOfflineUprLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Consecutive International Offline Counter :</td>  
          <td><form:input path="consecutIntlOfflineCtr" /></td>
         </tr> 
                
         <tr>  
          <td>Consecutive International Offline Lower Limit :</td>  
          <td><form:input path="consecutIntlOfflineLwrLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Consecutive International Offline Upper Limit :</td>  
          <td><form:input path="consecutIntlOfflineUprLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Cumulative Total Domestic Transaction Amount :</td>  
          <td><form:input path="cumTotDomTransAmount" /></td>
         </tr> 
                
         <tr>  
          <td>Cumulative Total Domestic Transaction Amount Lower Limit :</td>  
          <td><form:input path="cumTotDomTransAmtLwrLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Cumulative Total Domestic Transaction Amount Upper Limit :</td>  
          <td><form:input path="cumTotDomTransAmtUprLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Cumulative Total International Transaction Amount :</td>  
          <td><form:input path="cumTotIntlTransAmount" /></td>
         </tr> 
        
         <tr>  
          <td>Cumulative Total International Transaction Amount Lower Limit :</td>  
          <td><form:input path="cumTotIntlTransAmtLwrLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Cumulative Total International Transaction Amount Upper Limit :</td>  
          <td><form:input path="cumTotIntlTransAmtUprLmt" /></td>
         </tr> 
                
         <tr>  
          <td>Encrypted PIN :</td>  
          <td><form:input path="encryptedPin" /></td>
         </tr> 
                
         <tr>  
          <td>PIN Try Counter :</td>  
          <td><form:input path="pinTryCounter" /></td>
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
