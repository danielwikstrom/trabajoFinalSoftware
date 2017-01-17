package subClases;

import Clases.Warrior;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Defensivo;

public class WoodsWarrior extends Warrior{
	public WoodsWarrior(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Warrior.vidaGen;
		fuerza = fuerzaE+Warrior.fuerzaGen;
		poder = poderE+Warrior.poderGen;
		defensa = defensaE+Warrior.defensaGen;
		resistencia = resistenciaE+Warrior.resistenciaGen;
		clase="Guerrero";

		System.out.println("Su proximo enemigo es un guerrero del Bosque! ");
		setStrategy(new Defensivo());
		System.out.println("Sus estadisticas son las siguientes: ");
		
		dormido= new Dormido(this);
		quemado= new Quemado(this);
		evasivo = new Evasivo(this);
		normal= new Normal(this);
		
		state= normal;
		
		isNormal=true;
		isQuemado=false;
		isDormido=false;
		isEvasivo=false;
		
		
	}
}
