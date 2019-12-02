<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt"	       %>  

		<h1>Add New Acquirer</h1>
       <form:form method="post" action="acquirerFormJSPPostAction">  
      	<table >  
        
         <tr>  
          <td>Product Code : </td> 
          <td><form:input path="productCode"  /></td>
         </tr> 
          
         <tr>  
          <td>Sequence :</td>  
          <td><form:input path="sequence" /></td>
         </tr> 
         
         <tr>  
          <td>Product Name :</td>  
          <td><form:input path="productName" /></td>
         </tr> 
         
         <tr>  
          <td>Description :</td>  
          <td><form:input path="description" /></td>
         </tr>     
              
         <tr>  
          <td>Supplier Id :</td>  
          <td><form:input path="supplierId" /></td>
         </tr> 
         
         <tr>  
          <td>Category Id :</td>  
          <td><form:input path="categoryId" /></td>
         </tr> 
         
         <tr>  
          <td>Unit Size :</td>  
          <td><form:input path="unitSize" /></td>
         </tr> 
         
         <tr>  
          <td>Unit Price :</td>  
          <td><form:input path="unitPrice" /></td>
         </tr> 
        
         <tr>  
          <td>Suggested Price :</td>  
          <td><form:input path="suggestedPrice" /></td>
         </tr> 
                
         <tr>  
          <td>Available Size :</td>  
          <td><form:input path="availableSize" /></td>
         </tr> 
                
         <tr>  
          <td>Available Color :</td>  
          <td><form:input path="availableColor" /></td>
         </tr> 
                
         <tr>  
          <td>Discount Percentage :</td>  
          <td><form:input path="discountPercentage" /></td>
         </tr> 
                
         <tr>  
          <td>Unit Weight :</td>  
          <td><form:input path="unitWeight" /></td>
         </tr> 
                
         <tr>  
          <td>Units In Stock :</td>  
          <td><form:input path="unitsInStock" /></td>
         </tr> 
        
         <tr>  
          <td>Units On Order :</td>  
          <td><form:input path="unitsOnOrder" /></td>
         </tr> 
        
         <tr>  
          <td>Reorder Level :</td>  
          <td><form:input path="reorderLevel" /></td>
         </tr> 
                
         <tr>  
          <td>Product Available :</td>  
          <td><form:input path="productAvailable" /></td>
         </tr> 
                
         <tr>  
          <td>Discount Available :</td>  
          <td><form:input path="discountAvailable" /></td>
         </tr> 
                
         <tr>  
          <td>Picture Id :</td>  
          <td><form:input path="pictureId" /></td>
         </tr> 
        
         <tr>  
          <td>Product Ranking :</td>  
          <td><form:input path="productRanking" /></td>
         </tr> 
      
         <tr>  
          <td>Product Notes :</td>  
          <td><form:input path="productNotes" /></td>
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
