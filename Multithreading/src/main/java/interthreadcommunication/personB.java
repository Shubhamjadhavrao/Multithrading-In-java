/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class personB implements Runnable {
	Chat B;
	String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

	public personB(Chat b) {
		super();
		B = b;
		this.s2 = s2;
	}

	@Override
	public void run() {
		for (int i = 0; i < s2.length; i++) {
			B.Answer(s2[i]);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
