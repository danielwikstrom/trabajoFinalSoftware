package Singleton;

import java.util.Random;

import Accion.*;
import Personajes.Avatar;

public class Calculator {
	private static Calculator uniqueInstance;
	
	private Calculator()
	{
		
	}
	
	public static Calculator getInstance()
	{
		if(uniqueInstance == null)
			uniqueInstance = new Calculator();
		
		return uniqueInstance;
		
	}
	
	public void CalculateOutcome(Action action, Avatar origen, Avatar destino)
	{
		
		int crit=0;
		Random rng= new Random();
		System.out.println();
		if(action.getIsAttack())
		{
		crit=rng.nextInt(4);System.out.println("daño original de la accion: "+ action.getDamage());
		if(crit==2)//hay un 20% de posibilidades de hacer critico
		{
			action= new Critic(action);
			
			}
		System.out.println("usó " + action.getDescription());
		int dano=0;
		boolean isFuerza;
		int vidaActual=destino.getVidaActual();
		
		isFuerza=action.getForce();
		if(isFuerza){
		dano=(action.getDamage()+(3*origen.getFuerza()))-(3*destino.getDefensa());
		}
		else
		{
			dano=(action.getDamage()+(3*origen.getPoder()))-(3*destino.getResistencia());
		}
		if(dano<0)
			dano=0;
		System.out.println("danio hecho: "+ dano);
		vidaActual= vidaActual-dano;
		destino.setVidaActual(vidaActual);
		}
		else 
		{
			System.out.println("usó " + action.getDescription());
			if(action.getIsCura())
			{
				int poderCurativo=20;
				int vidaActual=origen.getVidaActual();
				vidaActual += poderCurativo;
				if(vidaActual > origen.getVida())
					origen.setVidaActual(origen.getVida());
				else
					origen.setVidaActual(vidaActual);
			System.out.println("se ha curado " + poderCurativo);
			}
			else 
				System.out.println("no tuvo efecto....");
		}
			
	}

}
