import java.util.Random;
public class Test1 {
    public static void test1(){

        float[] randomArray = new float[Main.ARRAY_SIZE];
        Random r = new Random();

        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            randomArray[i] = r.nextFloat(); // Random float
        }

        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            System.out.println(("A["+i+"]="+randomArray[i]+" "));
        }

        Quicksort.quicksort(randomArray, 0, Main.ARRAY_SIZE - 1, Main.threshold);
        System.out.println("_______________________________________________");
        System.out.println("Sorted array:");
        System.out.println("_______________________________________________");
        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            System.out.println(("A["+i+"]="+randomArray[i]+" "));
        }
        System.out.println("_______________________________________________");
        System.out.println("number of comparisons = " + Main.cmp_nbr);
    }
}
