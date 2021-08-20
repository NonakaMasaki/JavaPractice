package Characters;

import Creature.BattleCreature;
import Items.Item;

public class Hero extends Character {

	//装備
	Item item;
		//nameはsccanの時に変える
	protected String name ;
	protected int hp = 250;
	protected int level =15;
	protected String job = "ウォーリアー" ;

	public void attack(BattleCreature bc) {

		System.out.println(getName() + "の攻撃!");


		bc.setHp(bc.getHp()-(getLevel()*2));

		System.out.println(bc.getName() + "に" + (getLevel()*2) +"ポイントのダメージを与えた！");

		System.out.println(bc.getName() + "のHPは" + bc.getHp());


	}

	public void attack(BattleCreature bc,Item i) {

		System.out.println(getName() + "の攻撃!");


		bc.setHp(bc.getHp()-(getLevel()*2) + i.getItemPower());

		System.out.println(bc.getName() + "に" + (getLevel()*2+ i.getItemPower()) +"ポイントのダメージを与えた！");

		System.out.println(bc.getName() + "のHPは" + bc.getHp());


	}




	public void run() {
		System.out.println(this.name + "は逃げ出した!");
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


	public void setJob(String job) {
		this.job = job;
	}
	public String getJob() {
		return this.job;
	}


}
