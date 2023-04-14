package clase1;

public class Person {

    String name = "Cristopher";
    int weight = 99;
    int age = 33;

    public Person(){}

    public static void main(String[] args) {
        Person person = new Person();
        person.speak();
        String message = "Soy un programador FullStack en Java y JavaScript";
        person.setMessage(message);
    }

    public void speak(){
        System.out.println("nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("Perso: " + this.weight);
    }

    public void setMessage(String message) {
        System.out.println("El mensaje: " + message);
    }


}
