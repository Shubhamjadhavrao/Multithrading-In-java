/**
 * 
 */
package interferance;



/**
 * 
 */
public class myThread2 extends Thread {
	Counter counter;

	public myThread2(Counter counter) {
		super();
		this.counter = counter;
	}
	
	public void run() {
		System.out.println("Mt2 is running increment operation!!");
		
		System.out.println(Thread.currentThread().getName());
		
		counter.decrement();
		
		System.out.println("After inrement: "+counter.value());
		
	}
	

}
