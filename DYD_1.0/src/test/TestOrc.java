package test;

import static org.junit.Assert.*;
import monsters.Orc;

import org.junit.Test;

public class TestOrc {

	@Test
	public void testGetterSetterName() {
		Orc rolm = new Orc("Rolm");
		assertEquals("Rolm", rolm.getName());
	}

	@Test
	public void testGetterSetterHealth() {
		Orc rolm = new Orc("Rolm");
		assertEquals(50, rolm.getHealth());
	}

	@Test
	public void testInjure() {
		Orc rolm = new Orc("Rolm");
		rolm.injure(15);
		assertEquals(35, rolm.getHealth());
	}

}
