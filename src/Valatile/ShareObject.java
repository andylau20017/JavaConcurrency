/**
 * 
 */
package Valatile;

/**
 * @author erfeiliu
 *
 */

/**
 * 
When is volatile Enough?

As I have mentioned earlier, if two threads are both reading and writing to a shared variable, then using the volatile keyword for that is not enough. You need to use synchronization in that case to guarantee that the reading and writing of the variable is atomic.

But in case one thread reads and writes the value of a volatile variable, and other threads only read the variable, then the reading threads are guaranteed to see the latest value written to the volatile variable. Without making the variable volatile, this would not be guaranteed.

Performance Considerations of volatile

Reading and writing of volatile variables causes the variable to be read or written to main memory. Reading from and writing to main memory is more expensive than accessing the CPU cache. Accessing volatile variables also prevent instruction reordering which is a normal performance enhancement technique. Thus, you should only use volatile variables when you really need to enforce visibility of variables.
 *
 */
public class ShareObject {
    public volatile int counter = 0;
}
