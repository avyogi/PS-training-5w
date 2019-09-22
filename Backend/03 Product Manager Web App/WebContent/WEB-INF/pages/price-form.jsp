<%@ include  file="header.txt" %>

<form action ="./get-products-by-price-range">
	
	<div class = "form-group row">
		<label class="col-md-4">Minimum price</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="min-price">
		</div>
	</div>
	
	<div class = "form-group row">
		<label class="col-md-4">Maximum price</label>
		<div class="col-md-8">
			<input type="text" class="form-control" name="max-price">
		</div>
	</div>
	
	<div class = "form-group row">
		<label class="col-md-4"></label>
		<div class="col-md-8">
			<button class="btn btn-primary">Get Products</button>
		</div>
	</div>
	
	
</form>

<%@ include file="footer.txt" %>
