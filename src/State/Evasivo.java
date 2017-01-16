package State;

import Personajes.Avatar;

public class Evasivo implements Estado{
	Avatar avatar;
	
	public Evasivo(Avatar avatar)
	{
		this.avatar=avatar;
	}
	
	public void Burn() {
		System.out.println("Ha causado quemaduras! ya no podrá esquivar ataques!");
		avatar.setEstado(avatar.getQuemado());
		avatar.isNormal=false;
		avatar.isQuemado=true;
		avatar.isDormido=false;
		avatar.isEvasivo=false;
	}

	
	public void Sleep() {
		System.out.println("ha dormido al contrincante! ya no podrá esquivar ataques!");
		avatar.setEstado(avatar.getDormido());
		avatar.isNormal=false;
		avatar.isQuemado=false;
		avatar.isDormido=true;
		avatar.isEvasivo=false;
	}

	
	public void Avoid() {
		System.out.println("ya estaba en estado evasivo");
		
	}

	
	public void Perfect() {
		System.out.println("Estados Curados!");
		
	}

}
