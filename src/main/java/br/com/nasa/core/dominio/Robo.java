package br.com.nasa.core.dominio;

import br.com.nasa.exceptions.ForaDoPerimetroException;

public class Robo {

	private int eixoX;
	private int eixoY;
	private Orientacao orientacao;

	public Robo() {
		this.eixoX = 0;
		this.eixoY = 0;
		this.orientacao = Orientacao.NORTE;
	}

	public void andar() {
		if (Orientacao.NORTE.equals(orientacao)) {
			eixoY++;
		} else if (Orientacao.SUL.equals(orientacao)) {
			eixoY--;
		} else if (Orientacao.LESTE.equals(orientacao)) {
			eixoX++;
		} else if (Orientacao.OESTE.equals(orientacao)) {
			eixoX--;
		}
		validate();
	}

	private void validate() {
		validaPosicaoEixoX();
		validaPosicaoEixoY();
	}

	private void validaPosicaoEixoY() {
		if (eixoY >= Limites.EIXO_Y || eixoY < Limites.POSICAO_0) {
			throw new ForaDoPerimetroException();
		}
	}

	private void validaPosicaoEixoX() {
		if (eixoX >= Limites.EIXO_X || eixoX < Limites.POSICAO_0) {
			throw new ForaDoPerimetroException();
		}
	}

	public void girarCameraEsquerda() {
		this.orientacao = orientacao.rotacaoParaEsquerda();
	}
	
	public void girarCameraDireita() {
		this.orientacao = orientacao.rotacaoParaDireita();
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s)", eixoX, eixoY, orientacao.rotulo());
	}


}
