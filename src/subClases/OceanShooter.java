package subClases;

import Clases.Shooter;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Agresivo;

public class OceanShooter extends Shooter{
	public OceanShooter(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ OceanShooter.vidaGen;
		fuerza = fuerzaE+OceanShooter.fuerzaGen;
		poder = poderE+OceanShooter.poderGen;
		defensa = defensaE+OceanShooter.defensaGen;
		resistencia = resistenciaE+OceanShooter.resistenciaGen;
		clase="Tirador";

		System.out.println("Su proximo enemigo es un tirador del desierto! ");
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
