<%@ include file="./header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="row">
	<!-- side bar -->
	<div class="col-md-3">
		<h3>brands</h3>
		<ul class="list-group">
			<c:forEach items="${brands}" var="br">
				<li class="list-group-items"><a
					href="./view-products?brands=${br}">${br}</a></li>
			</c:forEach>
		</ul>


		<h3>Categories</h3>
		<ul class="list-group">
			<c:forEach items="${categories}" var="c">
				<li class="list-group-items"><a
					href="./view-products?categories=${c}">${c}</a></li>
			</c:forEach>
		</ul>
	</div>
	<div class="col-md-9">
		<div class="row">
			<c:forEach items="${products}" var="p">
				<div class="col-md-4 col-sm-6">
					<div class="card" style="width: 18rem;">
						<img src="${p.picture}" class="card-img-top" alt="${p.name}">
						<div class="card-body">
							<h5 class="card-title">${p.description}</h5>
							<p class="card-text">${p.quantityPerUnit}</p>
							<p class="card-text">&#x20B9 ${p.unitPrice}</p>
							<a href="addtocart.jsp" class="btn btn-primary">Add to cart</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>


</div>
















<%-- <table class="table table-bordered table-striped table-hover">
	<thead>
		<tr>
			<th></th>
			<th>Name</th>
			<th>Description</th>
			<th>Quantity per Unit</th>
			<th>Unit price</th>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${products}" var="p">
			<tr>
				<td><img style="height: 50px;" src="${p.picture}"
					alt="${p.name}" /></td>
				<td>${p.name}</td>
				<td>${p.description}</td>
				<td>${quantityPerUnit}</td>
				<td>${p.unitPrice}</td>
			</tr>
		</c:forEach>

	</tbody>




</table>
 --%>


<%@ include file="./footer.jsp"%>