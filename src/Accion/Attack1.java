package Accion;

public class Attack1 extends Action{
	public Attack1(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Ataque con maza";
			damage= 20;
			isForce=true;
			isAttack=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Rayo de luz";
			damage= 30;
			isForce=false;
			isAttack=true;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Granada";
			damage= 35;
			isForce=false;
			isAttack=true;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Ataque Sigiloso";
			damage= 30;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Tirador")) 
		{
			description = "Doble disparo";
			damage= 30;
			isForce=true;
			isAttack=true;

		}
		System.out.println();
	}
	
		
}
