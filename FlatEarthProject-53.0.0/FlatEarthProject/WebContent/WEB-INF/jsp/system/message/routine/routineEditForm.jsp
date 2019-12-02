<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Edit Scheme</h1>
       <form:form method="POST" action="/FlatEarthProject/schemeEditFormJSPPostAction">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
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
          <td>ZIP Code :</td>  
          <td><form:input path="zipCode" /></td>
         </tr> 
         
         <tr>  
          <td>Phone :</td>  
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
          <td>Modify User :</td>  
          <td><form:input path="modifyUser" /></td>
         </tr> 
                  
         <tr>  
          <td>Modify Timestamp :</td>  
          <td><form:input path="modifyTimestamp" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
         
        </table>  
       </form:form>  
