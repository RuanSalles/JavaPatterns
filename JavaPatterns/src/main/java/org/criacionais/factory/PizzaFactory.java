package org.criacionais.factory;

public class PizzaFactory implements ComidaFactory<Pizza, PizzaSabor> {
    @Override
    public Pizza criarComida(Double valor, PizzaSabor sabor) {
        return new Pizza(valor, sabor);
    }
}
