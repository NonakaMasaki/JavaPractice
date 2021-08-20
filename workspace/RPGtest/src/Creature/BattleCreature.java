package Creature;

public abstract class BattleCreature implements
	Creature {
	 protected String name ;
	 protected int hp;
	 protected String job ;
	 protected int level ;



	 public void attack(BattleCreature bc) {
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


		public void setJob(String job) {
			this.job = job;
		}
		public String getJob() {
			return this.job;
		}

		public void setLevel(int level) {
			this.level = level;
		}
		public int getLevel() {
			return this.level;
		}

}