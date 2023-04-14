package clase5.interfaces;

public class Duck implements IAnimal, IRuns, IFlying{
    @Override
    public String makeNoise() {
        return "Cueck";
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean run() {
        return true;
    }
}
