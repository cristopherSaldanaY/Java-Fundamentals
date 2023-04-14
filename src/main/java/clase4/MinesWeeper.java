package clase4;

import java.util.Scanner;

public class MinesWeeper {

    static String[][] board;
    static String [][] boardSolution;

    static Scanner scanner;
    static int winner;

    public static void main(String[] args) {

        System.out.println("**** Busca Minas ****");
        System.out.println("1. Iniciante\n2. Intermedio\n3. Avanzado");
        System.out.print("Seleccione el nivel de dificultad:");
        scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        switch (level){
            case 1:
                startMineBoard(3, 3, 1);
                winner = 8;
                break;
            case 2:
                startMineBoard(5, 5, 10);
                winner = 15;
                break;
            case 3:
                startMineBoard(10, 10, 30);
                winner = 70;
                break;
        }


        playMinesWeeper();

    }

    public static void startMineBoard(int rows, int columns, int totalMines){
        board = new String[rows][columns];
        boardSolution = new String[rows][columns];

        for (int x = 0; x < board.length; x++){
            for (int y = 0; y < board[0].length; y++){
                board[x][y] = "[]";
                boardSolution[x][y] = "[]";
            }
        }

        int minesCount = 0;

        while (minesCount < totalMines){
            int x = (int) (Math.random() * rows);
            int y = (int) (Math.random() * columns);

            if(board[x][y] != "x"){
                board[x][y] = "x";
                minesCount++;
            }
        }

        seeBoard(boardSolution);
    }

    public static void seeBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void playMinesWeeper(){
        scanner = new Scanner(System.in);


        boolean finish = false;

        do {
            if(winner == 0){
                System.out.printf("Has ganado !");
                break;
            }
            System.out.print("Ingrese la posición de la fila: ");
            int row = scanner.nextInt() - 1;
            System.out.print("Ingrese la posición de la columna: ");
            int column = scanner.nextInt() - 1;

            if (board[row][column] == "x"){
                System.out.println("Perdiste! mina encontrada");
                seeBoard(board);
                finish = true;
            }else{

                boardSolution[row][column] = "+";
                board[row][column] = "+";

                seeBoard(boardSolution);
                winner --;
            }

        }while (!finish);
    }
}
