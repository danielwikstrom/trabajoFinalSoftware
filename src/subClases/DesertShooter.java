package subClases;

import Clases.Mage;
import Clases.Shooter;
import Clases.Warrior;

public class DesertShooter extends Shooter{
	public DesertShooter(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estad�sticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Shooter.vidaGen;
		fuerza = fuerzaE+Shooter.fuerzaGen;
		poder = poderE+Shooter.poderGen;
		defensa = defensaE+Shooter.defensaGen;
		resistencia = resistenciaE+Shooter.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un tirador del desierto! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}