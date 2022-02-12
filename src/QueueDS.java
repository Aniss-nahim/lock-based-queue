import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class QueueDS {
    private Queue<Integer> queue;
    private static ReentrantLock  lock = new ReentrantLock();

    public QueueDS() {
        this.queue = new LinkedList<Integer>();
    }

    public void enqueue(Integer value, int i){
        Runnable enqueueTask = new Enqueuetask(lock, queue, value);
        new Thread(enqueueTask, "Thread-"+i).start();
    }

    public Integer dequeue (int i) {
        Runnable dequeueTask = new Dequeuetask(lock, queue);
        new Thread(dequeueTask, "Thread-"+i).start();
        return 0;
    }
}
