package org.criacionais.factory;

public class HamburguerFactory implements ComidaFactory<Hamburguer, HamburguerSabor>{
    @Override
    public Hamburguer criarComida(Double valor, HamburguerSabor sabor) {
        return new Hamburguer(valor, sabor);
    }
}
