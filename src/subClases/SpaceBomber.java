package subClases;

import Clases.Bomber;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Defensivo;

public class SpaceBomber extends Bomber{
	public SpaceBomber(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Bomber.vidaGen;
		fuerza = fuerzaE+Bomber.fuerzaGen;
		poder = poderE+Bomber.poderGen;
		defensa = defensaE+Bomber.defensaGen;
		resistencia = resistenciaE+Bomber.resistenciaGen;
		clase="Bombardero";
		System.out.println("Su próximo enemigo es un bombardero del Espacio! ");
		setStrategy(new Defensivo());
		System.out.println("Sus estadísticas son las siguientes: ");
		
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
