package Game;

import Personajes.Avatar;
import Personajes.Personaje;

public class FuncionesJuego {
	public void aplicarQuemadura(Avatar prot, Avatar enemigo)
	{
		if (prot.isQuemado)
		{
			prot.setVidaActual(prot.getVidaActual()-10);
			System.out.println("la quemadura le quita 10 de vida al jugador");
			
		}
		if (enemigo.isQuemado)
		{
			enemigo.setVidaActual(enemigo.getVidaActual()-10);
			System.out.println("la quemadura le quita 10 de vida al enemigo");
		}
	}
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
