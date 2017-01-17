package Game;

import java.util.Scanner;

import Accion.Action;
import Personajes.Avatar;
import Personajes.Personaje;

public class FuncionesJuego {
	Scanner sc= new Scanner(System.in);
	public void aplicarQuemadura(Avatar prot, Avatar enemigo)
	{
		if (prot.isQuemado)
		{
			prot.setVidaActual(prot.getVidaActual()-10);
			System.out.println("La quemadura le quita 10 de vida al jugador");
			
		}
		if (enemigo.isQuemado)
		{
			enemigo.setVidaActual(enemigo.getVidaActual()-10);
			System.out.println("La quemadura le quita 10 de vida al enemigo");
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
System.out.println();	
	}
	public Avatar crearPersonaje()
	{
	int vidaP=0;
	int fuerzaP=0;
	int poderP=0;
	int resistenciaP=0;
	int defensaP=0;
	String claseP = null;
	
	int a;
	int b;
	int aux;
	
	//puntos que se pueden repartir durante la creación del personaje
	int puntosRepartir=12;
	
	System.out.println("Escoga la clase de su personaje de entre  ");
	System.out.println("Las siguientes (1-5): ");
	System.out.println("1.Guerrero ");
	System.out.println("2.Mago ");
	System.out.println("3.Bombardero ");
	System.out.println("4.Tirador ");
	System.out.println("5.Asesino ");
	System.out.println();
	do
	{
	a=sc.nextInt();
	if(a<1 || a> 5)
		System.out.println("El valor introducido no es válido, vuelva a intentarlo");
	}while (a<1 || a> 5);
	switch(a){
	case 1:
		claseP="Guerrero";
		vidaP=95;
		fuerzaP=1;
		poderP=0;
		defensaP=2;
		resistenciaP=1;
		break;
	case 2:
		claseP="Mago";
		vidaP=65;
		fuerzaP=0;
		poderP=3;
		defensaP=1;
		resistenciaP=0;
		break;
	case 3:
		claseP="Bombardero";
		vidaP=85;
		fuerzaP=2;
		poderP=2;
		defensaP=0;
		resistenciaP=0;
		break;
	case 4:
		claseP="Tirador";
		vidaP=75;
		fuerzaP=2;
		poderP=0;
		defensaP=1;
		resistenciaP=1;
		break;
	case 5:
		claseP="Asesino";
		vidaP=60;
		fuerzaP=3;
		poderP=0;
		defensaP=1;
		resistenciaP=0;
		break;
	default:
		break;
	}
	System.out.println("Has elegido la clase "+ claseP);
	System.out.println("Tus estadisticas base son las siguientes:");
	System.out.println("Vida: "+vidaP);
	System.out.println("Fuerza: "+fuerzaP);
	System.out.println("Defensa: "+defensaP);
	System.out.println("Poder: "+poderP);
	System.out.println("Resistencia: "+resistenciaP);
	System.out.println();
	
	System.out.println("Ahora puedes asignar 12 puntos extra a los");
	System.out.println("atributos que quieras(excepto la vida)");
	System.out.println("Puntos por repartir: " + puntosRepartir);
	while(puntosRepartir>0)
	{
		System.out.println("Que atributo deseas cambiar(1-4)?");
		
		System.out.println("1. Fuerza : " + fuerzaP);
		System.out.println("2. Defensa: "+defensaP);
		System.out.println("3. Poder: "+poderP);
		System.out.println("4. Resistencia: "+resistenciaP);
		
		do{
		b=sc.nextInt();
		if(b<1 || b>4)
			System.out.println("El valor introducido no es válido, vuelva a intentarlo");
		}while(b<1 || b>4);
		do
		{
			System.out.println("Cuántos puntos deseas asignar?");
		
			aux= sc.nextInt();
			if(aux<0)
				System.out.println("No introduzca valores negativos");
		}while(aux<0);
		if(aux>puntosRepartir)
			aux= puntosRepartir;
		switch(b){
		case 1:
			
			fuerzaP+=aux;
			break;
		case 2:
			
			defensaP+= aux;
			break;
		case 3:
			
			poderP+= aux;
			break;
		case 4:
			
			resistenciaP+= aux;
			break;
		default:
			break;
			
		}
		puntosRepartir-=aux;
		System.out.println("Puntos por repartir: " + puntosRepartir);
		System.out.println();
		
		
	}
	
	Avatar prot = new Personaje(vidaP, fuerzaP, defensaP, poderP, resistenciaP,claseP);
	return prot;
	}
	public Action actionPlayer(Action at1, Action at2, Action def1, Action def2)
	{
		int nextActionAux=0;
		Action nextPAction = null;
		System.out.println("¿Qué acción deseas realizar(1-4)?");
		System.out.println("1."+ at1.getDescription());
		System.out.println("2."+ at2.getDescription());
		System.out.println("3."+ def1.getDescription());
		System.out.println("4."+ def2.getDescription());
		do
		{
	nextActionAux=sc.nextInt();
	if(nextActionAux<1 || nextActionAux>4)
		System.out.println("Acción no valida, vuelva a introducir un número");
		}while(nextActionAux<1 || nextActionAux>4);
	
		switch(nextActionAux)
			{
		case 1:
			nextPAction=at1;
			break;
		case 2:
			nextPAction=at2;
			break;
		case 3:
			nextPAction=def1;
			break;
		case 4:
			nextPAction=def2;
			break;
		default:
			break;
			}
		return nextPAction;
	}
	public void puntuacion(int victorias)
	{
		if (victorias < 1)
			System.out.println("No ganaste ni una partida... eres malísimo.");
		else if(victorias <= 3)
			System.out.println("Ganaste " + victorias + " veces, seguro que puedes hacerlo mejor.");
		else if(victorias <= 5)
			System.out.println(victorias + " victorias ... no está mal.");
		else if(victorias <= 8)
			System.out.println("Ya no pareces un novato, con " + victorias + " incluso dirá que no se te da nada mal");
		else if(victorias <=10)
			System.out.println("Genial! Ganaste " + victorias + " veces, esto ya es otra cosa!");
		else 
			System.out.println("INCREIBLE!!! Ya no hay quién pueda contigo! Eliminaste a " + victorias + " enemigos!");
	}
}
