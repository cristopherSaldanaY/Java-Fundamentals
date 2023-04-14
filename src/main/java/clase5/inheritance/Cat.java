package clase5.inheritance;

public class Cat extends Animal {

    /*
        Herencia, la clase hija extiende de la clase padre, usa sus metodos y atributos
     */

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Ciguañan");

        System.out.println(cat.getName());
        cat.makeNoise();

    }

    public void makeNoise(){
        System.out.println("Miau!");
    }
}
