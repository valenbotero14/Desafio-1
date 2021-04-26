package Calculadora.dominio;


public class calculator {
    private static double suma = 0;

    public calculator() {
        this.suma = suma;
    }
    public static double getSuma(double numeros) {
        return suma = suma + numeros;
    }

    public static double getResta(double...numero) {
        double resta = numero[0];
        int contador = 1;
        while (contador < numero.length) {
            resta = resta - numero[contador];
            contador = contador + 1;
        }
        return resta;
    }

    public static double getMultiplicacion(double... numero) {
        double multiplicacion = numero[0];
        int contador = 1;
        while (contador < numero.length) {
            multiplicacion = multiplicacion * numero[contador];
            contador = contador + 1;
        }
        return multiplicacion;
    }

    public static double getDivision(double...numero) {
        double division = numero[0];
        int contador = 1;
        while (contador < numero.length) {
            division = division / numero[contador];
            contador = contador + 1;
        }
        return division;
    }
}








