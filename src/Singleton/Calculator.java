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
		System.out.println("usó " + action.getDescription());
		//si el avatar origen está dormido no realizará ninguna acción
		//excepto la habilidad "vacuna" del asesino, que se cura de todos los estados
		if(action.getState().equals("Normal"))
			origen.Normal();
		if(!origen.isDormido)
		{
			Random rng= new Random();
			int dar=rng.nextInt(2);
			if(action.getState().equals("Avoid"))
				origen.Evadir();
				
			
			//si el avatar destino está en estado evasivo tiene un 50%
			// de posiblidades de esquivar el ataque
			if(destino.isEvasivo && dar==1 || !destino.isEvasivo)
			{
		
		if(action.getState().equals("Burn"))
			destino.Quemar();
		if(action.getState().equals("Sleep"))
			destino.Dormir();
		
		int crit=0;
		
		
		//si la acción es agresiva se pasa a calcular su daño
		// si es defensiva, se hace el efecto de la accion, que puede ser o curarse 
		//o pasar a otro estado
		if(action.getIsAttack())
		{
		//hay un 20% de posibilidades de hacer critico
		crit=rng.nextInt(4);
		
		if(crit==0)
		{
			action= new Critic(action);
			System.out.println(action.getDescription());
			}
		
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
		System.out.println("Hizo "+ dano +" daño");
		vidaActual= vidaActual-dano;
		destino.setVidaActual(vidaActual);
		}
		
			
			
		
		
		}
			else if(destino.isEvasivo && dar==0 && action.getIsAttack())
			{
				System.out.println("pero el ataque fue esquivado!");
			}
			
			// las curas se hacen sobre si mismo asi que no pueden ser esquivadas
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
		}		
		else
			System.out.println("pero estando dormido no pudo usar ninguna habilidad");
		
		
	}

}
