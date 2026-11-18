package org.criacionais.factory;

public class Pizza extends Comida {
    PizzaSabor sabor;

    public Pizza(Double valor, PizzaSabor sabor) {
        super("Pizza", valor, ComidaTipo.PIZZA);
        this.sabor = sabor;
    }

    public PizzaSabor getSabor() {
        return sabor;
    }

}
