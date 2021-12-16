package Modelo;
public class Modelo {
    private int valor1 = 28;
    private int valor2 = 69;
    private int total = suma();

    public Modelo() {
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
    public int suma(){
        return this.valor1 + this.valor2;
    }

    public int getTotal() {
        return total;
    }
    
}
