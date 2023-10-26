/*
Wenn die L¨ange der zu sortierenden Teilfolge in der Rekursion unter eine Schranke b sinkt,
dann soll auf ein einfacheres Sortierverfahren Ihrer Wahl umgeschaltet werden

Das Pivotelement, das bei Quicksort zum Zerlegen der Folge verwendet wird,
soll in jeder Teilfolge zuf¨allig ausgew¨ahlt werden.
*/
import java.util.Random;

public class Quicksort{
    public static void quicksort(float[] arr, int start, int end, int threshold)
    {
        if (start <= end){
            if (end - start < threshold){
                Insertionsort.insertionsort(arr, start, end);
            }
            else{
                int middle = Partition(arr, start, end);
                quicksort(arr, start, middle-1, threshold);
                quicksort(arr, middle + 1, end, threshold);
            }
        }
    }
    public static int Partition(float[] arr, int start, int end)
    {
        Random random = new Random();
        //randomising pivot - rand is the index of the pivot element
        int rand = random.nextInt((end-start) + 1) + start;
        float pivot = arr[rand];
        int i = start - 1;
        for ( int j = start; j < end -1; j++){
            Main.cmp_nbr = Main.cmp_nbr + 1;
            if(arr[j] <= pivot){
                i = i + 1;
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        //swaping pivot elment with arr[i+1] which is the closest smaller element to pivot
        float temp = arr[i + 1];
        arr[i + 1] = arr[rand];
        arr[rand] = temp;
        }
        //returning new index of the pivot
        return i + 1;
    }

}