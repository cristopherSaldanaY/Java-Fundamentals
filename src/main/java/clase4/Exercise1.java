package clase4;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    /*
        Cree un programa que solicite una cantidad de numeros a sumar por pantalla
     */
    public static void main(String[] args) {
        //scanner para ller datos
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de números que quiere sumar: ");
        int amount = scanner.nextInt();
        int total = 0;

        //recorrer solicitar ingresar los valores y ademas crear un total directo.
        for (int x = 0; x < amount; x++){
            System.out.println("Ingrese el número " + (x + 1) +":");
            final int num = scanner.nextInt();
            total += num;
        }
        System.out.println("La suma de los valores es: " + total);


    }

    //Metodo para usar un ArrayList
    public  static void sumUsingList(int amount){
        ArrayList<Integer> arrayNum = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int totalLarge = 0;

        //usar metodo add para el arrayList
        for (int x = 0; x < amount; x++){
            System.out.println("Ingrese el número " + (x + 1) +":");
            final int num = scanner.nextInt();
            arrayNum.add(num);
        }

        for(int num : arrayNum){
            totalLarge += num;
        }
        System.out.printf("El resultado de la suma de los valores es: " + totalLarge);
    }
}
