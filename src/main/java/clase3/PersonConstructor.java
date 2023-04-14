package clase3;

import clase1.Person;

public class PersonConstructor {

    //attributes
    public String name;
    public String lastname;
    public int age;

    //constructor sin parametros
    public PersonConstructor(){}

    //Constructor con argumentos
    public PersonConstructor(String name, String lastname, int age){
        //asignamos los valores que vienen por parametros
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }


    //constructor que recibe el objeto
    public PersonConstructor(PersonConstructor person){
        //uso del this
        this(person.name, person.lastname, person.age);
    }

    public static void main(String[] args) {
        //uso del constructor por defecto para la referencia
        PersonConstructor personConstructor = new PersonConstructor();

        //despues de crear el constructor de la clase, para crear la instancia debemos pasar los argumentos
        PersonConstructor personConstructor1 = new PersonConstructor("Cristopher", "Saldaña", 33);
    }
}
