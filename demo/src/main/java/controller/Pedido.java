package main.java.controller;

import main.java.model.bebida.Bebida;
import main.java.model.bebida.Cafe;
import main.java.model.decorator.Chantilly;
import main.java.model.decorator.Chocolate;
import main.java.model.decorator.DecoratorLeite;

public class Pedido {
    public static void main(String[] args) {
        Bebida b=new Cafe();

        DecoratorLeite dl = new DecoratorLeite(b);
        System.out.println(dl.getPreco());
        System.out.println(dl.getDescricao());

        Chocolate cafeChocolate = new Chocolate(b);
        System.out.println(cafeChocolate.getPreco());
        System.out.println(cafeChocolate.getDescricao());

        Chantilly cafeChantilly = new Chantilly(cafeChocolate);
        System.out.println(cafeChantilly.getPreco());
        System.out.println(cafeChantilly.getDescricao());
    }
}
