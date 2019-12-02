<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt"	       %>  

		<h1>Add New Acquirer</h1>
       <form:form method="post" action="acquirerFormJSPPostAction">  
      	<table >  
      	
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr> 
          
         <tr>  
          <td>Street :</td>  
          <td><form:input path="street" /></td>
         </tr> 
          
         <tr>  
          <td>City :</td>  
          <td><form:input path="city" /></td>
         </tr> 
          
         <tr>  
          <td>State :</td>  
          <td><form:input path="state" /></td>
         </tr> 
         
         <tr>  
          <td>Country :</td>  
          <td><form:input path="country" /></td>
         </tr> 
          
         <tr>  
          <td>Zip Code :</td>  
          <td><form:input path="zipCode" /></td>
         </tr> 
          
         <tr>  
          <td>Phone Number :</td>  
          <td><form:input path="phoneNumber" /></td>
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
