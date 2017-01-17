package Strategy;

import java.util.Random;

public class Agresivo extends Strategy{
	public Agresivo()
	{
		System.out.println("Enemigo creado con estrategia agresiva!");
	}
	public int nextAttack() {
		//si la estrategia es agresiva solo realizara ataques agresivos
		// con un 50% de realizar uno u otro
		
		
		Random rng = new Random();
		int nextAt=rng.nextInt(2);
		
		return nextAt;
	}
}
