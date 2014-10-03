package test;

import static org.junit.Assert.*;

import java.util.Collection;

import monsters.Monster;

import org.junit.Test;

public class TestMonster {

	@Test
	public void testGetterSetterHealth() {
		Monster monster = new Monster(100, 5, "MONSTER");
		assertEquals(100, monster.getHealth());
		monster.setHealth(50);
		assertEquals(50, monster.getHealth());
	}

	@Test
	public void testGetterSetterName(){
		Monster monster = new Monster(100, 5, "Monster");
		assertEquals("Monster", monster.getName());
	}
	
	@Test
	public void testAttacks(){
		Monster monster = new Monster(100, 5, "Monster");
		monster.addAttack("bite");
		assertTrue(monster.doesAttacklistContain("bite"));
		assertEquals(5, monster.getAttackPower());
		
		Collection<String> foo = monster.getAttacks();
		assertTrue(foo.contains("bite"));
	}
	
	@Test
	public void testDamage(){
		Monster monster = new Monster(100, 5, "Monster");
		assertEquals(100, monster.getHealth());
		monster.injure(50);
		assertEquals(50, monster.getHealth());
	}
	

}
