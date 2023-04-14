package clase4;

public class ArrayUnidimensional {

    public static void main(String[] args) {

        //1- Declarar un arreglo, for para agregar valores y forEach para ver valores
        int[] arrayNum = new int[3];
        for(int i = 0; i < arrayNum.length; i++){
            arrayNum[i] = i + 1;
        }

        for (int num : arrayNum){
            System.out.println(num);
        }

        //2- Declarar un arreglo y asignar los valores manualmente y mostrar
        int[] arrayNum2 = new int[3];
        arrayNum2[0] = 10;
        arrayNum2[1] = 20;
        arrayNum2[2] = 30;

        for (int num : arrayNum2){
            System.out.println(num);
        }
    }
}
