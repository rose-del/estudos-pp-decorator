package main.java.model.decorator;

import main.java.model.decorator.BebidaDecorator;
import main.java.model.bebida.Bebida;

public class Chocolate extends BebidaDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return 0;
    }

    public String getDescricao(){
        return "com Chocolate";
    }

    public double getExtra() {
        return 2.00;
    }
}
