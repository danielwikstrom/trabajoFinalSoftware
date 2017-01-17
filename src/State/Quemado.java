package State;

import Personajes.Avatar;

public class Quemado implements Estado{
	Avatar avatar;
	public Quemado(Avatar avatar)
	{
		this.avatar=avatar;
	}
	public void Burn() {
		System.out.println("Ya estaba quemado!");
	}

	
	public void Sleep() {
		System.out.println("Las quemaduras impiden que se duerma, duele demasiado!");
	}

	
	public void Avoid() {
		System.out.println("Estando quemado brilla como una diana, es imposible esquivar ataques");
	}

	
	public void Perfect() {
		System.out.println("Estados Curados!");
		avatar.setEstado(avatar.getNormal());
		avatar.isNormal=true;
		avatar.isQuemado=false;
		avatar.isDormido=false;
		avatar.isEvasivo=false;
	}

}
