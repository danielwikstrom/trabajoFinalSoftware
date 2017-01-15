package Factory;

import Clases.Assassin;
import Clases.Bomber;
import Clases.Mage;
import Clases.Shooter;
import Clases.Warrior;
import Personajes.Enemigo;

public class EnemyGenerator {

	EnemyFactory ef;
	Enemigo m;
	Enemigo w;
	Enemigo b;
	Enemigo a;
	Enemigo s;
	
	public EnemyGenerator(EnemyFactory s)
	{
		ef=s;
		
	}
	public void createEnemy(String enemy) {
		if (enemy.equals("Mago")) m= ef.createMage();
		if (enemy.equals("Guerrero")) w= ef.createWarrior();
		if (enemy.equals("Bombardero")) b= ef.createBomber();
		if (enemy.equals("Asesino")) a= ef.createAssassin();
		if (enemy.equals("Tirador")) s= ef.createShooter();
		
		System.out.println();
		}
		
}
