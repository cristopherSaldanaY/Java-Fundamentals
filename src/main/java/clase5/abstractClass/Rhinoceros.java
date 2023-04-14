package clase5.abstractClass;

public class Rhinoceros extends AnimalAbstract{


    private int hornsAmount;

    public int getHornsAmount() {
        return hornsAmount;
    }

    public void setHornsAmount(int hornsAmount) {
        this.hornsAmount = hornsAmount;
    }

    public Rhinoceros(String name, int hornsAmount) {
        super(name);
        this.hornsAmount = hornsAmount;
    }


    @Override
    public String makeNoise() {
        return "KEPASACHUCHETU";
    }
}
