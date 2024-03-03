//Generate Binary Numbers
/* Given a number N. The task is to generate and print all binary numbers with decimal values from
1 to N */

import java.util.LinkedList;
import java.util.Queue;

public class classroom {

    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        // Print binary numbers using level order traversal
        while (n-- > 0) {
            String curr = queue.remove();
            System.out.print(curr+" ");

            // Append '0' and '1' to the current number and enqueue
            queue.add(curr + "0");
            queue.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);
    }
}
