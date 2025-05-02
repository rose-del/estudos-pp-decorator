package main.java.model.decorator;

import main.java.model.decorator.BebidaDecorator;
import main.java.model.bebida.Bebida;


public class Chantilly extends BebidaDecorator {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " com Chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.50;
    }
}