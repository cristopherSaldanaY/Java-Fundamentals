package clase2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays {

    public Arrays(){}

    public static void main(String[] args) {
        int[] miArray = new int[]{1, 2, 3};
        int[] arrayNum = miArray;
        int var3 = miArray.length;

        int var4;
        int num;
        for(var4 = 0; var4 < var3; ++var4) {
            num = arrayNum[var4];
            System.out.println(num);
        }

        arrayNum = new int[]{10, 20, 30, 40, 50};
        int[] var7 = arrayNum;
        var4 = arrayNum.length;

        for(num = 0; num < var4; ++num) {
            int numero = var7[num];
            System.out.println(numero);
        }

        int[][] var10000 = new int[][]{{100, 101, 102}, {200, 201, 202}};

        List<String> titanList = new ArrayList();
        titanList.add("Titan de Ataque");
        titanList.add("Titan Acorazado");
        titanList.add("Titan Hembra");
        titanList.add("Titan Colosal");
        titanList.add("Titan Bestia");
        Iterator var9 = titanList.iterator();

        while(var9.hasNext()) {
            String titanes = (String)var9.next();
            System.out.println(titanes);
        }
    }
}
