



public class Normal implements Estado{
ClaseDeEstados clasedeEstados;
	
	public Normal (ClaseDeEstados clasedeestados){
		this.clasedeEstados=clasedeestados;		
	}
	
	public void Dormirte(){
		System.out.println("Te han dormido");	
		clasedeEstados.setEstado(clasedeEstados.getDormido());
	}
	
	public void Evitar(){
		System.out.println("Ahora eres mas Agil");
		clasedeEstados.setEstado(clasedeEstados.getEvasivo());
	}
	public void Quemar(){
		System.out.println("Estas herido");
		clasedeEstados.setEstado(clasedeEstados.getQuemado());
	}
	
	
	public void  Normalito(){
		System.out.println("Ya estás normal, no cambias");	
		
	}
	
	
	
	
	
}
