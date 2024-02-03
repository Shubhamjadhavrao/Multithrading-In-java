/**
 * 
 */
package multithreading;

/**
 * 
 */
public class ThreadTwiceTest  {

	public static void main(String[] args) {
		ThreadTwice t1=new ThreadTwice();  
		  t1.start();  
		  t1.start();
		
		  //In such case, thread will run once but for second time, it will throw exception.
		  
	}
}
