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
		int vidaP=0;
		int fuerzaP=0;
		int poderP=0;
		int resistenciaP=0;
		int defensaP=0;
		String nombre;
		String claseP=null;
		
		//puntos que se pueden repartir durante la creación del personaje
		int puntosRepartir=12;
		
		//booleano que muestra si el jugador ha perdido o no. True indica que ha perdido
		boolean hasLost=false;
		
		//variables auxiliares
		int a;
		int b;
		int aux=0;
		
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
	///////// Fase Creacion de personaje////////
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
			do{
			b=sc.nextInt();
			if(b<1 || b>4)
				System.out.println("valor no válido, vuelva a introducir un valor(1-4)");
			}while(b<1 || b>4);
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
		
		Avatar prot = new Personaje(vidaP, fuerzaP, defensaP, poderP, resistenciaP,claseP);
		
		System.out.println("Nombre: "+nombre);
		game.imprimirStats(prot);
		////
		Attack1 at1= new Attack1(claseP);
		Attack2 at2= new Attack2(claseP);
		Defense1 def1= new Defense1(claseP);
		Defense2 def2= new Defense2(claseP);
		
		//// Final fase creacion de personaje
		Avatar enemigo=null;
		Action nextPAction = null;
		Action nextEAction = null;
		
		
		//inicializamos la factoria de enemigos
		EnemyFactory ef=null;
		EnemyGenerator eg=null;
		
		
		//inicializamos la instacnia unica del calculador de batalla
		Calculator calc=Calculator.getInstance();;
		
		//bucle del juego
		//mientras el jugador no pierda, se van creando nuevos enemigos aleatorios
		//y se lucha contra ellos
		while(!hasLost)
		{
			
			enemigo=factory.createRandomEnemy(ef,eg);
			prot.setVidaActual(vidaP);
			
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
		
		
	}

}


