package br.com.nasa.core;

import br.com.nasa.core.comandos.IComando;
import br.com.nasa.core.comandos.Movimento;
import br.com.nasa.core.comandos.ValidarInstrucoes;
import br.com.nasa.core.dominio.Robo;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class Executor {

    private LinkedList<IComando> converterComandos(String comandos) {
        LinkedList<IComando> listaComandos = new LinkedList<>();

        for (char comando : comandos.toCharArray()) {
            listaComandos.add(Movimento.valueOf(String.valueOf(comando)).getComando());
        }
        return listaComandos;
    }

    public String movimentar(Robo robo, String comandos) {
        ValidarInstrucoes.validarComandosRobos(comandos);
        converterComandos(comandos).forEach(c -> c.executar(robo));
        return robo.toString();
    }

}
