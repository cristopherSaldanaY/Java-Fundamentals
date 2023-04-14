package clase5.interfaces;

public class Dog implements IAnimal,IRuns{
    @Override
    public String makeNoise() {
        return "Guau";
    }

    @Override
    public boolean run() {
        return true;
    }
}
