package subClases;

import Clases.Mage;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;

public class DesertMage extends Mage{
	

	public DesertMage(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estadísticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Mage.vidaGen;
		fuerza = fuerzaE+Mage.fuerzaGen;
		poder = poderE+Mage.poderGen;
		defensa = defensaE+Mage.defensaGen;
		resistencia = resistenciaE+Mage.resistenciaGen;
		clase="Mago";
		System.out.println("Su proximo enemigo es un mago del desierto! ");
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
