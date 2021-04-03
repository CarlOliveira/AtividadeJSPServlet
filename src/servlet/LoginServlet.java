package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Usuario;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Usuario> usuarios = new ArrayList<>();

	public void init() {
		usuarios.add(new Usuario("usuario01@teste.com", "12345"));
		usuarios.add(new Usuario("usuario02@teste.com", "12345"));
		usuarios.add(new Usuario("usuario03@teste.com", "12345"));
	}

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String confirmarSenha = request.getParameter("confirmarSenha");

		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(email) && senha.equals(confirmarSenha)) {
				usuario.setSenha(senha);
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("acessoNegado.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		for (Usuario usuario : usuarios) {
			if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
				request.setAttribute("email", usuario.getEmail());
				RequestDispatcher rd = request.getRequestDispatcher("logado.jsp");
				rd.forward(request, response);
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher("acessoNegado.jsp");
		rd.forward(request, response);
	}
}
