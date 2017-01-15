package subClases;

import Clases.Assassin;
import Clases.Bomber;
import Clases.Warrior;

public class DesertBomber extends Bomber{
	public DesertBomber(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Bomber.vidaGen;
		fuerza = fuerzaE+Bomber.fuerzaGen;
		poder = poderE+Bomber.poderGen;
		defensa = defensaE+Bomber.defensaGen;
		resistencia = resistenciaE+Bomber.resistenciaGen;
		System.out.println("Su proximo enemigo es un bombardero del desierto! ");
		System.out.println("Sus estadisticas son las siguientes: ");
	
	}
}
