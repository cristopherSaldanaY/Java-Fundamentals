package clase4;

public class Exercise5 {

    /*
        Hacer un programa que cree una matriz de 3x3 con los números del 1 al 9
        Mostrar por pantalla, tal como aparece en la matriz
     */

    public static void main(String[] args) {
        int[][] matrizTresPorTres = new int[3][3];

        int aux = 0;
        for (int x = 0; x < matrizTresPorTres.length; x++){
            System.out.println("");
            for(int y = 0; y < matrizTresPorTres.length; y++){

                matrizTresPorTres[x][y] = aux + 1;
                System.out.print("["+matrizTresPorTres[x][y] + "]");
                aux++;
            }
        }
    }
}
