package clase2;

import java.util.Scanner;

public class Conditionals {

    //constructor
    public Conditionals(){}

    public static void main(String[] args) {

        //Uso de Scanner para leer algo por teclado
        Scanner scanner = new Scanner(System.in);

        //usar la referencia de scanner y usar su metodo para ingresar un int
        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();


        //Condicional if, usar una función y pasar por parametros el valor a validar
        validateIf(age);

        //solicitar nuevos valores con scanner
        System.out.println("Ingrese el numero del mes para saber la estacion: ");
        int month = scanner.nextInt();

        //Condicional Switch, usar una función y pasar por parametros
        season(month);

    }

    //metodo para validar con if
    public static int validateIf(int age) {
        if (age >= 18) {
            System.out.println("tu edad es: " + age + ", Eres mayor de edad");
        } else {
            System.out.println("tu edad es: " + age + ", Eres menor de edad");
        }

        return age;
    }

    //metodo para validar con switch
    public static void season(int month) {
        String season = "";
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 12:
                season = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                season = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                season = "Invierno";
                break;
            case 10:
            case 11:
                season = "Primavera";
        }

        System.out.println("La estación del año es: " + season);
    }
}
