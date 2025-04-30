package main.java.model.decorator;
import model.bebida.Bebida;

public abstract class BebidaDecorator {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }



    public abstract int getPreco(int x);

    public abstract void getDescricao();



}