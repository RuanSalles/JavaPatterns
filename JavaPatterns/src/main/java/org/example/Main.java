package org.example;

import org.criacionais.factory.Comida;
import org.criacionais.factory.ComidaFactory;
import org.criacionais.factory.Crepe;
import org.criacionais.factory.CrepeFactory;
import org.criacionais.factory.CrepeSabor;
import org.criacionais.factory.Hamburguer;
import org.criacionais.factory.HamburguerFactory;
import org.criacionais.factory.HamburguerSabor;
import org.criacionais.factory.Pizza;
import org.criacionais.factory.PizzaFactory;
import org.criacionais.factory.PizzaSabor;

public class Main {
    public static void main(String[] args) {
        ComidaFactory<Pizza, PizzaSabor> pizzaFactory = new PizzaFactory();
        ComidaFactory<Hamburguer, HamburguerSabor> hamburguerFactory = new HamburguerFactory();
        ComidaFactory<Crepe, CrepeSabor> crepeFactory = new CrepeFactory();

        Pizza pizza = pizzaFactory.criarComida(39.9, PizzaSabor.MARGUERITA);
        Hamburguer hamburguer = hamburguerFactory.criarComida(27.5, HamburguerSabor.XBACON);
        Crepe crepe = crepeFactory.criarComida(22.0, CrepeSabor.FRANGO);

        imprimir(pizza, pizza.getSabor());
        imprimir(hamburguer, hamburguer.getSabor());
        imprimir(crepe, crepe.getSabor());
    }

    private static void imprimir(Comida comida, Enum<?> sabor) {
        System.out.printf("%s | %s | %s | R$ %.2f%n",
                comida.getNome(), comida.getTipo(), sabor, comida.getValor());
    }
}
