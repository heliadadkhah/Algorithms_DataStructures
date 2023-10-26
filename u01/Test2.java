import java.util.Random;

public class Test2 {
    public static void test2(){
        float[] randomArray = new float[Main.ARRAY_SIZE];
        Random r = new Random();

        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            randomArray[i] = r.nextFloat(); // Random float
        }

        int best_threshold = 0;
        int smallest_cmp_nbr = 10000000;
        for (int i = 10; i < 200; i++){
            Main.threshold = i;
            float[] randomArray_1 = new float[randomArray.length];
            System.arraycopy(randomArray, 0, randomArray_1, 0, randomArray.length);
            Quicksort.quicksort(randomArray_1, 0, Main.ARRAY_SIZE - 1, Main.threshold);
            if (smallest_cmp_nbr > Main.cmp_nbr){
                best_threshold = i;
                smallest_cmp_nbr = Main.cmp_nbr;
            }
            System.out.println("number of comparisons "+"for Threshold "+ i+ " =" + Main.cmp_nbr);
            Main.cmp_nbr = 0;
        }
        System.out.println("Best Threshold: "+ best_threshold + " with cmp_nbr =" + smallest_cmp_nbr);
    }
}
