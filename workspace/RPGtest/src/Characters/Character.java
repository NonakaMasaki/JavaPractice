package Characters;

import Creature.BattleCreature;

public class Character extends BattleCreature{
	 protected String name ;
	 protected int hp;
	int mp;







	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}







	public void run() {
		System.out.println(this.name + "は逃げた!");
	}
}

