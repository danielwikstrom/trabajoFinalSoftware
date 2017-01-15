package subClases;

import Clases.Bomber;
import Clases.Warrior;

public class SpaceBomber extends Bomber{
	public SpaceBomber(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Bomber.vidaGen;
		fuerza = fuerzaE+Bomber.fuerzaGen;
		poder = poderE+Bomber.poderGen;
		defensa = defensaE+Bomber.defensaGen;
		resistencia = resistenciaE+Bomber.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un bombardero del Espacio! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
