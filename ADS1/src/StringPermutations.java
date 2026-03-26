public class StringPermutations {
    public static void printPermutations(String str) {
        printPermutationsHelper(str.toCharArray(), 0);
    }

    private static void printPermutationsHelper(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            printPermutationsHelper(arr, index + 1);
            swap(arr, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}