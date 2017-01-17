package subClases;

import Clases.Mage;
import State.Dormido;
import State.Evasivo;
import State.Normal;
import State.Quemado;
import Strategy.Defensivo;

public class WoodsMage extends Mage{
	public WoodsMage(int vidaE, int fuerzaE, int poderE, int defensaE, int resistenciaE){
		//las estad�sticas con el sufijo "E" son las propias de cada escenario
		vida =vidaE+ Mage.vidaGen;
		fuerza = fuerzaE+Mage.fuerzaGen;
		poder = poderE+Mage.poderGen;
		defensa = defensaE+Mage.defensaGen;
		resistencia = resistenciaE+Mage.resistenciaGen;
		clase="Mago";

		System.out.println("Su pr�ximo enemigo es un mago del Bosque! ");
		setStrategy(new Defensivo());
		System.out.println("Sus estad�sticas son las siguientes: ");
		
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
