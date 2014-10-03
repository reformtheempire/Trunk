package test;

import static org.junit.Assert.*;
import monsters.Cockroach;

import org.junit.Test;

public class testCockroach {

	@Test
	public void testGetterSetterName() {
		Cockroach geoff = new Cockroach("Geoff");
		assertEquals("Geoff", geoff.getName());
	}
	
	@Test
	public void testGetterSetterHealth() {
		Cockroach geoff = new Cockroach("Geoff");
		assertEquals(7, geoff.getHealth());
	}

	
	@Test
	public void testInjure() {
		Cockroach geoff = new Cockroach("Geoff");
		geoff.injure(5);
		assertEquals(2, geoff.getHealth());
	}
}
