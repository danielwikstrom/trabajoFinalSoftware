package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Avatar;
import subClases.*;

public class DesertFact implements EnemyFactory{
	int vida=10;
	int fuerza=3;
	int poder=3;
	int defensa=3;
	int resistencia=3;
	
	public Avatar createMage() {
		Mage enemy= new DesertMage(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	
	}

	
	public Avatar createWarrior() {
		Warrior enemy= new DesertWarrior(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createBomber() {
		Bomber enemy= new DesertBomber(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createAssassin() {
		Assassin enemy= new DesertAssassin(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createShooter() {
		Shooter enemy= new DesertShooter(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

}
