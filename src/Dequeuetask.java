import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dequeuetask implements Runnable{

    ReentrantLock lock;
    Queue<Integer> queue;


    public Dequeuetask (ReentrantLock lock, Queue<Integer> queue){
        this.lock =  lock;
        this.queue = queue;
    }

    @Override
    public void run () {
        System.out.println(Thread.currentThread().getName()
                +" is Waiting to get the lock");
        lock.lock();
        System.out.println(Thread.currentThread().getName()
                +" has got the  lock.");
        queue.poll();
        System.out.println(queue);
        System.out.println(Thread.currentThread().getName()
                +" has released the lock.");
        lock.unlock();    //read explanation for 5sec
    }
}
