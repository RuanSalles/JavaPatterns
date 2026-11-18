package org.criacionais.factory;

public class Hamburguer extends Comida {
    HamburguerSabor sabor;

    public Hamburguer(Double valor, HamburguerSabor sabor) {
        super("Hamburguer", valor, ComidaTipo.HAMBURGUER);
        this.sabor = sabor;
    }

    public HamburguerSabor getSabor() {
        return sabor;
    }

}
