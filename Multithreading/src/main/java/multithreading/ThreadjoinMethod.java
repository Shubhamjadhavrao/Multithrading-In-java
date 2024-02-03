
package multithreading;

public class ThreadjoinMethod extends  Thread{
	
	public void run() {
		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(400);
				System.out.println("The Current Thread Name is: "+Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println("Exception Has Been Cught: "+e);
			}
			
			System.out.println(i);
		}
	}
}
