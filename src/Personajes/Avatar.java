package Personajes;

import State.Estado;

public abstract class Avatar {
	//estadísticas de todos los personajes
	public int vida;
	public int fuerza;
	public int poder;
	public int defensa;
	public int resistencia;
	public int vidaActual=vida;
	public String clase;
	
	
	public Estado state;
	public Estado dormido;
	public Estado quemado;
	public Estado evasivo;
	public Estado normal;
	
	public boolean isNormal;
	public boolean isQuemado;
	public boolean isDormido;
	public boolean isEvasivo;
	
	public  int getVida() {
		return vida;
	}
	public  int getVidaActual() {
		return vidaActual;
	}
	public  void setVidaActual(int vidaActual) {
		this.vidaActual= vidaActual;
	}
	public   int getFuerza() {
		return fuerza;
	}
	public  int getPoder() {
		return poder;
	}
	public  int getDefensa() {
		return defensa;
	}
	public  int getResistencia() {
		return resistencia;
	}
	public String getClase()
	{
		return clase;
	};
	
	//funciones para los distintos estados por los que puede pasar un avatar
	public void setEstado(Estado state)
	{
		this.state=state;
	}
	public Estado getQuemado()
	{
		return quemado;
	}
	public Estado getNormal()
	{
		return normal;
	}
	public Estado getEvasivo()
	{
		return evasivo;
	}
	public Estado getDormido()
	{
		return dormido;
	}
	
	public void Quemar()
	{
		state.Burn();
	}
	public void Normal()
	{
		state.Perfect();
	}
	public void Evadir()
	{
		state.Avoid();
	}
	public void Dormir()
	{
		state.Sleep();
	}
}
