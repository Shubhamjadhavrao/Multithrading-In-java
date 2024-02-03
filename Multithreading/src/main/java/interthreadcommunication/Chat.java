/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class Chat {
	private boolean flag = false;

	public  synchronized void Question(String msg) {

		if (flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}

	public synchronized void Answer(String msg) {

		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}

}	
	