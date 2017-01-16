package Factory;

import Personajes.Enemigo;

public interface EnemyFactory {
	public Enemigo createMage();
	public Enemigo createWarrior();
	public Enemigo createBomber();
	public Enemigo createAssassin();
	public Enemigo createShooter();
	
	
}
