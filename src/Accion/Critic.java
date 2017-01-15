package Accion;

public class Critic extends CriticDecorator{
	//si el ataque es critico el daño será el doble
	Action action;
	public Critic(Action action)
	{
		this.action=action;
		
	}
	
	public String getDescription() {
		return action.getDescription() + ".... e hizo critico! ha hecho mas danio";
	}

	@Override
	public int getDamage() {

		return action.getDamage()+65;
	}

	
	
	
	

}
