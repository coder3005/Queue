//Reversing the first K elements of a Queue

import java.util.*;

public class QueueB {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); 
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k=2;

        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++) {
            s.push(q.remove());
        }
        while(!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
        // while(!s.isEmpty()) {
        //     q.add(s.pop());
        // }
        // for(int i=k;i<q.size();i++) {
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        // }
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
