package Escenarios;

import Clases.*;
import Factory.EnemyFactory;
import Personajes.Enemigo;
import subClases.*;

public class WoodsFact implements EnemyFactory{
	int vida=12;
	int fuerza=4;
	int poder=3;
	int defensa=3;
	int resistencia=3;
	public Enemigo createMage() {
		Mage enemy= new WoodsMage(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Woods Mage Created");
		return enemy;
	
	}

	
	public Enemigo createWarrior() {
		Warrior enemy= new WoodsWarrior(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Woods Warrior Created");
		return enemy;
	}

	
	public Enemigo createBomber() {
		Bomber enemy= new WoodsBomber(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Woods Bomber Created");
		return enemy;
	}

	
	public Enemigo createAssassin() {
		Assassin enemy= new WoodsAssassin(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Woods Assassin Created");
		return enemy;
	}

	
	public Enemigo createShooter() {
		Shooter enemy= new WoodsShooter(vida, fuerza, poder, defensa, resistencia);
		System.out.println("Woods Shooter Created");
		return enemy;
	}
}
