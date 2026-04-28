public class LinearSearchTask {
    public static void execute(int[] arr, int target) {
        System.out.println("Linear Search");

        int comps = 0;
        for (int x : arr) {
            comps++;
            if (x == target) break;
        }
        System.out.println("Cmpr" + target + ": " + comps );
    }
}