<%@ include file="./header.jsp"%>

<h3>Add a new product details</h3>
<hr />


<form method="POST">
	
	
	<div class="form-group row">
		<label for="category" class="col-sm-2 col-form-label">Category</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="category" name="category">
		</div>
	</div>
	<div class="form-group row">
		<label for="brand" class="col-sm-2 col-form-label">Brand</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="brand" name="brand">
		</div>
	</div>
	
	
	<button class="btn btn-primary">Save</button>
</form>

<%@ include file="./footer.jsp"%>