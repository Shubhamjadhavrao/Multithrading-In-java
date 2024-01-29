/**
 * 
 */
package multithreading;

/**
 * 
 */
public class TestSleepdemo {
	public static void main(String[] args) {
		MyThreadA mt = new MyThreadA();
		Thread t1 = new Thread(mt,"t1-Thread");
		Thread t2 = new Thread(mt,"t2-Thread");
		
		t1.start();
		t2.start();
	}

}
