/**
 * 
 */
package SynchronizedExample;

/**
 * @author erfeiliu
 *
 */
public class Example {

    // thread A will not block thread B
    public static void main2(String[] args){
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Thread  threadA = new CounterThread(counterA);
        Thread  threadB = new CounterThread(counterB);

        threadA.start();
        threadB.start(); 
      }
    
    /**
     * Therefore only one of the threads can call the add() method at a time. 
     * The other thread will wait until the first thread leaves the add() method, 
     * before it can execute the method itself.
     * @param args
     */
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread  threadA = new CounterThread(counter);
        Thread  threadB = new CounterThread(counter);

        threadA.start();
        threadB.start(); 
    }
}
