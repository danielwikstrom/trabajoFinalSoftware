package Factory;

import Clases.Assassin;
import Clases.Bomber;
import Clases.Mage;
import Clases.Shooter;
import Clases.Warrior;
import Personajes.Enemigo;

public interface EnemyFactory {
	public Enemigo createMage();
	public Enemigo createWarrior();
	public Enemigo createBomber();
	public Enemigo createAssassin();
	public Enemigo createShooter();
	
	
}
