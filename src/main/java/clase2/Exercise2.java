package clase2;

import java.util.Scanner;

public class Exercise2 {

    public Exercise2(){}

    public static void main(String[] args) {
        /*
            Crear un programa que solicite consultar el largo para un arreglo (no más de 5). Luego de ingresar
            los valores imprímalos por pantalla
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el largo del array que debe ser hasta 5:");
        int numLength = scanner.nextInt();
        int[] arrayInt = new int[numLength];

        //uso for para ingresar números
        for(int x = 0; x < arrayInt.length; ++x) {
            System.out.println("Ingrese el número: " + (x + 1) + ":");
            arrayInt[x] = scanner.nextInt();
        }

        //uso variable auxiliar
        int aux = 1;

        //uso de forEach
        for (int num: arrayInt) {
            System.out.println("El valor número " + aux + " es: " + num);
            aux++;
        }

    }
}
