package main.java.model.decorator;
import main.java.model.bebida.Bebida;

public abstract class BebidaDecorator extends Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public abstract double getPreco();

    public abstract String getDescricao();



}