package Main;

import Characters.Hero;
import Creature.BattleCreature;
import Monsters.Goblin;

public class battle {

	public BattleCreature Pc;


	public void target(BattleCreature t , BattleCreature d)  {

	}

	public void setPc(String job) {

	switch(job) {
	case "w" :

	Pc = new Hero();
	break ;

	case "g" :

	Pc = new Goblin();
	break ;

	}

}


	public BattleCreature getPc(String job) {

	switch(job) {
	case "w" :

	return Pc;


	case "g" :
	return Pc;

	}
	return null;

}









	}






























