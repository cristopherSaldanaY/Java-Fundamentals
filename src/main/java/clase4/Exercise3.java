package clase4;

import java.util.Scanner;

public class Exercise3 {

    /*
        Cree un programa que solicite por pantalla una figura a calcular su Area (Circulo, Cuadrado, Rectangulo).
        Luego entregue el resultado del calculo
     */

    int option = 0;
    public static final double PI = 3.1415;

    public static void main(String[] args) {
        menu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione una opción: ");
        int optSelected = scanner.nextInt();
        double result = 0.0;

        switch (optSelected){
            case 1:
                result = calculateAreaCircle();
                System.out.println("El área del Circulo es: " + Math.round(result));
                break;
            case 2:
                result = calculateAreaSquare();
                System.out.println("El área del Cuadrado es: " +result);
                break;
            case 3:
                result = calculateAreaRectangle();
                System.out.println("El área del Rectangulo es: " +result);
                break;
            default:
                System.out.println("Cerrando el programa...");
                break;
        }

    }

    public static double calculateAreaCircle(){
        System.out.print("Ingrese el Radio: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();

        return PI * radio * radio;
    }

    public static double calculateAreaSquare(){
        System.out.print("Ingrese el valor del lado: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        return side * side;
    }
    public static double calculateAreaRectangle(){
        System.out.print("Ingrese el valor de la base: ");
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        double height = scanner.nextDouble();

        return base * height;
    }

    public static void menu(){
        System.out.println(" _____________________");
        System.out.println("|    Calcular Área    |");
        System.out.println("|                     |");
        System.out.println("| 1-   Circulo        |");
        System.out.println("| 2-   Cuadrado       |");
        System.out.println("| 3-   Rectangulo     |");
        System.out.println("| 4-   Salir          |");
        System.out.println("|_____________________|");
    }


}
