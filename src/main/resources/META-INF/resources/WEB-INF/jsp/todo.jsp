<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Add Todos</title>
	</head>
	<body>
		<div class="container">
			<h1>Todo Details</h1>
			<hr>
			
			<form:form method="post" modelAttribute="todo">
				Description: <form:input type="text" name="description" required="required" path="description"/>
				<form:errors path="description" cssClass="text-warning"/>
				<form:input type="hidden" path="id"/>
				<form:input type="hidden" path="done"/>
				<input type = "submit" class = "btn btn-success"/>
			</form:form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>