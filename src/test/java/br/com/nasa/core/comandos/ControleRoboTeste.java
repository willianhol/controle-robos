package br.com.nasa.core.comandos;


import br.com.nasa.core.Executor;
import br.com.nasa.core.dominio.Robo;
import br.com.nasa.exceptions.ComandoInvalidoException;
import br.com.nasa.exceptions.ForaDoPerimetroException;
import org.junit.Assert;
import org.junit.Test;


public class ControleRoboTeste {

	private Executor executor = new Executor();

	@Test
	public void girarParaDireita() {
		Assert.assertEquals("(2, 0, S)", executor.movimentar(getRobo(), "MMRMMRMM"));
	}
	
	@Test
	public void girarParaEsquerda() {
		Assert.assertEquals("(0, 2, W)", executor.movimentar(getRobo(), "MML"));
	}

	private Robo getRobo() {
		return new Robo();
	}

	@Test
	public void girarParaEsquerdaNovamente() {
		Assert.assertEquals("(0, 2, W)", executor.movimentar(getRobo(), "MML"));
	}

	@Test (expected = ComandoInvalidoException.class)
	public void semMovimento() {
		Assert.assertEquals("(0, 0, N)", executor.movimentar(getRobo(), ""));
	}

	@Test (expected = ForaDoPerimetroException.class)
	public void foraDoPerimetroXTest() {
		String comando = "LMM";
		executor.movimentar(getRobo(), comando);
	}

	@Test (expected = ForaDoPerimetroException.class)
	public void foraDoPerimetroY() {
		executor.movimentar(getRobo(), "LLMM");
	}

}
