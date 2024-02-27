//java collection frameworks - O(n)

import java.util.*;

public class QueueB {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); //linkedlist
        //Queue<Integer> q=new ArrayDeque<>(); //arraydeque
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/*you can use either 7 or 8 line of code */
