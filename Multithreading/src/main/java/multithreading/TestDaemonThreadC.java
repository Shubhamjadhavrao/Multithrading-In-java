/**
 * 
 */
package multithreading;

/**
 * 
 */
public class TestDaemonThreadC {
	public static void main(String[] args) {
		myThreadC mt1 = new myThreadC();
		myThreadC mt2 = new myThreadC();
		myThreadC mt3 = new myThreadC();
		
		mt1.setDaemon(true);
		
		
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
