package clase4;

import java.util.Scanner;

public class Exercise6 {

    /*
        Hacer un programa que cree una matriz de 5 filas y n columnas (se pide al usuario)
        Rellenarlo con numeros aleatorios entre 0 y 10.
     */

    public static void main(String[] args) {
        System.out.print("Ingrese cuantas columnas necesita para la matriz: ");
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();

        int[][] matriz = new int[5][column];
        System.out.println(matriz.length);

        for(int x = 0; x < matriz.length; x++ ){
            System.out.println("");
            for(int y = 0; y < column; y++){
                matriz[x][y] =(int) (Math.random()*11);
                System.out.print("[" + matriz[x][y] + "]");
            }
        }

    }
}
