<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
		<title>Add Todos</title>
	</head>
	<body>
		<%@ include file= "common/navigation.jspf" %>
		<div class="container">
			<h1>Todo Details</h1>
			<hr>
			
			<form:form method="post" modelAttribute="todo">
				
				<fieldset>
					<form:label path="description">Description</form:label> 
					<form:input type="text" name="description" required="required" path="description"/>
					<form:errors path="description" cssClass="text-warning"/>
				</fieldset>

				<fieldset>
					<form:label path="targetDate">Target Date</form:label> 
					<form:input type="text" name="targetDate" required="required" path="targetDate"/>
					<form:errors path="targetDate" cssClass="text-warning"/>
				</fieldset>
				
				<form:input type="hidden" path="id"/>
				<form:input type="hidden" path="done"/>
				<input type = "submit" class = "btn btn-success"/>

			</form:form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
		
		<script type="text/javascript">
			$('#targetDate').datepicker({
			    format: 'yyyy-mm-dd'			
			});
		</script>
	</body>
</html>
