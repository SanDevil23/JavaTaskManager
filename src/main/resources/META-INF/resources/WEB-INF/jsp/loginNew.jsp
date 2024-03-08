<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
	<head>
		<title>Login Page</title>
	</head>
	<body>
		<h1>Login</h1>
		<pre>${errorMessage }</pre>
		<form method = "post">
			Name:<input type = "text" name = "name" placeholder="Enter your name">
			Password:<input type = "password" name = "pass" placeholder="Enter your password">
			<input type = "submit" name="submit">
		</form>
	</body>
</html>