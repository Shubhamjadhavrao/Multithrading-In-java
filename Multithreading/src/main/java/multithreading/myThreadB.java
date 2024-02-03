/**
 * 
 */
package multithreading;

/**
 * 
 */
public class myThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("The Current Thread name is: " + Thread.currentThread().getName());
			} catch (Exception e) {
//				System.out.println("The Exception has been Cught: " + e);
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
