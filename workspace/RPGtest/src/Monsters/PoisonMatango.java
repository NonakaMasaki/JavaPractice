package Monsters;
import Creature.BattleCreature;
public class PoisonMatango extends Matango{
	private String name  = "ポイズンマタンゴ";
	private int hp = 50;
	private int level =8;
	private int poison = 5;

	//コンストラクタ
	public PoisonMatango(char suffix){

		super(suffix);
	}


	//毒アタック
	public void attack(BattleCreature bc) {

			super.attack(bc);
			if (getPoison() > 0) {
				System.out.println("さらに毒の胞子をばらまいた");
			    int dmg = (bc.getHp()/5);
			    bc.setHp(bc.getHp() - dmg);
			    setPoison(getPoison() - 1) ;
				System.out.println(dmg  + "ポイントのダメージを与えた！");
				System.out.println(bc.getName() + "のHPは" + bc.getHp());
			}


	}


	//get set
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}



	public void setPoison(int poison) {
		this.poison = poison;
	}
	public int getPoison() {
		return this.poison;
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
