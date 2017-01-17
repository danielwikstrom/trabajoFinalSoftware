



public class Evasivo implements Estado{
	ClaseDeEstados clasedeEstados;
	
	public  Evasivo (ClaseDeEstados clasedeestados){
		this.clasedeEstados=clasedeestados;			
	}
	
	
	public void Evitar(){
		
		System.out.println("Ya estas evitandolo todo");		
	}
	public void Quemar(){
		System.out.println("Te han quemado");
		clasedeEstados.setEstado(clasedeEstados.getQuemado());	
	}	
	public void Normalito() {
		System.out.println("Vuelves a estar como al principio.");
		clasedeEstados.setEstado(clasedeEstados.getNormal());
				
	}

	public void Dormirte() {
		
		System.out.println("Te han cegado");		
		clasedeEstados.setEstado(clasedeEstados.getDormido());
		
	}
		
	
	
	
}
