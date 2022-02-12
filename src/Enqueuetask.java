import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class Enqueuetask implements Runnable{
    ReentrantLock lock;
    Queue<Integer> queue;
    Integer params;

    public Enqueuetask (ReentrantLock lock, Queue<Integer> queue, Integer params){
        this.lock = lock;
        this.queue = queue;
        this.params = params;
    }

    @Override
    public void run () {
        System.out.println(Thread.currentThread().getName()
                +" is Waiting to get the lock");
        lock.lock();

        System.out.println(Thread.currentThread().getName()
                +" has got the  lock.");
        queue.add(params);
        System.out.println(queue);

        System.out.println(Thread.currentThread().getName()
                +" has released the lock.");

        lock.unlock();    //read explanation for 5sec
    }
}
