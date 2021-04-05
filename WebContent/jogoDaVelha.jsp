<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jogo da Velha</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<form method="GET" action="JogoDaVelhaServlet">
		<div class="container" align="center">

			<h1>
				 Jogo da Velha ! 
			</h1>

			<input type="hidden" name="celulaJogada" id="celulaJogada" />

			<div class="row row-cols-3" id="tabela">
				<div class="col">
					<button type="submit" onclick="definirID(1)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao1")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(2)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao2")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(3)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao3")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(4)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao4")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(5)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao5")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(6)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao6")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(7)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao7")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(8)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao8")%></button>
				</div>
				<div class="col">
					<button type="submit" onclick="definirID(9)"
						class="btn btn-outline-primary" name="1"><%=request.getAttribute("posicao9")%></button>
				</div>
			
			
			<h2>É a vez do jogador: <%=request.getAttribute("jogador")%></h2>
			<h2><%=request.getAttribute("resultado")%></h2>
			
		
			</div>
		</div>



		<script>
			function definirID(id) {
				document.getElementById('celulaJogada').value = id;
			}
		</script>

	</form>

</body>
</html>