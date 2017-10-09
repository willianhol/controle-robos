package br.com.nasa.core.dominio;

public enum Orientacao {

	NORTE {
		@Override
		Orientacao rotacaoParaEsquerda() {return Orientacao.OESTE;}
		@Override
		Orientacao rotacaoParaDireita() {return Orientacao.LESTE;}
		@Override
		String rotulo() {return "N";}
	},
	LESTE {
		@Override
		Orientacao rotacaoParaEsquerda() {return Orientacao.NORTE;}
		@Override
		Orientacao rotacaoParaDireita() {return Orientacao.SUL;	}
		@Override
		String rotulo() {return "E";}
	},
	SUL {
		@Override
		Orientacao rotacaoParaEsquerda() {return Orientacao.LESTE;}
		@Override
		Orientacao rotacaoParaDireita() {return Orientacao.OESTE;}
		@Override
		String rotulo() {return "S";}
	},
	OESTE {
		@Override
		Orientacao rotacaoParaEsquerda() {return Orientacao.SUL;}
		@Override
		Orientacao rotacaoParaDireita() {return Orientacao.NORTE;}
		@Override
		String rotulo() {return "W";}
	};

	abstract Orientacao rotacaoParaDireita();
	abstract Orientacao rotacaoParaEsquerda();
	abstract String rotulo();

}
