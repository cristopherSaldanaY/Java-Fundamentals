package clase5.exercise1;

import java.util.Scanner;

public class Rectangle implements IFigure{
    @Override
    public double calculateArea() {
        System.out.print("Ingrese el valor de la base: ");
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        double height = scanner.nextDouble();

        return base * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double result = rectangle.calculateArea();
        System.out.println("El área del rectangulo es: " + result);
    }
}
