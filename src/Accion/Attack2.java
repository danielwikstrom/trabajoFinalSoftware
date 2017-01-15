package Accion;

public class Attack2 extends Action{
	public Attack2(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Placaje con escudo";
			damage= 10;
			isForce=true;
			isAttack=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Hypnosis";
			damage= 20;
			isForce=false;
			isAttack=true;

		}
		if (clase.equals("Bombardero")) 
		{
			description = "LanzaMisiles";
			damage= 25;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Asesino")) 
		{
			description = "Lanzar cuchillo";
			damage= 35;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Tirador")) 
		{
			description = "Flecha explosiva";
			damage= 25;
			isForce=false;
			isAttack=true;

		}
		System.out.println();
	}
	
}

