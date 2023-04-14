package clase4;

import java.util.Scanner;

public class Exercise4 {

    /*
        Cree un programa que pida un número por teclado e indica si es numero primo o no.
        Un numero primo es aquel que solo puede dividirse entre 1 y si mismo.
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo
        17 si es primo.
     */
    public static void main(String[] args) {
        System.out.print("Ingrese el número para saber si es primo: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean isPrime = isPrime(num);

        String result = isPrime ? "El número " + num + "  es primo" : "El número " + num + " no es primo";
        System.out.println(result);
    }

    public static boolean isPrime(int num){

        //si es  0 , 1 o 4
        if(num == 0 || num == 1 || num == 4){
            return false;
        }

        //si es dividible por 2
        for(int x = 2; x < num / 2; x++){
            if(num % x == 0){
                return false;
            }
        }

        //si pasa ambas es primo
        return true;
    }
}
