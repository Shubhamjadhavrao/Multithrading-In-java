package interthreadcommunication;

public class Company {
	private int item;
	private boolean newItem = false;

	synchronized void produce(int newItem) {
		while (this.newItem) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.item = newItem;
		System.out.println("produce: " + newItem);
		this.newItem = true;
		notify();

	}

	synchronized int consume() {
		while (!this.newItem) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		int consumedItem = item;
		System.out.println("consume: " + consumedItem);
		this.newItem = false;
		notify();
		return consumedItem;
	}

}
