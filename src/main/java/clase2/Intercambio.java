package clase2;

public class Intercambio {

    public Intercambio(){}

    public static void main(String[] args) {

        /*
            Escribe un programa que permita el intercambio de valores entre dos variables. Por ejemplo: Si una variable
            “num” tiene valor 10 y una variable “num2” tiene un valor 30, realizar las acciones necesarias para que
            “num” pase a tener valor 30 y “num2” pase a tener valor 10. Una vez realizado el cambio mostrar
            el resultado por pantalla.
            Nota: No está permitido hacer directamente

            num = 30;
            num2 = 10;

         */

        int num1 = 10;
        int num2 = 30;

        int aux = 0;

        System.out.println("Antes del cambio");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        aux = 10;
        num1 = num2;
        num2 = aux;

        System.out.println("Despues del cambio");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
