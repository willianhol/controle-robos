package br.com.nasa.core.comandos;

public enum Movimento {

    M (new ComandoAndar()),
    L (new ComandoRotacionarEsquerda()),
    R (new ComandosRotacionarDireita());

    private IComando comando;

    Movimento(IComando comando) {
        this.comando = comando;
    }

    public IComando getComando() {
        return comando;
    }

    public static Movimento toEnum(char value) {
        return Movimento.valueOf(String.valueOf(value));
    }
}
