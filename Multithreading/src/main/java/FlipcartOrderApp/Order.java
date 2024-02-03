package FlipcartOrderApp;

public class Order {
	static int totalOrder = 20;

	public static synchronized void productOrder(int Order) {

		if (Order <= totalOrder) {
			
			System.out.println(Order + " product order Successfully by : " + Thread.currentThread().getName());

			totalOrder = totalOrder - Order;

			System.out.println("Available product After order: " + totalOrder);
			
		} else {
			
			System.out.println("Sorry you Can't Oreder Product!!!: "  +/* Order + */   " Available product are: " + totalOrder);
		}

	}

}
