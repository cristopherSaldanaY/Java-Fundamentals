package clase5.abstractClass;

public class TestAbstract {

    public static void main(String[] args) {
        Dog dog = new Dog("Coshi Bubi");
        System.out.println(dog.name);
        dog.makeNoise();


        Rhinoceros rhinoceros = new Rhinoceros("Milli", 1);
        System.out.println(rhinoceros.getHornsAmount());
        System.out.println(rhinoceros.makeNoise());
    }
}
