package object.b;

import storage.StorageObject;

/**
 * The class that does the math
 * @author Thomas Mather
 *
 */
public class B extends Thread implements Runnable {
	int total;
	
	
	@Override
	public void run() {
		synchronized (this) {
			int a = StorageObject.cellA;
			int b = StorageObject.cellB;
			total = a + b;
			StorageObject.res = total;
			notify();
		}
	}
	
	public int getTotal() {
		return total;
	}
}
