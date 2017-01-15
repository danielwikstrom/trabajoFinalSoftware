package subClases;

import Clases.Shooter;
import Clases.Warrior;

public class DesertWarrior extends Warrior{
	public DesertWarrior(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Warrior.vidaGen;
		fuerza = fuerzaE+Warrior.fuerzaGen;
		poder = poderE+Warrior.poderGen;
		defensa = defensaE+Warrior.defensaGen;
		resistencia = resistenciaE+Warrior.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un guerrero del desierto! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
