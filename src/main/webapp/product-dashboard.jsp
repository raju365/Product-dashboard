<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <%@ include file="add-css.jsp" %>
 <body>
  <div class='dvv'>
   <label class='lah'>Product Dashbaord</label>
  </div>
  <div class='container'>
  <a href='add' class='la'><i class='fa fa-user-plus'></i>Add Product</a>
   <div class='card col-md-12 mx-auto'>
    <div class='card-body'>
      <c:if test="${plist=='[]'}">
      <div class='dv'>
         <label class='la' style='color:red'>Product dash board has no record</label>
       </div>
      </c:if>
     <c:if test="${plist!='[]'}">
     <table class='table table-hover'>
      <thead>
       <tr>
        <th>Product id</th><th>Product name</th>
        <th>Product brand</th><th>Product quantity</th>
        <th>Product price</th><th style='color:blue'>Action</th>
       </tr>
      </thead>
      <tbody>
      <c:forEach var="product" items="${plist}">
        <tr>
    	   <td>${product.pid}</td>
    	   <td>${product.name}</td>
    	   <td>${product.brand}</td>
    	   <td>${product.quantity}</td>
    	   <td>${product.price}</td>
    	   <td>
    	      <a href='edit-record?pid=${product.pid}'>Edit |</a>
    	      <a href='delete-record?pid=${product.pid}' onclick='return confirm("Are you sure to delete?")'>Delete</a>
    	   </td>
    	  </tr>
    	</c:forEach>  
      </tbody>
     </table>
     </c:if>
    </div>
   </div>
  </div>
 </body>
</html>