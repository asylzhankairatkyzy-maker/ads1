import java.util.Arrays;

public class HashingTask {
    public static void execute(int[] arr) {
        System.out.println("Hashing");

        Integer[] table = new Integer[7];
        for (int key : arr) {
            int h = key % 7;
            while (table[h] != null) h = (h + 1) % 7;
            table[h] = key;
        }
        System.out.println(  Arrays.toString(table) + " \n");
    }
}