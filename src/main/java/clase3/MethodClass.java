package clase3;

public class MethodClass {

    public MethodClass(){}

    public static void main(String[] args) {
        System.out.println(doSomething("Algo"));
        System.out.println(doSomething(10, "algo", "ahora"));
        System.out.println(doSomething("Algo", "ahora", 10));
    }

    public static String doSomething(String something){
        return "Doing " + something;
    }

    //Sobrecarga, podemos mantener el nombre y modificamos su parametro
    public static String doSomething(String something, String when, int minLeft){
        return "doing " + something + " " + when;
    }

    public static String doSomething(int minLeft, String something, String when){
        return "";
    }


}
