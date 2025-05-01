package main.java.model.bebida;
import main.java.model.bebida.Bebida;

public class Cafe extends Bebida{

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}
