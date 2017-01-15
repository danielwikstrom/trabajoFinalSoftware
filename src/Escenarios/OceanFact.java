package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Enemigo;
import subClases.*;

public class OceanFact implements EnemyFactory{
	
	int vida=15;
	int fuerza=3;
	int poder=1;
	int defensa=4;
	int resistencia=4;
	public Enemigo createMage() {
		Mage enemy= new OceanMage(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Ocean  Mage Created");
		return enemy;
	
	}

	
	public Enemigo createWarrior() {
		Warrior enemy= new OceanWarrior(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Ocean Warrior Created");
		return enemy;
	}

	
	public Enemigo createBomber() {
		Bomber enemy=  new OceanBomber(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Ocean Bomber Created");
		return enemy;
	}

	
	public Enemigo createAssassin() {
		Assassin enemy= new OceanAssassin(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Ocean Assassin Created");
		return enemy;
	}

	
	public Enemigo createShooter() {
		Shooter enemy= new OceanShooter(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Ocean Shooter Created");
		return enemy;
	}

}

