package main;

import object.a.A;
import storage.StorageObject;

public class Main {

	public static void main(String[] args) {
		//hello, I am main.
		
		A a = new A();
		
		
		//Make A go and tell b to add cellA and cellB
		
		StorageObject.cellA = 1;
		StorageObject.cellB = 2;
		
		a.start();
		
		synchronized (a) {
			try {
				System.out.println("We Wait for A.");
				a.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		

		//When addition done - print result
		
		System.out.println(StorageObject.res);

	}

}
