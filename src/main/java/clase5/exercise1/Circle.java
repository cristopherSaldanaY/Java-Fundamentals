package clase5.exercise1;

import java.util.Scanner;

public class Circle implements IFigure{

    public static final double PI = 3.1415;
    @Override
    public double calculateArea() {
        System.out.print("Ingrese el radio del circulo: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        return PI * radio * radio;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double result = circle.calculateArea();
        System.out.println("El área del circulo es: " + result);
    }
}
