package model.decorator;

public class Chocolate extends BebidaDecorator {

    public String getDescricao(){
        return "com Chocolate";
    }

    public double getExtra() {
        return 2.00;
    }
}
