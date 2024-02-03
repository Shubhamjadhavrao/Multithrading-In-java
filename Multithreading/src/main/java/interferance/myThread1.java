/**
 * 
 */
package interferance;



/**
 * 
 */
public class myThread1 extends Thread {
	Counter counter;

	public myThread1(Counter counter) {
		super();
		this.counter = counter;
	}
	
	public void run() {
		System.out.println("Mt1 is running increment operation!!");
		
		System.out.println(Thread.currentThread().getName());
		
		counter.increment();
		
		System.out.println("After decrement: "+counter.value());
		
	}
	

}
