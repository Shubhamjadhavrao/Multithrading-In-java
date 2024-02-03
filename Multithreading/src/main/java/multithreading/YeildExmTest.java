/**
 * 
 */
package multithreading;

/**
 * 
 */
public class YeildExmTest{
	public static void main(String[] args) {
		YeildExm t1 = new YeildExm();
		YeildExm t2 =new YeildExm();
		
		t1.setPriority(5);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
	
	
		for(int j=0; j<4;j++) {
			t1.yield();
			System.out.println(Thread.currentThread().getName()+" is control");
		}
		
	}

}
