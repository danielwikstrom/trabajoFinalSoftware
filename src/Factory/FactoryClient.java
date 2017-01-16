package Factory;

import java.util.Random;

import Escenarios.DesertFact;
import Escenarios.OceanFact;
import Escenarios.SpaceFact;
import Escenarios.WoodsFact;
import Personajes.Avatar;

public class FactoryClient {
	public Avatar createRandomEnemy(EnemyFactory ef,EnemyGenerator eg)
	{
		Avatar enemigo=null;
		Random rng= new Random();//semilla random usada para la elección del mundo y enemigo
		
		int randEnemy=0;
		int randWorld=0;
		
		
		
		randEnemy=rng.nextInt(5);
		
		randWorld=rng.nextInt(4);
		//switch para decidir aleatoriamente cual sera el siguiente escenario
		switch(randWorld)
		{
		case 0:
			ef = new DesertFact();
			break;
		case 1:
			ef = new OceanFact();
			break;
		case 2:
			ef = new SpaceFact();
			break;
		case 3:
			ef = new WoodsFact();
			break;
		default:
			System.out.println("escenario no encontrado");
			break;
		}
		eg = new EnemyGenerator(ef);
		
		//switch para decidir aleatoriamente de qué clase será el siguiente enemigo
		switch(randEnemy)
		{
		case 0:
			eg.createEnemy("Asesino");
			
			enemigo=eg.a;
			break;
		case 1:
			eg.createEnemy("Bombardero");
			
			enemigo=eg.b;
			break;
		case 2:
			
			eg.createEnemy("Mago");
			
			enemigo=eg.m;
			break;
		case 3:
			eg.createEnemy("Tirador");
			
			enemigo=eg.s;
			break;
		case 4:
			eg.createEnemy("Guerrero");
			
			enemigo=eg.w;
			break;
		default:
			System.out.println("enemigo no encontrado");
			break;
		}
		return enemigo;
		
	}
}
