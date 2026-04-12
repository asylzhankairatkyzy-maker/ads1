import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        // 1. Move Zeroes
        int[] arr = {0, 1, 0, 3, 12};
        ArrayListTask.moveZeroes(arr);
        System.out.println("1. Move Zeroes: " + Arrays.toString(arr));

        // 2. Cycle Detection
        LinkedListTask.ListNode node = new LinkedListTask.ListNode(1);
        System.out.println("2. Has Cycle: " + LinkedListTask.hasCycle(node));

        // 3. Balanced Parentheses
        System.out.println("3. Is Valid: " + StackTask.isValid("([{}])"));

        // 4. Binary Numbers
        System.out.print("4. Binary 1-5: ");
        QueueTask.generateBinary(5);

        // 5. Two Sum
        int[] pair = HashTableTask.twoSum(new int[]{2, 7, 11}, 9);
        System.out.println("5. Two Sum Indices: " + Arrays.toString(pair));

        // 6. BST Validation
        System.out.println("6. Is Valid BST: " + BSTTask.isValidBST(new BSTTask.TreeNode(10), null, null));

        // 7. K-th Largest
        System.out.println("7. 2nd Largest: " + HeapTask.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}