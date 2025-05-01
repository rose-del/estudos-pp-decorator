package main.java.model.decorator;

import main.java.model.bebida.Cafe;
import main.java.model.bebida.Bebida;

public class DecoratorLeite extends BebidaDecorator{


    public DecoratorLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() +1.50;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao()+" com leite";

    }
}
