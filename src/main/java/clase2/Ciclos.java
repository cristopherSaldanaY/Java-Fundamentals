package clase2;

public class Ciclos {
    //constructor
    public Ciclos(){}

    public static void main(String[] args) {

        /* CICLO WHILE */
        int numWhile = 0;
        while (numWhile < 5){
            System.out.println("ciclo while: " + numWhile);
            numWhile++;
        }

        /* CICLO DO WHILE */
        int numDoWhile = 0;
        do {
            System.out.println("ciclo do while: " + numDoWhile);
            numDoWhile++;
        } while (numDoWhile < 5);

        /* CICLO FOR */
        for (int i = 0; i < 5; i++){
            System.out.println("Ciclo For: " + i);
        }

        /* CICLO FOR EACH */
        int[] arrayForEach = new int[5];

        //llegamos los valores con un for
        for(int x = 0; x < arrayForEach.length; x++){
            arrayForEach[x] = x + 1;
        }

        //los mostramos con el forEach
        for(int numForEach : arrayForEach){
            System.out.println("ForEach: " + numForEach);
        }
    }
}
