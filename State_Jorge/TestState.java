



public class TestState {


	public static void main(String[] args){
		ClaseDeEstados clasedeEstados = new ClaseDeEstados();
		Estado estado=clasedeEstados.Normal;
		System.out.println("Estados del juego");
		
		clasedeEstados.setEstado(estado);
		
		clasedeEstados.Normalito();
		clasedeEstados.Dormirte();
		clasedeEstados.Evitar();
		
		
	} 
	
	
}
