<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
		<title>Todos</title>
	</head>
	<body>
		<h1>Welcome ${user}!</h1>
		<hr>
		<h1>Your Todos are </h1>
		<table>
			<thead>
			<tr>
				<th>id</th>
				<th>description</th>
				<th>target date</th>
				<th>is done? </th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id }</td>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>