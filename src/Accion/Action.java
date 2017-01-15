package Accion;

public abstract class Action {
	String description;
	int damage;
	
	// este booleano sirve para saber si la accion a realizar
	//incrementa con fuerza o con poder
	boolean isForce;
	
	//boolean que indica si una accion es de tipo ataque o defensa
	boolean isAttack;
	
	//si el ataque es defensivo puede ser de tipo curativo o no
	boolean isCura;
	public String getDescription()
	{
		return description;
	}
	public int getDamage()
	{
		return damage;
	}
	public void setDamage(int damage)
	{
		this.damage=damage;
	}
	public boolean getForce()
	{
		return isForce;
	}
	public boolean getIsAttack()
	{
		return isAttack;
	}
	public boolean getIsCura()
	{
		return isCura;
	}
}
