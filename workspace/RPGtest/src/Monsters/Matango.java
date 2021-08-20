package Monsters;
import Creature.BattleCreature;
public class Matango extends WalkingMonster{
	private String name  = "マタンゴ";
	private int hp = 50;
	private int level =8;
	char suffix;

	//コンストラクタ
	//new時に接頭語を受け取る
	public Matango(char suffix){

	//nameに接頭語をつけてsetする
	setName((name + suffix));
}


public void attack(BattleCreature bc) {


	System.out.println(getName() + "の攻撃");
						//対象のHPをgetして減算
	bc.setHp(bc.getHp() - getLevel());



	System.out.println(bc.getName() + "に"+ getLevel() +"のダメージを与えた！");
	System.out.println(bc.getName() + "のHPは" + bc.getHp());
}




	//get set
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
