//Maximum of all subarrays of size k
/* We have an array arr[] of size N and an integer K. Find the maximum for each and every
contiguous subarray of size K. */
import java.util.ArrayDeque;

public class classroom {

    public static void printMaxOfSubarrays(int arr[], int n, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int i;
        for (i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
                deque.addLast(i);
        }
        for (i=k; i < n; i++) {
            System.out.print(arr[deque.peek()] + " ");
            while ((!deque.isEmpty()) && deque.peek() <= i - k) {
                deque.removeFirst();
            }
            while ((!deque.isEmpty()) && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.println(arr[deque.peek()]);
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        int n = arr.length;
        printMaxOfSubarrays(arr, n, k);
    }
}
