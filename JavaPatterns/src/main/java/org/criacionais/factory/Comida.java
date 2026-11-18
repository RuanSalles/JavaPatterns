package org.criacionais.factory;

public abstract class Comida {
    private String nome;
    private Double valor;
    private ComidaTipo tipo;

    protected Comida(String nome, Double valor, ComidaTipo tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public ComidaTipo getTipo() {
        return tipo;
    }


    public String getNome() {
        return nome;
    }


}
