package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Enemigo;
import subClases.*;

public class DesertFact implements EnemyFactory{
	int vida=10;
	int fuerza=3;
	int poder=3;
	int defensa=3;
	int resistencia=3;
	
	public Enemigo createMage() {
		Mage enemy= new DesertMage(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Desert Mage Created");
		return enemy;
	
	}

	
	public Enemigo createWarrior() {
		Warrior enemy= new DesertWarrior(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Desert Warrior Created");
		return enemy;
	}

	
	public Enemigo createBomber() {
		Bomber enemy= new DesertBomber(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Desert Bomber Created");
		return enemy;
	}

	
	public Enemigo createAssassin() {
		Assassin enemy= new DesertAssassin(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Desert  Assassin Created");
		return enemy;
	}

	
	public Enemigo createShooter() {
		Shooter enemy= new DesertShooter(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Desert Shooter Created");
		return enemy;
	}

}
