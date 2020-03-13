package main;

public class Frete {

    private double valor;

    public Frete(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Frete: " + this.valor;
    }
}
