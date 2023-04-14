package clase2;

import java.util.Scanner;

public class Exercise1 {

    public Exercise1(){}

    public static void main(String[] args) {
        /*

        Hacer un programa que permita ingresar por consola un número que indica cuántos números será suma.
        Luego comience a solicitar dichos números para finalmente entregar el resultado por pantalla.

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desea sumar: ");
        int amount = scanner.nextInt();

        int total = 0;

        for(int x = 0; x < amount; x++){
            System.out.println("Ingrese el " + (x + 1) + " Valor: ");
            final int num = scanner.nextInt();
            total += num;
        }

        System.out.println("El resultado de la suma es: " + total);
    }
}
