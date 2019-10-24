<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PridekKlienta</title>
</head>
<body>

	<section>
		<h1>Klientai</h1>
		<p>Pridėk naują klientą</p>
	</section>


	<section>
		<form:form method="POST" modelAttribute="newCustomer">
			<fieldset>
				<legend>Pridėk naują klientą:</legend>


				<div>
					<label>Kliento Id</label>
				</div>
				<div>
					<form:input path="id" type="number" />
				</div>
				<%-- 
				<div>
					<label for="klientoId"><spring:message
							code="addCustomer.form.CustomerId.label" /></label>
					<form:input id="klientoId" path="id" type="Integer"
						class="form:input-large" />
				</div> --%>

				<div>
					<label >Customer name</label>
					<form:input path="name" type="text" />
				</div>

				<div>
					<label>Customer adress</label>
					<form:input path="adress" type="text"/>
				</div>



				<%-- 
				<div>
					<label for="description">Description</label>
					<form:textarea id="description" path="description" rows="2" />
				</div> --%>

				<%-- 			Neatliekame data bindingo dėl ribojimų	
				<div>
					<label for="discontinued">Discontinued</label>
					<form:checkbox id="discontinued" path="discontinued" />
				</div> --%>

				<%-- 
				<div class="form-group">
					<label for="condition">Condition</label>
					<div>
						<form:radiobutton path="condition" value="New" />
						New
						<form:radiobutton path="condition" value="Old" />
						Old
						<form:radiobutton path="condition" value="Refurbished" />
						Refurbished
					</div>
				</div> --%>

				<input type="submit"  value="Add new customer" />


			</fieldset>

		</form:form>
	</section>

</body>
</html>