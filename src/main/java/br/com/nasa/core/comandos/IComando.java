package br.com.nasa.core.comandos;

import br.com.nasa.core.dominio.Robo;

@FunctionalInterface
public interface IComando {
	
	public void executar(Robo robo);

}
