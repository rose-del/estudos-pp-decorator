package main.java.model.decorator;

import main.java.model.bebida.Cafe;
import model.bebida.Bebida;

public class DecoratorLeite extends BebidaDecorator{


    public DecoratorLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPreco() {
        return Cafe.getPreco() +1.50;
    }

    @Override
    public void getDescricao() {
        Cafe.getDescricao();
        System.out.print(" com leite");

    }
}
