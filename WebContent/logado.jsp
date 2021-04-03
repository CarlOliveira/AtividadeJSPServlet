<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Olá</title>
</head>
<body>
	<h1>
		Bem vindo,
		<%=request.getAttribute("email")%></h1>
	<h2>Logado com sucesso !</h2>
</body>
</html>