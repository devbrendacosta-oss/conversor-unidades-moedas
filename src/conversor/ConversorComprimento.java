package conversor;

public class ConversorComprimento {

    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    public static double centimetrosParaMetros(double centimetros) {
        return centimetros / 100;
    }

    public static double metrosParaQuilometros(double metros) {
        return metros / 1000;
    }

    public static double quilometrosParaMetros(double quilometros) {
        return quilometros * 1000;
    }

    public static double centimetrosParaQuilometros(double centimetros) {
        return centimetros / 100000;
    }

    public static double quilometrosParaCentimetros(double quilometros) {
        return quilometros * 100000;
    }
}