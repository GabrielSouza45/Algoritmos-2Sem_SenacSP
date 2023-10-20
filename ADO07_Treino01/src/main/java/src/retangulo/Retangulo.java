package src.retangulo;

public class Retangulo {

    private double altura;
    private double base;

    public Retangulo() {

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        return this.base * this.altura;
    }

    public double perimetro() {
        return 2 * (this.base + this.altura);
    }


}
