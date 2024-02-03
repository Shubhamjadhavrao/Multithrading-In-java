/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class PersonA implements Runnable {
	Chat A;
	String[] s1 = { "Hi", "How are you ?", "I am also doing fine!" };

	public PersonA(Chat a) {
		super();
		A = a;
		this.s1 = s1;
	}

	@Override
	public void run() {
		for (int i = 0; i < s1.length; i++) {
			A.Question(s1[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
