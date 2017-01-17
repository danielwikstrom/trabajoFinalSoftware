package subClases;

import Clases.Shooter;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Agresivo;

public class DesertShooter extends Shooter{
	public DesertShooter(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Shooter.vidaGen;
		fuerza = fuerzaE+Shooter.fuerzaGen;
		poder = poderE+Shooter.poderGen;
		defensa = defensaE+Shooter.defensaGen;
		resistencia = resistenciaE+Shooter.resistenciaGen;
		clase="Tirador";

		System.out.println("Su próximo enemigo es un tirador del desierto! ");
		setStrategy(new Agresivo());
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
