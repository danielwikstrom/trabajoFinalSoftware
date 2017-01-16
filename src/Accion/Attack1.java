package Accion;

public class Attack1 extends Action{
	public Attack1(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Ataque con maza";
			stateChange="none";
			damage= 25;
			isForce=true;
			isAttack=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Rayo de luz";
			stateChange="Burn";
			damage= 30;
			isForce=false;
			isAttack=true;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Granada";
			stateChange="none";
			damage= 30;
			isForce=false;
			isAttack=true;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Ataque Sigiloso";
			stateChange="none";
			damage= 35;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Tirador")) 
		{
			description = "Doble disparo";
			damage= 30;
			stateChange="none";
			isForce=true;
			isAttack=true;

		}
		System.out.println();
	}
	
		
}
