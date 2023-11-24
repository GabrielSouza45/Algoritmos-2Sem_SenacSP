package bases;

public class Bases {

    public int multiplicador(int a, int b) {

        if (b == 1){
            return a;
        }

        return a + multiplicador(a, b - 1);

    }

    public int potencia(int a, int b) {

        if (b == 1){
            return a;
        }

        return a * potencia(a, b - 1);

    }


    public double maximoDivisor(double a, double b) {

        if (b == 0) {
            return a;
        } else {
            return maximoDivisor(b, a % b);
        }

    }
}
