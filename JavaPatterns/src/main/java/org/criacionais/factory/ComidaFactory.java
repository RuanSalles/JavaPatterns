package org.criacionais.factory;

public interface ComidaFactory<T extends Comida, S extends Enum<S>> {
    T criarComida(Double valor, S sabor);
}
