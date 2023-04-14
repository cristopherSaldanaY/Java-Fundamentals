package clase5.exercise1;

import java.util.Scanner;

public class Square implements IFigure{
    @Override
    public double calculateArea() {
        System.out.print("Ingrese el valor del lado: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        return side * side;
    }

    public static void main(String[] args) {
        Square square = new Square();
        double result = square.calculateArea();
        System.out.println("El área del Cuadrado es: " + result);
    }
}
