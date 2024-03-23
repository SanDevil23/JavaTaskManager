<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Login Page</title>
	</head>
	<body>
		<h1 class="center">Login</h1>
		<hr>
		<div class=" container-fluid card form-control form-control-lg text-xl">
			
			<pre>${errorMessage }</pre>
			<form method = "post">
				Name: <input type = "text" name = "name" placeholder="Enter your name">
				Password: <input type = "password" name = "pass" placeholder="Enter your password">
				<input class="btn btn-success" type = "submit" name="submit">
			</form>
		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>