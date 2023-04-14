package clase5.exercise1;

public class Exercise1 {
    /*
        Cree un programa que solicite por pantalla una figura a calcular su area(Circulo, cuadrado y rectangulo)
        Luego entregue el resultado del calculo
        Aplicar POO en el desarrollo-
     */
    public static void main(String[] args) {

        //Objeto de circulo
        Circle circle = new Circle();
        double result = circle.calculateArea();
        System.out.println("El área del circulo es: " + result);

        //objeto de cuadrado
        Square square = new Square();
        double resultSquare = square.calculateArea();
        System.out.println("El área del circulo es: " + resultSquare);

        //objeto de rectangulo
        Rectangle rectangle  = new Rectangle();
        double resultRectangle = rectangle.calculateArea();
        System.out.println("El área del circulo es: " + resultRectangle);

    }
}
