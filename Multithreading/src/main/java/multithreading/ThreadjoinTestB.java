/**
 * 
 */
package multithreading;

/**
 * 
 */
public class ThreadjoinTestB {
	public static void main(String[] args) {
		ThreadjoinMethod mt1 = new ThreadjoinMethod();
		ThreadjoinMethod mt2 = new ThreadjoinMethod();
		ThreadjoinMethod mt3 = new ThreadjoinMethod();
		
		
		mt1.start();
		try {
			System.out.println("Current Thrad Name is: "+Thread.currentThread().getName());
			mt1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mt2.start();
		try {
			System.out.println("Current Thrad Name is: "+Thread.currentThread().getName());
			mt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mt3.start();
//		try {
//			t3.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}


	}

}
