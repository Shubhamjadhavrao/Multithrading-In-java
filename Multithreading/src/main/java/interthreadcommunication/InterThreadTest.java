/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class InterThreadTest {
	public static void main(String[] args) {
		Company comp = new Company();
		
		Thread	 p = new Thread(new Producer(comp));
		Thread  c  = new Thread(new Consumer(comp));
		
//		Producer p = new Producer(comp); in this  case used extend thread for both;
//		Consumer c = new Consumer(comp);
		p.start();
		c.start();
	
	
		
	}

}
