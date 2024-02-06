/**
 * 
 */
package DeadLockDemo;

/**
 * 
 */
public class ThreadTwo extends Thread{

	private Object loc1;
	private Object loc2;

	public ThreadTwo(Object loc1, Object loc2) {
		super();
		this.loc1 = loc1;
		this.loc2 = loc2;
	}

	public void run() {

		synchronized (loc1) {
			System.out.println("Thread 2:Holding lock 2...");

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {}
				System.out.println("Thread 2:Waiting for lock  1 ....");

				synchronized (loc2) {
					System.out.println("Thread 2:Holding lock 1 & 2 ....");

				}
			}
		}

	}


