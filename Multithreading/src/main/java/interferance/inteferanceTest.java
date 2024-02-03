/**
 * 
 */
package interferance;

/**
 * 
 */
public class inteferanceTest {
	public static void main(String[] args) {
		Counter c = new Counter();
		
		myThread1 t1 = new myThread1(c);
		myThread2 t2 =new myThread2(c);
		
		t1.start();
		t2.start();
	}


}
