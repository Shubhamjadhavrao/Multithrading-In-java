/**
 * 
 */
package multithreading;

/**
 * 
 */
public class YeildExm extends Thread{
	public void run() {
		for(int j=0; j<4;j++) {
			System.out.println(Thread.currentThread().getName()+" is control");
		}
		
	}

}
