package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Avatar;
import subClases.*;

public class OceanFact implements EnemyFactory{
	
	int vida=15;
	int fuerza=3;
	int poder=1;
	int defensa=4;
	int resistencia=4;
	public Avatar createMage() {
		Mage enemy= new OceanMage(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	
	}

	
	public Avatar createWarrior() {
		Warrior enemy= new OceanWarrior(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createBomber() {
		Bomber enemy=  new OceanBomber(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createAssassin() {
		Assassin enemy= new OceanAssassin(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createShooter() {
		Shooter enemy= new OceanShooter(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

}

