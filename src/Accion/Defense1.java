package Accion;

public class Defense1 extends Action{
	public Defense1(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Cubrirse con escudo";
			isAttack=false;
			isCura=false;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Muro de hielo";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Bomba de humo";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Subir Evasion";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Tirador")) 
		{
			description = "Cegar con linterna";
			isAttack=false;
			isCura=false;
		}
		System.out.println();
	}
	
	
}
