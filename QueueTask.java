import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.poll();
            System.out.print(s1 + " ");
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
        System.out.println();
    }
}