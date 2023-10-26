public class Insertionsort {
    public static void insertionsort(float[] arr, int start, int end)
    {
        for (int i = 1; i <= end; i++)
        {
            Main.cmp_nbr = Main.cmp_nbr + 1;
            float key = arr[i];
            int j = i - 1;
            while( j>= 0 && arr[j] > key){
                Main.cmp_nbr = Main.cmp_nbr + 1;
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
