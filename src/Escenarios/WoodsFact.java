package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Avatar;
import subClases.*;

public class WoodsFact implements EnemyFactory{
	int vida=12;
	int fuerza=4;
	int poder=3;
	int defensa=3;
	int resistencia=3;
	public Avatar createMage() {
		Mage enemy= new WoodsMage(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	
	}

	
	public Avatar createWarrior() {
		Warrior enemy= new WoodsWarrior(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createBomber() {
		Bomber enemy= new WoodsBomber(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createAssassin() {
		Assassin enemy= new WoodsAssassin(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}

	
	public Avatar createShooter() {
		Shooter enemy= new WoodsShooter(vida, fuerza, poder, defensa, resistencia);
		return enemy;
	}
}
