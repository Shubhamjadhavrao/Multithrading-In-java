/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class Consumer implements Runnable {
	private Company company;

	public Consumer(Company company) {
		super();
		this.company = company;
	}

	@Override
	public void run() {
		for(int i=0 ; i<5; i++){
			int condumedItem = company.consume();
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
