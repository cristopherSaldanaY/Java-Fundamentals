package clase4;

public class ArrayBidimensional {

    public static void main(String[] args) {
        //Arreglo de dos dimensiones col y row (filas y columnas)
        int[][] arrayBidimensional = new int[3][3];

        //imprimir fila, columna
        for(int x = 0; x < arrayBidimensional.length; x++){
            for(int y = 0; y < arrayBidimensional.length; y++){
                arrayBidimensional[x][y] = x + 1;
                System.out.println("Fila: " + (x + 1) + " - Columna: " + (y + 1) + " - Valor: " + arrayBidimensional[x][y]);
            }
        }

        //otra forma de imprimirla
        for(int x = 0; x < arrayBidimensional.length; x++){
            System.out.println("");
            for(int y = 0; y < arrayBidimensional.length; y++){
                System.out.print("[" + arrayBidimensional[x][y] + "]");
            }
        }
    }
}
