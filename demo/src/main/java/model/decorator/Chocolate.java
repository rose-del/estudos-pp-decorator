package main.java.model.decorator;

import main.java.model.decorator.BebidaDecorator;
import main.java.model.bebida.Bebida;

public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.00;
    }

    public String getDescricao(){
        return bebida.getDescricao() + " com Chocolate";
    }
}
