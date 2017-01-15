package Factory;

import Escenarios.*;
import Personajes.*;
import Singleton.Calculator;

import java.util.Scanner;
import Accion.*;
import Clases.Assassin;

import java.util.Random;
public class Main {
	
	public static void main(String [] args){
		imprimir im= new imprimir();
		
		int vidaP=0;
		int fuerzaP=0;
		int poderP=0;
		int resistenciaP=0;
		int defensaP=0;
		
		
		
		
		int puntosRepartir=12;
		boolean hasLost=false;
		
		String nombre;
		int a;
		int b;
		int aux=0;
		String claseP=null;
		String claseE=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al Fight simlator 3000!");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		
		System.out.println("Introduzca el nombre de su personaje: ");
		nombre=sc.nextLine();
		
		System.out.println("Escoga la clase de su personaje de entre  ");
		System.out.println("Las siguientes (1-5): ");
		System.out.println("1.Guerrero ");
		System.out.println("2.Mago ");
		System.out.println("3.Bombardero ");
		System.out.println("4.Tirador ");
		System.out.println("5.Asesino ");
		do
		{
		a=sc.nextInt();
		if(a<1 || a> 5)
			System.out.println("el valor introducido no es valido, vuelva a intentarlo");
		}while (a<1 || a> 5);
		switch(a){
		case 1:
			claseP="Guerrero";
			vidaP=75;
			fuerzaP=1;
			poderP=0;
			defensaP=2;
			resistenciaP=1;
			break;
		case 2:
			claseP="Mago";
			vidaP=55;
			fuerzaP=0;
			poderP=3;
			defensaP=1;
			resistenciaP=0;
			break;
		case 3:
			claseP="Bombardero";
			vidaP=65;
			fuerzaP=2;
			poderP=2;
			defensaP=0;
			resistenciaP=0;
			break;
		case 4:
			claseP="Tirador";
			vidaP=55;
			fuerzaP=2;
			poderP=0;
			defensaP=1;
			resistenciaP=1;
			break;
		case 5:
			claseP="Asesino";
			vidaP=50;
			fuerzaP=3;
			poderP=0;
			defensaP=1;
			resistenciaP=0;
			break;
		default:
			break;
		}
		System.out.println("Has elegido la clase "+ claseP);
		System.out.println("tus estadisticas base son las siguientes:");
		System.out.println("Vida: "+vidaP);
		System.out.println("Fuerza: "+fuerzaP);
		System.out.println("Defensa: "+defensaP);
		System.out.println("Poder: "+poderP);
		System.out.println("resistencia: "+resistenciaP);
		
		System.out.println("Ahora puedes asignar 12 puntos extra a los");
		System.out.println("atributos que quieras(excepto la vida)");
		System.out.println("Puntos por repartir: " + puntosRepartir);
		while(puntosRepartir>0)
		{
			System.out.println("Que atributo deseas cambiar?");
			
			System.out.println("1. Fuerza : " + fuerzaP);
			System.out.println("2. Defensa: "+defensaP);
			System.out.println("3. Poder: "+poderP);
			System.out.println("4. Resistencia: "+resistenciaP);
			b=sc.nextInt();
			do
			{
				System.out.println("Cuantos puntos deseas asignar:");
			
				aux= sc.nextInt();
				if(aux<0)
					System.out.println("no introduzca valores negativos");
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
				
				resistenciaP= aux;
				break;
			default:
				break;
				
			}
			puntosRepartir-=aux;
			System.out.println("Puntos por repartir: " + puntosRepartir);
			
			
		}
		
		Avatar prot = new Personaje(vidaP, fuerzaP, defensaP, poderP, resistenciaP);
		
		System.out.println("Nombre: "+nombre);
		im.imprimirStats(prot);
		
		Avatar enemigo=null;
		Attack1 at1= new Attack1(claseP);
		Attack2 at2= new Attack2(claseP);
		Defense1 def1= new Defense1(claseP);
		Defense2 def2= new Defense2(claseP);
		Action nextPAction = null;
		Action nextEAction = null;
		
		int randEnemy=0;
		int randWorld=0;
		Random rng= new Random();
		EnemyFactory ef = null;
		EnemyGenerator eg;
		int nextActionAux;
		int nextActionRNG;
		
		Calculator calc=Calculator.getInstance();;
		
		while(!hasLost)
		{
			prot.setVidaActual(vidaP);
			randEnemy=rng.nextInt(5);
			
			randWorld=rng.nextInt(4);
			//switch para decidir aleatoriamente cual sera el siguiente escenario
			switch(randWorld)
			{
			case 0:
				ef = new DesertFact();
				break;
			case 1:
				ef = new OceanFact();
				break;
			case 2:
				ef = new SpaceFact();
				break;
			case 3:
				ef = new WoodsFact();
				break;
			default:
				System.out.println("escenario no encontrado");
				break;
			}
			eg = new EnemyGenerator(ef);
			
			//switch para decidir aleatoriamente de qué clase será el siguiente enemigo
			switch(randEnemy)
			{
			case 0:
				claseE="Asesino";
				eg.createEnemy("Asesino");
				
				enemigo=eg.a;
				break;
			case 1:
				claseE="Bombardero";
				eg.createEnemy("Bombardero");
				
				enemigo=eg.b;
				break;
			case 2:
				claseE="Mago";
				eg.createEnemy("Mago");
				
				enemigo=eg.m;
				break;
			case 3:
				claseE="Tirador";
				eg.createEnemy("Tirador");
				
				enemigo=eg.s;
				break;
			case 4:
				claseE="Guerrero";
				eg.createEnemy("Guerrero");
				
				enemigo=eg.w;
				break;
			default:
				System.out.println("enemigo no encontrado");
				break;
			}
			im.imprimirStats(enemigo);
			enemigo.setVidaActual(enemigo.getVida());
			/////////////////////
			
			Attack1 at1E= new Attack1(claseE);
			Attack2 at2E= new Attack2(claseE);
			Defense1 def1E= new Defense1(claseE);
			Defense2 def2E= new Defense2(claseE);
			
			System.out.println("comienza un nuevo combate!");
			
			
			
			
			
			while(enemigo.getVidaActual()>0 && prot.getVidaActual()>0 )
				{
			System.out.println("que acción desea realizar?");
			System.out.println("1."+ at1.getDescription());
			System.out.println("2."+ at2.getDescription());
			System.out.println("3."+ def1.getDescription());
			System.out.println("4."+ def2.getDescription());
			do
			{
			nextActionAux=sc.nextInt();
			if(nextActionAux<1 || nextActionAux>4)
				System.out.println("accion no valida, vuelva a introducir un numero");
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
			//////////////////////////////////////////////////
			//LA ACCION SE HARA SEGUN LA ESTRATEGIA, ESTO ES TEMPORAL
			
			nextActionRNG=rng.nextInt(4);
			
			switch(nextActionRNG)
			{
			case 0:
				nextEAction=at1E;
				break;
			case 1:
				nextEAction=at2E;
				break;
			case 2:
				nextEAction=def1E;
				break;
			case 3:
				nextEAction=def2E;
				break;
			default:
				break;
			}
			System.out.print(nombre + " ");
			calc.CalculateOutcome(nextPAction, prot, enemigo);
			System.out.println("Vida de tu enemigo: "+ enemigo.getVidaActual());
			System.out.println("Vida de "+ nombre +": "+ prot.getVidaActual());
			System.out.println();
			if(enemigo.getVidaActual()>0 && prot.getVidaActual()>0)
			{
			System.out.print("El enemigo ");
			calc.CalculateOutcome(nextEAction, enemigo, prot);
			System.out.println("Vida de tu enemigo: "+ enemigo.getVidaActual());
			System.out.println("Vida de "+ nombre +": "+ prot.getVidaActual());
			System.out.println();
			}
			/////////////////////////////////////////////////
			/*
			 * aqui va un switch para el siguiente ataque
			 
			 * calculo de daños
			 * 
			 * */
			
			
			
			
			if(prot.getVidaActual()<=0 )
				{
			hasLost=true;
			System.out.println("has perdido miserablemente");
				}
			}
			if(enemigo.getVidaActual()<=0)
				System.out.println("sorprendemente.. ganaste");
		}
		
		
	}

}


