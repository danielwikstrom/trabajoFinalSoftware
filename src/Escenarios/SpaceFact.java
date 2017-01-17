package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Avatar;
import subClases.*;

public class SpaceFact implements EnemyFactory{
	
	int vida=8;
	int fuerza=2;
	int poder=4;
	int defensa=3;
	int resistencia=3;
	
	public Avatar createMage() {
		Mage enemy= new SpaceMage(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	
	}

	
	public Avatar createWarrior() {
		Warrior enemy= new SpaceWarrior(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createBomber() {
		Bomber enemy= new SpaceBomber(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createAssassin() {
		Assassin enemy= new SpaceAssassin(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createShooter() {
		Shooter enemy= new SpaceShooter(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

}