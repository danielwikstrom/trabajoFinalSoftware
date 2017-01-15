package subClases;

import Clases.Assassin;
import Clases.Warrior;

public class DesertAssassin extends Assassin{
	public DesertAssassin(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Assassin.vidaGen;
		fuerza = fuerzaE+Assassin.fuerzaGen;
		poder = poderE+Assassin.poderGen;
		defensa = defensaE+Assassin.defensaGen;
		resistencia = resistenciaE+Assassin.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un asesino del desierto! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}
