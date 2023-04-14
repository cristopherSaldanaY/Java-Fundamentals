package clase2;

import java.util.Scanner;

public class ParamsClass {

    public ParamsClass(){

    }

    public static void main(String[] args) {
        //Podemos pasar parametros por el Scanner
        System.out.println("Ingrese un número: ");

        //crear la instancia de Scanner, System.in para ingresar datos por consola
        Scanner scanner = new Scanner(System.in);

        //Creamos un espacio para guardar lo ingresado con un metodo de Scanner nextInt
        int num = scanner.nextInt();

        System.out.println("El número ingresado es : " + num);
    }
}
