package br.com.nasa.core.comandos;

import br.com.nasa.exceptions.ComandoInvalidoException;

import java.util.Objects;

public class ValidarInstrucoes {

    public static final String REGEX_VALIDACAO = "[MLR]+";

    private ValidarInstrucoes() {
        // excluido.
    }

    /**
     * @param String
     * Comandos permitidos ou sucessão destas siglas
     *  M - Andar
     *  L - Girar 90 graus para esquerda
     *  R - Girar 90 graus para direita
     */
    public static void validarComandosRobos(String comandos) {
        if (Objects.isNull(comandos) || !comandos.matches(REGEX_VALIDACAO)) {
            throw new ComandoInvalidoException();
        }
    }
}
