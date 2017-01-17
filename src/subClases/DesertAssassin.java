package subClases;

import Clases.Assassin;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Agresivo;

public class DesertAssassin extends Assassin{
	public DesertAssassin(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Assassin.vidaGen;
		fuerza = fuerzaE+Assassin.fuerzaGen;
		poder = poderE+Assassin.poderGen;
		defensa = defensaE+Assassin.defensaGen;
		resistencia = resistenciaE+Assassin.resistenciaGen;
		clase="Asesino";
		
		System.out.println("Su proximo enemigo es un asesino del desierto! ");
		setStrategy(new Agresivo());
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
