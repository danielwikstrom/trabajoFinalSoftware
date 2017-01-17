



public class Dormido implements Estado{
	ClaseDeEstados clasedeEstados;
	
	public Dormido (ClaseDeEstados clasedeestados){
		this.clasedeEstados=clasedeestados;		
	}
	
	
	public void Evitar(){
		System.out.println("Ahora eres mas Agil");
		clasedeEstados.setEstado(clasedeEstados.getEvasivo());
	}
	public void Quemar(){
		System.out.println("Estas Quemado");
		clasedeEstados.setEstado(clasedeEstados.getQuemado());
	}
	

	
	public void Normalito() {
		System.out.println("Vuelves a estar como al principio.");
		clasedeEstados.setEstado(clasedeEstados.getNormal());
		
	}

	public void Dormirte() {
		
		System.out.println("Ya estás durmiendo");
	}


	
	
	
	
}
