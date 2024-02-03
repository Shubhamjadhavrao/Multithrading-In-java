/**
 * 
 */
package FlipcartOrderApp;

import interferance.myThread2;

/**
 * 
 */
public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		Order o2 = new Order();
		
		MyThread1 t1 = new MyThread1(o2, 6);
		MyThread2 t2 = new MyThread2(o2, 2);
		
		t1.setName("Shubham");
		t2.setName("Raj");
		
		t1.start();
		t2.start();
		
		MyThread1 t3 = new MyThread1(o2, 6);
		MyThread2 t4 = new MyThread2(o2, 7);
		
		t3.setName("Ram");
		t4.setName("Sham");
		
		t3.start();
		t4.start();
	}

}
