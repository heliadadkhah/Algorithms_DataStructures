import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Test3 {
    public static void test3(){

        float[] randomArray = new float[Main.ARRAY_SIZE];
        Random r = new Random();

        for (int i = 0; i < Main.ARRAY_SIZE; i++) {
            randomArray[i] = r.nextFloat();
        }

        int avr_cmp_nbr = 0;
        for (int i = 10; i < 200; i+=10){
            Main.threshold = i;
            for (int itr=0; itr<10; itr++){
                for (int j = 0; j < Main.ARRAY_SIZE; j++) {
                    randomArray[j] = r.nextFloat();
                }
                Quicksort.quicksort(randomArray, 0, Main.ARRAY_SIZE - 1, Main.threshold);
                avr_cmp_nbr += Main.cmp_nbr;
                Main.cmp_nbr = 0;
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("document.txt",true))) {
                writer.write("For Threshold: ");
                writer.write(String.valueOf(i));
                writer.write(" average cmp_nbr: ");
                writer.write(String.valueOf(avr_cmp_nbr/10));
                writer.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
