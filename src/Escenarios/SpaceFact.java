package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Enemigo;
import subClases.*;

public class SpaceFact implements EnemyFactory{
	
	int vida=8;
	int fuerza=2;
	int poder=4;
	int defensa=3;
	int resistencia=3;
	
	public Enemigo createMage() {
		Mage enemy= new SpaceMage(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Space Mage Created");
		return enemy;
	
	}

	
	public Enemigo createWarrior() {
		Warrior enemy= new SpaceWarrior(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Space Warrior Created");
		return enemy;
	}

	
	public Enemigo createBomber() {
		Bomber enemy= new SpaceBomber(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Space Bomber Created");
		return enemy;
	}

	
	public Enemigo createAssassin() {
		Assassin enemy= new SpaceAssassin(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Space Assassin Created");
		return enemy;
	}

	
	public Enemigo createShooter() {
		Shooter enemy= new SpaceShooter(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Space Shooter Created");
		return enemy;
	}

}