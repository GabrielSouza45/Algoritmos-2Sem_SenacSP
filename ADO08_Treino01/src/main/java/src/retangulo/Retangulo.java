package src.retangulo;

public class Retangulo {

    private double altura;
    private double base;

    private double area;
    private double perimetro;

    public Retangulo(double altura, double base) {

        this.altura = altura;
        this.base = base;

        this.area();
        this.perimetro();

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


    public double getArea() {
        this.area();
        return area;
    }

    public double getPerimetro() {
        this.perimetro();
        return perimetro;
    }

    private void area(){
        this.area = this.base * this.altura;
    }

    private void perimetro(){
        this.perimetro = 2 * (this.base + this.altura);
    }
}
