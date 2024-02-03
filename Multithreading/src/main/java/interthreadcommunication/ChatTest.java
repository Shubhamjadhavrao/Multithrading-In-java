/**
 * 
 */
package interthreadcommunication;

/**
 * 
 */
public class ChatTest {
	public static void main(String[] args) {
		Chat c = new Chat();
		
		Thread a = new Thread(new PersonA(c));
		Thread b = new Thread(new personB(c));
		
		a.start();
		b.start();
	}

}
