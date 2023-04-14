package clase3.accessModifier;

public class TestModeAccess {

    public TestModeAccess(){}

    public static void main(String[] args) {
        //instancia
        AccessModifier mode = new AccessModifier();

        //acceso
        System.out.println(mode.num);
        System.out.println(mode.num2);

        //Si intentamos llamar a name no se podra por que es private
        //System.out.println(mode.name);

        //se puede acceder a los private con los getters and setters
        System.out.println(mode.getName());

        //usamos el setter para signar un valor
        mode.setName("Alexis");
        System.out.println(mode.getName());

        //Protected funciona por que estan en el mismo package
        System.out.println(mode.lastname);
    }
}
