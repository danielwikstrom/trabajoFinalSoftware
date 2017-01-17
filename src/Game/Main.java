package Game;

import Factory.*;
import Personajes.*;
import Singleton.Calculator;

import java.util.Scanner;
import Accion.*;
import java.util.Random;
public class Main {
	
	public static void main(String [] args){
		
		FactoryClient factory = new FactoryClient();
		FuncionesJuego game= new FuncionesJuego();
		
		///VARIABLES//////////////
		
		String nombre;
		String claseP=null;
		
		
		
		//booleano que muestra si el jugador ha perdido o no. True indica que ha perdido
		boolean hasLost=false;
		
		Avatar prot=null;
		Avatar enemigo=null;
		
		//estas variables guardaran la siguiente accion a realizar del jugador y el enemigo
		Action nextPAction = null;
		Action nextEAction = null;
		
		
		//inicializamos la factoria de enemigos
		EnemyFactory ef=null;
		EnemyGenerator eg=null;
		//variables auxiliares
		
		
		
		
		//semilla random usada para la elección del mundo y enemigo
		Random rng= new Random();
		
		//estas variables guardarán los valores de las acciones a realizar 
		//del personaje y enemigo, respectivamente
		int nextActionAux;
		int nextActionRNG;
		
		//numero de victorias antes de perder
		int victoryCounter=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		///// INICIO DEL JUEGO/////////////////
		System.out.println("Bienvenido al Fight simlator 3000!");
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		
		System.out.println("Introduzca el nombre de su personaje: ");
		nombre=sc.nextLine();
	
		//creamos al personaje
		prot=game.crearPersonaje();
		
		System.out.println("Nombre: "+nombre);
		game.imprimirStats(prot);
		////
		claseP=prot.getClase();
		Attack1 at1= new Attack1(claseP);
		Attack2 at2= new Attack2(claseP);
		Defense1 def1= new Defense1(claseP);
		Defense2 def2= new Defense2(claseP);
		
		
		
		//inicializamos la instacnia unica del calculador de batalla
		Calculator calc=Calculator.getInstance();;
		
		//bucle del juego
		//mientras el jugador no pierda, se van creando nuevos enemigos aleatorios
		//y se lucha contra ellos
		while(!hasLost)
		{
			
			enemigo=factory.createRandomEnemy(ef,eg);
			
			prot.setVidaActual(prot.getVida());
			
			game.imprimirStats(enemigo);
			enemigo.setVidaActual(enemigo.getVida());
			/////////////////////
			
			Attack1 at1E= new Attack1(enemigo.getClase());
			Attack2 at2E= new Attack2(enemigo.getClase());
			Defense1 def1E= new Defense1(enemigo.getClase());
			Defense2 def2E= new Defense2(enemigo.getClase());
			
			System.out.println("comienza un nuevo combate!");
			
			
			// int para decidir que jugador va antes
			int turno= rng.nextInt(2);
			if(turno==0)
				System.out.println("serás el primero en atacar esta partida");
			else if(turno==1)
				System.out.println("tu enemigo atacará antes esta partida");
			
			//bucle de cada combate, mientras uno de los dos no muera(vida<=0), se turnan 
			// para realizar acciones
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
			
			// accion enemiga///
			nextActionRNG=enemigo.hasStrategy();
			System.out.println("siguiente ataque enemigo: "+ nextActionRNG);
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
			
			if(turno==0)
			{
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
			}
			else if(turno==1)
			{
				
				System.out.print("El enemigo ");
				calc.CalculateOutcome(nextEAction, enemigo, prot);
				System.out.println("Vida de tu enemigo: "+ enemigo.getVidaActual());
				System.out.println("Vida de "+ nombre +": "+ prot.getVidaActual());
				System.out.println();
				if(enemigo.getVidaActual()>0 && prot.getVidaActual()>0)
				{
					System.out.print(nombre + " ");
					calc.CalculateOutcome(nextPAction, prot, enemigo);
					System.out.println("Vida de tu enemigo: "+ enemigo.getVidaActual());
					System.out.println("Vida de "+ nombre +": "+ prot.getVidaActual());
					System.out.println();
				}
			}
			/////////////////////////////////////////////////
			
			
			
			game.aplicarQuemadura(prot, enemigo);
			System.out.println();
			System.out.println("Vida de tu enemigo: "+ enemigo.getVidaActual());
			System.out.println("Vida de "+ nombre +": "+ prot.getVidaActual());
			System.out.println();
			if(prot.getVidaActual()<=0 )
				{
			hasLost=true;
			System.out.println("has perdido miserablemente");
				}
			
			}
			if(enemigo.getVidaActual()<=0)
			{
				System.out.println("sorprendemente.. ganaste");
				victoryCounter++;
				prot.setEstado(prot.getNormal());
			}
		}
		System.out.println("Resultado final: "+ victoryCounter + "victorias");
		
		sc.close();
	}

}


