package State;

import Personajes.Avatar;

public class Normal implements Estado{
	Avatar avatar;
	public Normal(Avatar avatar)
	{
		this.avatar=avatar;
	}
	public void Burn() {
		System.out.println("Ha causado quemaduras al contrincante! perderá vida cada turno");
		avatar.setEstado(avatar.getQuemado());
		avatar.isNormal=false;
		avatar.isQuemado=true;
		avatar.isDormido=false;
		avatar.isEvasivo=false;
	}

	
	public void Sleep() {
		System.out.println("Ha dormido al contrincante como si fuese un bebé...");
		System.out.println("... y es tan inútil como uno.");
		System.out.println("no podrá combatir hasta que despierte!");
		avatar.setEstado(avatar.getDormido());
		avatar.isNormal=false;
		avatar.isQuemado=false;
		avatar.isDormido=true;
		avatar.isEvasivo=false;
	}

	
	public void Avoid() {
		System.out.println("Ahora tiene un 50% de posibilidades de ");
		System.out.println("no recibir ataques.");
		avatar.setEstado(avatar.getEvasivo());
		avatar.isNormal=false;
		avatar.isQuemado=false;
		avatar.isDormido=false;
		avatar.isEvasivo=true;
	}

	
	public void Perfect() {
		System.out.println("Ya estaba en estado perfecto");
	}

}
