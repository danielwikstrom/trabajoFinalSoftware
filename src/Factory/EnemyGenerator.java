package Factory;


import Personajes.Avatar;

public class EnemyGenerator {

	EnemyFactory ef;
	Avatar m;
	Avatar w;
	Avatar b;
	Avatar a;
	Avatar s;
	
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
