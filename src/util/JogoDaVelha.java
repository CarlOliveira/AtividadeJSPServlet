package util;

import java.util.ArrayList;

public class JogoDaVelha {

	private String jogadorAtual;
	private ArrayList<String> posicao = new ArrayList<String>();

	public JogoDaVelha(String jogadorAtual, ArrayList<String> posicao) {
		super();
		this.jogadorAtual = jogadorAtual;
		this.posicao = posicao;
	}

	public String getJogadorAtual() {
		return jogadorAtual;
	}

	public void setJogadorAtual(String jogadorAtual) {
		this.jogadorAtual = jogadorAtual;
	}

	public ArrayList<String> getPosicao() {
		return posicao;
	}

	public void setPosicao(ArrayList<String> posicao) {
		this.posicao = posicao;
	}

	public String resultado(ArrayList<String> posicoes) {

		String resultado = null;
		
		if (posicoes.get(0).equals("X") && posicoes.get(1).equals("X") && posicoes.get(2).equals("X")
				|| posicoes.get(3).equals("X") && posicoes.get(4).equals("X") && posicoes.get(5).equals("X")
				|| posicoes.get(6).equals("X") && posicoes.get(7).equals("X") && posicoes.get(8).equals("X")
				|| posicoes.get(0).equals("X") && posicoes.get(3).equals("X") && posicoes.get(6).equals("X")
				|| posicoes.get(1).equals("X") && posicoes.get(4).equals("X") && posicoes.get(7).equals("X")
				|| posicoes.get(2).equals("X") && posicoes.get(5).equals("X") && posicoes.get(8).equals("X")
				|| posicoes.get(0).equals("X") && posicoes.get(4).equals("X") && posicoes.get(8).equals("X")
				|| posicoes.get(2).equals("X") && posicoes.get(4).equals("X") && posicoes.get(6).equals("X")) {

			resultado = "O vencendor é: X";
		} else if (posicoes.get(0).equals("O") && posicoes.get(1).equals("O") && posicoes.get(2).equals("O")
				|| posicoes.get(3).equals("O") && posicoes.get(4).equals("O") && posicoes.get(5).equals("O")
				|| posicoes.get(6).equals("O") && posicoes.get(7).equals("O") && posicoes.get(8).equals("O")
				|| posicoes.get(0).equals("O") && posicoes.get(3).equals("O") && posicoes.get(6).equals("O")
				|| posicoes.get(1).equals("O") && posicoes.get(4).equals("O") && posicoes.get(7).equals("O")
				|| posicoes.get(2).equals("O") && posicoes.get(5).equals("O") && posicoes.get(8).equals("O")
				|| posicoes.get(0).equals("O") && posicoes.get(4).equals("O") && posicoes.get(8).equals("O")
				|| posicoes.get(2).equals("O") && posicoes.get(4).equals("O") && posicoes.get(6).equals("O")) {
			resultado = "O vencendor é: O";
		}
		return resultado;
	}
}
