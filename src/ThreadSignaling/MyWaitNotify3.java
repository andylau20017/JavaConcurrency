/**
 * 
 */
package ThreadSignaling;

/**
 * @author erfeiliu
 *Notice how the wait() call is now nested inside a while loop instead of an if-statement. 
 * If the waiting thread wakes up without having received a signal, the wasSignalled member will still be false, and the while loop will execute once more, causing the awakened thread to go back to waiting.
 */
public class MyWaitNotify3 {
    MonitorObject myMonitorObject = new MonitorObject();
    boolean wasSignalled = false;

    public void doWait(){
      synchronized(myMonitorObject){
        while(!wasSignalled){
          try{
            myMonitorObject.wait();
           } catch(InterruptedException e){}
        }
        //clear signal and continue running.
        wasSignalled = false;
      }
    }

    public void doNotify(){
      synchronized(myMonitorObject){
        wasSignalled = true;
        myMonitorObject.notify();
      }
    }
}
