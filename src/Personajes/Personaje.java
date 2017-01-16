package Personajes;
import State.*;

public class Personaje extends Avatar{

	
	

	
	
	
	public Personaje (int vida,int fuerza, int defensa, int poder, int resistencia,String clase){
		
		this.vida=vida;
		this.fuerza=fuerza;
		this.defensa=defensa;
		this.poder=poder;
		this.resistencia=resistencia;
		this.clase=clase;
		
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
