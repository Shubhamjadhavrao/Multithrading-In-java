/**
 * 
 */
package multithreading;

/**
 * 
 */
public class ThreadTestB {
	public static void main(String[] args) {
		myThreadB mt1 = new myThreadB();
		myThreadB mt2 = new myThreadB();
		myThreadB mt3 = new myThreadB();
		
		Thread t1 = new Thread(mt1,"Thread-1");
		Thread t2 = new Thread(mt2,"Thread-2");
		Thread t3 = new Thread(mt3,"Thread-3");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

}
