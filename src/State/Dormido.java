package State;

import Personajes.Avatar;

public class Dormido implements Estado{
	Avatar avatar;
	public Dormido(Avatar avatar)
	{
		this.avatar=avatar;
	}
	
	public void Burn() {
		System.out.println("por razones científicas no puede arder mientras duerme");
		
	}

	
	public void Sleep() {
		System.out.println("ya estaba dormido!");
		
	}

	
	public void Avoid() {
		System.out.println("está dormido, no puede esquivar nada...");
		
	}

	
	public void Perfect() {
		System.out.println("Estados curados!");
		avatar.setEstado(avatar.getNormal());
		avatar.isNormal=true;
		avatar.isQuemado=false;
		avatar.isDormido=false;
		avatar.isEvasivo=false;
		
	}

}
