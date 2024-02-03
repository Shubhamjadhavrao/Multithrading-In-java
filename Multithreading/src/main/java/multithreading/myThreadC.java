/**
 * 
 */
package multithreading;

/**
 * 
 */
public class myThreadC extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread Work: " + Thread.currentThread().getName());
		} else {
			System.out.println("User Thread Work:" + Thread.currentThread().getName());
		}
	}

}
