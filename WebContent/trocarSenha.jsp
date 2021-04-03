<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trocar Senha</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form method="GET" action="LoginServlet">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email:</label> <input
					type="email" class="form-control" name="email">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Nova
					Senha:</label> <input type="password" class="form-control" name="senha">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Confirmar
					Senha:</label> <input type="password" class="form-control"
					name="confirmarSenha">
			</div>
			<button type="submit" class="btn btn-primary">Trocar senha</button>
		</form>
	</div>
</body>
</html>