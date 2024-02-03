package FlipcartOrderApp;

public class MyThread1 extends Thread {
	Order order;
	int product;

	public MyThread1(Order order, int product) {
		super();
		this.order = order;
		this.product = product;
	}

	public void run() {
		order.productOrder(product);

	}
}
