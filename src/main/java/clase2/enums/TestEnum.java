package clase2.enums;

public class TestEnum {

    public TestEnum(){}

    public static void main(String[] args) {
        //Acceder a los valores de un Enum
        DaysOfWeek day = DaysOfWeek.JUEVES;

        System.out.println(day);

        if (day == DaysOfWeek.JUEVES){
            System.out.println("Es " + day);
        }


        AccountType account = AccountType.CURRENT;

        switch (account){
            case SIGHT:
                System.out.println("Es Vista");
                break;
            case CURRENT:
                System.out.println("Es Corriente");
                break;
        }

        System.out.println("Monto máximo: " + account.maximumAmountBalance);

    }
}
