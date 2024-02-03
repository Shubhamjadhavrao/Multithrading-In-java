package FlipcartOrderApp;

public class MyThread2 extends Thread {
	Order order;
	int product;

	public MyThread2(Order order, int product) {
		super();
		this.order = order;
		this.product = product;
	}

	public void run() {
		order.productOrder(product);

	}
}
