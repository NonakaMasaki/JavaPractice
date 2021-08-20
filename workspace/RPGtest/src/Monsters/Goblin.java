package Monsters;
import Creature.BattleCreature;

public class Goblin extends WalkingMonster {
	private String name  = "ゴブリン";
	private int hp = 250;
	private int level =15;
	char suffix;

	public void run() {
		System.out.println(this.name + this.suffix + "はトコトコ走って逃げる");

	}

					//コンストラクタ
	public Goblin(){
}
					//new時に接頭語を受け取る
	public Goblin(char suffix){

					//nameに接頭語をつけてsetする
		setName((name + suffix));
	}
			        	//対象
	public void attack(BattleCreature bc) {


		System.out.println(getName() + "のナイフ攻撃");
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

