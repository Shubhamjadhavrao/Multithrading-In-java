/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class Producer implements Runnable {
	private Company company;

	public Producer(Company company) {
		super();
		this.company = company;
	}

	@Override
	public void run() {
		for(int i=0 ; i<5; i++){
			company.produce(i);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
