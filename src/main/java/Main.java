import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        Random rnd = new Random();
        int i = new Random().nextInt(2001);
        print(String.valueOf(i));

//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = Integer.toBinaryString(i).length();
        print(String.valueOf(n));


//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if(j%n ==0) count++;
        }
        int[] array_1 = new int[count];
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n==0) array_1[count++]=j;
        }
        print(Arrays.toString(array_1));

//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if(j%n !=0) count++;
        }
        int[] array_2 = new int[count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n==0) array_2[count++]=j;
        }
        print(Arrays.toString(array_2));
    }

    private static void print(String str) {
        System.out.println(str);
    }

}