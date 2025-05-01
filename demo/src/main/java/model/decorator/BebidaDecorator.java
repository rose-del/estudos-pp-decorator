package main.java.model.decorator;
import model.bebida.Bebida;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }



    public abstract double getPreco(double x);

    public abstract void getDescricao();



}