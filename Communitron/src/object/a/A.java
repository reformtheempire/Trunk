package object.a;

import object.b.B;

/**
 * The class that makes b do math
 * 
 * @author Thomas Mather
 *
 */
public class A extends Thread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		B threadB = new B();
		threadB.start();
		synchronized (threadB) {
			try {
				System.out.println("Waiting on B");
				threadB.wait();
			} catch (InterruptedException e) {
				System.err.println("Ah. We've had an accident");
			}
			System.out.println("Total = " + threadB.getTotal());
		}

		try {
			wait();
		} catch (Exception e) {
			System.err.println("Seems as if the program has soiled itself");
		}
		try {
			notify();
		} catch (Exception e) {
			System.err.println("This may be a problem");
		}
	}
}
