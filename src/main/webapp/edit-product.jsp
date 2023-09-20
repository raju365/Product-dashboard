<html>
 <%@ include file="add-css.jsp" %>
 <body>
 <div class='dvv'>
   <label class='lah'>Edit Product Form</label>
  </div>
  <div class='container'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
    <form action="update-record" method="post">
    <div class='row'>
      <div class='form-group col-md-10'>
        <label for='pid' class='la'>Product id</label><span> *</span>
      	<input class='form-control' value="${product.pid}" readonly="readonly" type='text' id='pid' name='pid' required>
      </div>
     </div> 
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='name' class='la'>Edit product name</label><span> *</span>
      	<input class='form-control' value="${product.name}" type='text' id='name' name='name' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='brand' class='la'>Edit product brand</label><span> *</span>
      	<input class='form-control' value="${product.brand}" type='text' id='brand' name='brand' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='quantityquantity' class='la'>Edit product quantity</label><span> *</span>
      	<input class='form-control' value="${product.quantity}" type='text' id='quantity' name='quantity' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='price' class='la'>Edit product price</label><span> *</span>
      	<input class='form-control' value="${product.price}" type='text' id='price' name='price' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-10'>
       <button class='btn btn-primary'>Update Record</button>
       <input type="button"  class='btn btn-secondary'  onclick='history.back()' value="Cancel">
      </div>
     </div> 
     </form>
    </div>
   </div>
  </div>
 </body>
</html>