



public class ClaseDeEstados {
	Estado Dormido;
	Estado Evasivo;
	Estado Quemado;
		
	Estado Normal;
	
	Estado estado;
	
	public ClaseDeEstados(){
		Dormido = new Dormido(this);
		Evasivo = new Evasivo(this);
		Quemado = new Quemado(this);		
		Normal =new Normal(this);
		
	}	
	
	public void Dormirte(){
		estado.Dormirte();		
	
	}
	public void Evitar(){
		estado.Evitar();
	}
	public void Quemar(){
		estado.Quemar();		
	}

	public void Normalito(){
		estado.Normalito();		
	}
	void setEstado(Estado estado){
		this.estado=estado;		
	}
		
	public Estado getEstado(){
		return estado;
	}
		
	public Estado getDormido(){
		return Dormido;
	}
	
	public Estado getEvasivo(){
		return Evasivo;
	}

	public Estado getQuemado(){
		return Quemado;
	
	}
	public Estado getNormal() {		
		return Normal;
	}
}
