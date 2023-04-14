package clase5.abstractClass;

public abstract class AnimalAbstract {

    protected String name;

    public AnimalAbstract(String name){
        this.name = name;
    }

    public abstract String makeNoise();
}
