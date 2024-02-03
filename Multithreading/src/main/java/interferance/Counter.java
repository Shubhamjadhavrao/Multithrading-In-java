/**
 * 
 */
package interferance;

/**
 * 
 */
public class Counter {
	private static volatile int c = 10;

	public void increment() {

		c++;

	}

	public void decrement() {

		c--;

	}

	public int value() {
		return c;

	}

}
