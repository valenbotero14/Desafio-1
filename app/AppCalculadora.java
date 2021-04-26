package Calculadora.app;

import Calculadora.dominio.calculator;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;



public class AppCalculadora {
    public static final int SUMA = 0;
    public static final int RESTA = 1;
    public static final int MULTIPLICACION = 2;
    public static final int DIVISION = 3;
    private static double numeros;
    private static int contador = 0;



    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox(" ¿Redondear?");
        List<Object> opcionesCalculadora = Arrays.asList("Suma", "Resta", "Multiplicación", "División", checkBox);
        boolean Ejecutar = true;

        mensaje("Bienvenid@ a tu calculadora ideal! Dale ok para las operaciones");


        while (Ejecutar) {
            try {
                int opcionesC = JOptionPane.showOptionDialog(null, "¿Que operación deseas hacer?", "Calculator", 0, JOptionPane.QUESTION_MESSAGE, null, opcionesCalculadora.toArray(), null);

                switch (opcionesC) {
                    case SUMA: {
                        int pedirCantidad1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de números que desea: "));
                        while (contador < pedirCantidad1) {
                            contador = contador + 1;
                            double numeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el " + contador + "° número"));
                            calculator.getSuma(numeros);
                        }
                        if (checkBox.isSelected()) {
                            Math.round(calculator.getSuma(numeros));
                            mensaje("La suma de los números redondeada es: " + Math.round(calculator.getSuma(numeros)));
                        } else {
                            calculator.getSuma(numeros);
                            mensaje("La suma de los números sin redondiar es: " + calculator.getSuma(numeros));
                        }
                        break;
                    }
                    /*----------------------------------*/
                    case RESTA: {
                        int pedirCantidad2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de números que desea: "));
                        double[] numero = new double[pedirCantidad2];

                        while (contador < pedirCantidad2) {
                            double numeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el " + contador + "° número"));
                            numero[contador] = numeros;
                            contador = contador + 1;
                        }
                        if (checkBox.isSelected()) {
                            Math.round(calculator.getResta(numero));
                            mensaje("La resta de los números redondeada es: " + Math.round(calculator.getResta(numero)));
                        } else {
                            calculator.getResta(numero);
                            mensaje("La resta de los números sin redondiar es: " + calculator.getResta(numero));
                        }
                        break;
                    }
                    /*---------------------------------------*/
                    case MULTIPLICACION: {
                        int pedirCantidad3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de números que desea: "));
                        double[] numero = new double[pedirCantidad3];

                        while (contador < pedirCantidad3) {
                            double numeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el " + contador + "° número"));
                            numero[contador] = numeros;
                            contador = contador + 1;
                        }
                        if (checkBox.isSelected()) {
                            Math.round(calculator.getMultiplicacion(numero));
                            mensaje("La multiplicacion de los números redondeada es: " + Math.round(calculator.getMultiplicacion(numero)));
                        } else {
                            calculator.getDivision(numero);
                            mensaje("La multiplicacion de los números sin redondiar es: " + calculator.getMultiplicacion(numero));
                        }
                        break;
                    }
                    /*--------------------------------*/
                    case DIVISION: {
                        int pedirCantidad4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de números que desea: "));
                        double[] numero = new double[pedirCantidad4];

                        while (contador < pedirCantidad4) {
                            double numeros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el " + contador + "° número"));
                            numero[contador] = numeros;
                            contador = contador + 1;
                        }
                        if (checkBox.isSelected()) {
                            Math.round(calculator.getDivision(numero));
                            mensaje("La division de los números redondeada es: " + Math.round(calculator.getDivision(numero)));
                        } else {
                            calculator.getDivision(numero);
                            mensaje("La division de los números sin redondiar es: " + calculator.getDivision(numero));
                        }
                        break;
                    }
                    /*----------*/
                    default:
                        mensaje("No selecciono ninguna opcion!! Ya valimos");
                        Ejecutar = false;

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: No ingreso nada!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public static void mensaje (String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}



