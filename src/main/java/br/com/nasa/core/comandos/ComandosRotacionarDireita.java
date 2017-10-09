package br.com.nasa.core.comandos;

import br.com.nasa.core.dominio.Robo;

public class ComandosRotacionarDireita implements IComando {

	@Override
	public void executar(Robo robo) {
		robo.girarCameraDireita();
	}
}
