package clase4;

import java.util.Scanner;

public class Exercise7 {
    /*
        Queremos realizar una encuensta a 5 personas, en esta encuesta indicaremos el sexo:
        M = masculino
        F = femenino

        y si trabaja:
        1 = si trabaja
        2 = no trabaja

        Mostrar resultados
     */

    public static void main(String[] args) {
        final int SURVEYED = 2;

        String[] genderList = new String[SURVEYED];
        int[] workList = new int[SURVEYED];

        int aux = 0;
        Scanner scanner = new Scanner(System.in);
        int numMen = 0;
        int numWomen = 0;
        int numWork = 0;
        int numNotWork = 0;



        while (aux != 2){
            System.out.println("¿Cual es su genero? ");
            System.out.println("M: para masculino");
            System.out.println("F: para femenino");
            System.out.print("Seleccione una opcion:");
            String gender = scanner.next();
            genderList[aux] = gender;
            System.out.println("¿Esta trabajando actualmente? ");
            System.out.println("1: Si trabaja");
            System.out.println("2: No trabaja");
            System.out.print("Seleccione una opcion:");
            int work = scanner.nextInt();
            workList[aux] = work;
            aux++;
            System.out.println("\n");
        }


        for (int x = 0; x < 2; x++){

            if(genderList[x].equals("m")){
                numMen = numMen +1;
            }else{
                numWomen = numWomen + 1;
            }

            if(workList[x] == 1){
                numWork = numWork + 1;
            }else {
                numNotWork = numNotWork +1;
            }
        }

        System.out.println("El numero de personas que son hombres: " + numMen );
        System.out.println("El numero de personas que son mujeres: " + numWomen );
        System.out.println("El numero de personas con trabajo son: " + numWork );
        System.out.println("El numero de personas sin trabajo son: " + numNotWork);



    }
}
