package subClases;

import Clases.Warrior;

public class SpaceWarrior extends Warrior{
	public SpaceWarrior(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Warrior.vidaGen;
		fuerza = fuerzaE+Warrior.fuerzaGen;
		poder = poderE+Warrior.poderGen;
		defensa = defensaE+Warrior.defensaGen;
		resistencia = resistenciaE+Warrior.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un guerrero del Espacio! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
