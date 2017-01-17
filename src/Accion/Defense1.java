package Accion;

public class Defense1 extends Action{
	public Defense1(String clase){
		if (clase.equals("Guerrero")) 
		{
			description = "Cubrirse con escudo";
			stateChange="Avoid";
			isAttack=false;
			isCura=false;
		}
		
		if (clase.equals("Mago")) 
		{
			description = "Muro de Hielo";
			stateChange="Avoid";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Bombardero")) 
		{
			description = "Bomba de Humo";
			stateChange="Avoid";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Asesino")) 
		{
			description = "Subir Evasion";
			stateChange="Avoid";
			isAttack=false;
			isCura=false;
		}
		if (clase.equals("Tirador")) 
		{
			description = "Cegar con Linterna";
			stateChange="Avoid";
			isAttack=false;
			isCura=false;
		}
		System.out.println();
	}
	
	
}
