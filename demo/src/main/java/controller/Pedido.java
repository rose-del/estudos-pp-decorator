package main.java.controller;

import main.java.model.bebida.Bebida;
import main.java.model.bebida.Cafe;
import main.java.model.decorator.DecoratorLeite;

public class Pedido {
    public static void main(String[] args) {
        Bebida b=new Cafe();
        DecoratorLeite dl=new DecoratorLeite(b);

        System.out.println(dl.getPreco());
        System.out.println(dl.getDescricao());
        
    }
}
