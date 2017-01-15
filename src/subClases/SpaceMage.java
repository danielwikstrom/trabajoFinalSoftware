package subClases;

import Clases.Mage;
import Clases.Warrior;

public class SpaceMage extends Mage{
	public SpaceMage(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Mage.vidaGen;
		fuerza = fuerzaE+Mage.fuerzaGen;
		poder = poderE+Mage.poderGen;
		defensa = defensaE+Mage.defensaGen;
		resistencia = resistenciaE+Mage.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un mago del Espacio! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
