<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">	
		<title>Welcome Page</title>
	</head>
	<body>
		<%@ include file= "common/navigation.jspf" %>
		<div class="container">
			<h1>Welcome to the Redirected Page </h1>
			
			<div><b>username:</b> ${user}</div>
			<h5><a href="list-todos">Manage Todos</a></h5>
			
			<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
			<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		</div>

	</body>
</html>