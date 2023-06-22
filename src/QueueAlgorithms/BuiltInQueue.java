package QueueAlgorithms;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(1);
        queue.add(13);
        queue.add(89);

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.peek());
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
