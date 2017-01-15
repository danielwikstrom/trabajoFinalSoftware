package subClases;

import Clases.Assassin;
import Clases.Warrior;

public class OceanAssassin extends Assassin{
	public OceanAssassin(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estad�sticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Assassin.vidaGen;
		fuerza = fuerzaE+Assassin.fuerzaGen;
		poder = poderE+Assassin.poderGen;
		defensa = defensaE+Assassin.defensaGen;
		resistencia = resistenciaE+Assassin.resistenciaGen;
		
		System.out.println("Su proximo enemigo es un asesino del Oceano! ");
		System.out.println("Sus estadisticas son las siguientes: ");
		
	}
}