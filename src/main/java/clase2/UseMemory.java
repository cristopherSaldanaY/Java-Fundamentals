package clase2;

public class UseMemory {

    public UseMemory(){}

    public static void main(String[] args) {
        //string literales
        String str1 = "hola";
        String str2 = "hola";

        //dira que es true
        System.out.println(str1 == str2);

        String str3 = new String("hola");
        String str4 = new String("hola");

        //es false por la forma como java maneja la memoria, por que las referencias en el Heap son distintas
        System.out.println(str3 == str4);

        //de esta manera se compara su valor en el heap
        System.out.println(str3.equals(str4));
    }
}
