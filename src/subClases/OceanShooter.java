package subClases;

import Clases.Shooter;
import Clases.Warrior;

public class OceanShooter extends Shooter{
	public OceanShooter(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ OceanShooter.vidaGen;
		fuerza = fuerzaE+OceanShooter.fuerzaGen;
		poder = poderE+OceanShooter.poderGen;
		defensa = defensaE+OceanShooter.defensaGen;
		resistencia = resistenciaE+OceanShooter.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un tirador del desierto! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
