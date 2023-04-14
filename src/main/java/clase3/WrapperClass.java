package clase3;

public class WrapperClass {

    public WrapperClass(){}

    public static void main(String[] args) {

        //AutoBoxing, podemos acceer a metodos
        Integer num = 1;
        num.byteValue();

        Character character = 'b';
        System.out.println("Valor num con Autoboxing: " + num);

        //Unboxing
        int num2 = num;
        System.out.println("Valor num2 con Unboxing: " + num2);
    }
}
