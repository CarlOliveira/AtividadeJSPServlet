package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.JogoDaVelha;

public class JogoDaVelhaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<JogoDaVelha> tabuleiro = new ArrayList<>();
	ArrayList<String> posicoes = new ArrayList<>();
	String jogador = "X";
	String resultado = null;
	boolean condicaoIf = true;

	public void init() {

		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");
		posicoes.add("  ");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int posicaoClick = Integer.parseInt(request.getParameter("celulaJogada"));

		posicoes.set(posicaoClick - 1, jogador);

		if (jogador.equals("X")) {
			jogador = "O";
		} else {
			jogador = "X";
		}

		request.setAttribute("jogador", jogador);

		JogoDaVelha jogo = new JogoDaVelha(jogador, posicoes);
		
		int i = 0;
		for (String posicao : posicoes) {
			request.setAttribute("posicao" + (i + 1), posicao);
			resultado = jogo.resultado(posicoes);
			i++;
		}
		request.setAttribute("resultado", resultado);
		RequestDispatcher rd = request.getRequestDispatcher("jogoDaVelha.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
