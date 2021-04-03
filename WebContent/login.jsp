<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form method="POST" action="LoginServlet">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email:</label> <input
					type="email" class="form-control" name="email">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Senha:</label>
				<input type="password" class="form-control" name="senha">
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>
		<a href="trocarSenha.jsp" method="GET">Esqueceu sua senha ?</a>
	</div>
</body>
</html>