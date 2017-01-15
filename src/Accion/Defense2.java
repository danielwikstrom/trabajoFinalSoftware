package Accion;

public class Defense2 extends Action{
	public Defense2(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Tomar poción";
			isAttack=false;
			isCura=true;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Fuente de la vida";
			isAttack=false;
			isCura=true;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Bocata de tortilla";
			isAttack=false;
			isCura=true;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Vacuna";
			isAttack=false;
			isCura=false;
			
		}
		if (clase.equals("Tirador")) 
		{
			description = "Pizza estilo Chicago";
			isAttack=false;
			isCura=true;
		}
		System.out.println();
	}
	
}
