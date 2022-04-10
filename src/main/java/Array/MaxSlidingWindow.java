package Array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MaxSlidingWindow {
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        //Write your code
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i< windowSize;i++)
        {
            while(! deque.isEmpty() && arr[i] > arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        result.add(arr[deque.peek()]);
        for(int i = windowSize; i < arr.length; i++)
        {
            while(! deque.isEmpty() && deque.peekFirst() <= i- windowSize)
                deque.removeFirst();
            while(! deque.isEmpty() && arr[i] > arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);

            result.add(arr[deque.peekFirst()]);
        }
        return result;
    }

}
