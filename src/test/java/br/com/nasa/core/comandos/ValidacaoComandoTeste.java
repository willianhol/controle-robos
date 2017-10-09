package br.com.nasa.core.comandos;

import br.com.nasa.exceptions.ComandoInvalidoException;
import org.junit.Assert;
import org.junit.Test;

public class ValidacaoComandoTeste {

    @Test
    public void regexCorreta() {
        ValidarInstrucoes.validarComandosRobos("MMM");
        Assert.assertTrue(Boolean.TRUE);
    }

    @Test(expected = ComandoInvalidoException.class)
    public void regexIncorretaErroNoCentro() {
        ValidarInstrucoes.validarComandosRobos("MAM");

        Assert.assertFalse(Boolean.TRUE);
    }

    @Test(expected = ComandoInvalidoException.class)
    public void regexIncorretaErroBordaInical() {
        ValidarInstrucoes.validarComandosRobos("AMM");

        Assert.assertFalse(Boolean.TRUE);
    }

    @Test(expected = ComandoInvalidoException.class)
    public void regexIncorretaErroBordaFinal() {
        ValidarInstrucoes.validarComandosRobos("MMA");

        Assert.assertFalse(Boolean.TRUE);
    }

    @Test(expected = ComandoInvalidoException.class)
    public void regexVazia(){
        ValidarInstrucoes.validarComandosRobos("");
        Assert.assertFalse(Boolean.TRUE);
    }
}
