package clase5.inheritance;

public class Dog extends Animal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Coshi Bubi");

        System.out.println(dog.getName());
        dog.makeNoise();

    }

    public void makeNoise(){
        System.out.println("Guau");
    }
}
