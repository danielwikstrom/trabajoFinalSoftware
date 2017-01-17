package Strategy;

import java.util.Random;

public class Defensivo implements Strategy{
	public Defensivo()
	{
		System.out.println("Enemigo creado con estrategia Defensiva!");
	}
	public int nextAttack() {
		//si la estrategia es defensiva, tiene un 33% de realizar acciones agresivos,
		//y un 66% de realizar acciones defensivas
		Random rng = new Random();
		int nextAt=rng.nextInt(6);
		if(nextAt==0 || nextAt==1)
			return nextAt;
		else if(nextAt==2 || nextAt==3)
				return 2;
		else 
			return 3;
		
		
		
	}
	
}
