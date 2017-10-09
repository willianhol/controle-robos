package br.com.nasa.core.comandos;

import br.com.nasa.core.dominio.Robo;

public class ComandoRotacionarEsquerda implements IComando {

	@Override
	public void executar(Robo robo) {
		robo.girarCameraEsquerda();
	}

}
