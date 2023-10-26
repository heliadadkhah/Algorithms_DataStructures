/* testen Sie es mit 20 Millionen zufällig erzeugten Gleitkommazahlen einfacher Genau-
igkeit (float). */

import java.util.Random;

public class Test0{
    public static void test0(){

        float[] randomArray = new float[Main.ARRAY_SIZE];
        Random r = new Random();

        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            randomArray[i] = r.nextFloat(); // Random float
        }

        Quicksort.quicksort(randomArray, 0, Main.ARRAY_SIZE - 1, Main.threshold);
        System.out.println("Comparisons number = " + Main.cmp_nbr);
    }
}
