/**
 * 
 */
package DeadLockDemo;


/**
 * 
 */
public class ThreadOne extends Thread {

	private Object loc1;
	private Object loc2;

	public ThreadOne(Object loc1, Object loc2) {
		super();
		this.loc1 = loc1;
		this.loc2 = loc2;
	}

	public void run() {

		synchronized (loc1) {
			System.out.println("Thread 1:Holding lock 1...");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
				System.out.println("Thread 1:Waiting for lock  2 ....");

				synchronized (loc2) {
					System.out.println("Thread 1:Holding lock 1 & 2 ....");

				}
			}
		}

	}


