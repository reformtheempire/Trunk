package player;

import java.util.ArrayList;
import java.util.Collection;

public class Attacks {
	private Collection<String> attacks = new ArrayList<String>();
	
	public void addAttack(String attack){
		if(!attacks.contains(attack)){
			attacks.add(attack);
		}
	}
	
	public String printAttacks(){
		return attacks.toString();
	}
}
