package Factory;

import Personajes.Avatar;

public class imprimir {
	public void imprimirStats(Avatar avatar)
	{
	System.out.println("Vida: "+avatar.getVida());
	System.out.println("Fuerza: "+avatar.getFuerza());
	System.out.println("Defensa: "+avatar.getDefensa());
	System.out.println("Poder: "+avatar.getPoder());
	System.out.println("Resistencia: "+avatar.getResistencia());
System.out.println();	
	}
}
