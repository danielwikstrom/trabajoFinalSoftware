package Accion;

public class Attack2 extends Action{
	public Attack2(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Placaje con escudo";
			stateChange="none";
			damage= 10;
			isForce=true;
			isAttack=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Hypnosis";
			stateChange="Sleep";
			damage= 20;
			isForce=false;
			isAttack=true;

		}
		if (clase.equals("Bombardero")) 
		{
			description = "LanzaMisiles";
			stateChange="Burn";
			damage= 25;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Asesino")) 
		{
			description = "Cuchillo impregnado en cloroformo";
			stateChange="Sleep";
			damage= 30;
			isForce=true;
			isAttack=true;

		}
		if (clase.equals("Tirador")) 
		{
			description = "Flecha explosiva";
			damage= 25;
			stateChange="Burn";
			isForce=false;
			isAttack=true;

		}
		System.out.println();
	}
	
}

