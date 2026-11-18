package org.criacionais.factory;

public class Crepe extends Comida {

    CrepeSabor sabor;

    public Crepe(Double valor, CrepeSabor sabor) {
        super("Crepe", valor, ComidaTipo.CREPE);
        this.sabor = sabor;
    }

    public CrepeSabor getSabor() {
        return sabor;
    }

}
