package src.triangulo_retangulo;

public class TrianguloRetangulo {

    private double catetoOposto;
    private double catetoAdjacente;

    private double area;
    private double perimetro;
    private double hipotenusa;


    public TrianguloRetangulo(double catetoOposto, double catetoAdjacente) {

        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;

        this.area();
        this.hipotenusa();
        this.perimetro();

    }

    public double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }


    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    private void area() {
        this.area = (this.catetoOposto * this.catetoAdjacente) / 2;
    }

    private void hipotenusa() {
        this.hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
    }

    private void perimetro() {
        this.perimetro = this.hipotenusa + this.catetoOposto + this.catetoAdjacente;
    }

}
