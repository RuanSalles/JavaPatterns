package org.criacionais.factory;

public class CrepeFactory implements ComidaFactory<Crepe, CrepeSabor>{
    @Override
    public Crepe criarComida(Double valor, CrepeSabor sabor) {
        return new Crepe(valor, sabor);
    }
}
