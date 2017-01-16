package Accion;

public class Defense2 extends Action{
	public Defense2(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Tomar poción";
			stateChange="none";
			isAttack=false;
			isCura=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Fuente de la vida";
			stateChange="none";
			isAttack=false;
			isCura=true;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Bocata de tortilla";
			stateChange="none";
			isAttack=false;
			isCura=true;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Vacuna";
			stateChange="Normal";
			isAttack=false;
			isCura=false;
			
		}
		if (clase.equals("Tirador")) 
		{
			description = "Pizza estilo Chicago";
			stateChange="none";
			isAttack=false;
			isCura=true;
		}
		System.out.println();
	}
	
}
