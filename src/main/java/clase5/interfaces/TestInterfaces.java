package clase5.interfaces;

public class TestInterfaces {

    public static void main(String[] args) {
        Dog dog = new Dog();
        if(dog.run()){
            System.out.println("El perro puede correr");
        }else {
            System.out.println("El perro no puede correr");
        }


    }
}
