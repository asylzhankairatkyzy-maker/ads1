public class main {
    public static void main(String[] args) {
        int[] data = {25, 12, 7, 33, 18, 5, 42};
        int T1 = 18;
        int T2 = 33;

        QuickSortTask.execute(data.clone());
        HeapSortTask.execute(data.clone());
        BubbleSortTask.execute(data.clone());
        LinearSearchTask.execute(data.clone(), T1);

        BinarySearchTask.execute(data.clone(), T2);
        HashingTask.execute(data.clone());
    }
}