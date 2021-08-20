package Characters;

import Creature.BattleCreature;
import Items.Item;

public class SuperHero extends Hero{
	private String name ="スーパーモナカ";
	private int hp = 100;
	private int level =15;
	boolean flying;


	public void run() {
		System.out.println(this.name + "は撤退した");
	}


	public void fly() {
		this.flying = true ;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	public void attack(BattleCreature bc) {

		super.attack(bc);
		if (this.flying) {
			System.out.println(getName() + "の攻撃!");
			bc.setHp(bc.getHp()-getLevel());
			System.out.println("５ポイントのダメージを与えた！");
		}

	}

	public void attack(BattleCreature bc,Item i) {

		super.attack(bc,i);
		if (this.flying) {
			System.out.println(getName() + "の攻撃!");
			bc.setHp(bc.getHp()-getLevel());
			System.out.println("５ポイントのダメージを与えた！");
		}

	}


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

	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return this.level;
	}




}
