import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Myapp {
    public static void main(String[] args) {
        // create empty queue lock-based
        QueueDS queue = new QueueDS();
        // Thread id
        int i = 1;
        // start enqueue thread
        queue.enqueue(15, i++);
        queue.enqueue(45, i++);
        queue.enqueue(1, i++);
        queue.dequeue(i++);
        queue.enqueue(5, i++);
        queue.enqueue(14, i++);
        queue.dequeue(i++);
        queue.enqueue(8, i++);
        queue.enqueue(15, i++);
        queue.enqueue(45, i++);
        queue.enqueue(1, i++);
        queue.dequeue(i++);
        queue.enqueue(5, i++);
        queue.enqueue(14, i++);
        queue.dequeue(i++);
        queue.enqueue(8, i++);
        queue.enqueue(15, i++);
        queue.enqueue(45, i++);
        queue.enqueue(1, i++);
        queue.dequeue(i++);
        queue.enqueue(5, i++);
        queue.enqueue(14, i++);
        queue.dequeue(i++);
        queue.enqueue(8, i++);
        queue.enqueue(15, i++);
        queue.enqueue(45, i++);
        queue.enqueue(1, i++);
        queue.dequeue(i++);
        queue.enqueue(5, i++);
        queue.enqueue(14, i++);
        queue.dequeue(i++);
        queue.enqueue(8, i++);

        // start dequeue thread
        queue.dequeue(i++);
    }
}
