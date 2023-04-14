package clase4;

import java.util.Scanner;

public class Exercise2 {
    /*
        Cree un programa que solicite un string por pantalla hasta que ingrese la palabra "fin"
     */

    public static  final String PALABRA_FIN_CICLO = "fin";

    public static void main(String[] args) {
        String palabra = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una palabra:");
            palabra = scanner.next();

        }while (!palabra.equalsIgnoreCase(PALABRA_FIN_CICLO));
    }
}
