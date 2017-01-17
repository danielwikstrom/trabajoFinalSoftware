package Factory;

import Personajes.Avatar;

public interface EnemyFactory {
	public Avatar createMage();
	public Avatar createWarrior();
	public Avatar createBomber();
	public Avatar createAssassin();
	public Avatar createShooter();
	
	
}
