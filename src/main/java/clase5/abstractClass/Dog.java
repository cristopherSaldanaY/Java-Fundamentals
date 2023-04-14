package clase5.abstractClass;

public class Dog extends AnimalAbstract {

    //constructor, super invoca el constructor de la clase que esta heredando
    public Dog(String name) {
        super(name);
    }

    //anotación @Override: como hereda un metodo, dice que reescribira su comportamiento
    @Override
    public String makeNoise() {
        return "guau";
    }
}
