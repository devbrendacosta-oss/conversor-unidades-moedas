package conversor;

public class ConversorMoeda {

    private static final double TAXA_DOLAR = 5.00;
    private static final double TAXA_EURO = 5.50;

    public static double realParaDolar(double real) {
        return real / TAXA_DOLAR;
    }

    public static double dolarParaReal(double dolar) {
        return dolar * TAXA_DOLAR;
    }

    public static double realParaEuro(double real) {
        return real / TAXA_EURO;
    }

    public static double euroParaReal(double euro) {
        return euro * TAXA_EURO;
    }
}
