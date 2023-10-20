package src.triangulo_retangulo;

public class TrianguloRetangulo {

    private double catetoOposto;
    private double catetoAdjacente;

    public TrianguloRetangulo() {

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


    public double area() {
        return (this.catetoOposto * this.catetoAdjacente) / 2;
    }

    public double hipotenusa() {
        return Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
    }

    public double perimetro() {
        return this.hipotenusa() + this.catetoOposto + this.catetoAdjacente;
    }

}
