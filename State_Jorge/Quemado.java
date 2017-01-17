



public class Quemado implements Estado{
	ClaseDeEstados clasedeEstados;
	
	public Quemado (ClaseDeEstados clasedeestados){
		this.clasedeEstados=clasedeestados;			
	}
	
	public void Dormirte(){
		System.out.println("Te han dormido");
		
		clasedeEstados.setEstado(clasedeEstados.getDormido());
	}
	public void Evitar(){
		System.out.println("Ahora eres mas Ágil");
		clasedeEstados.setEstado(clasedeEstados.getEvasivo());
	}
	public void Quemar(){
		System.out.println("Ya estas ardiendo");			
	}
	
	public void Normalito() {
		System.out.println("Vuelves a estar como al principio.");
		clasedeEstados.setEstado(clasedeEstados.getNormal());
		
		
	}

	
}
