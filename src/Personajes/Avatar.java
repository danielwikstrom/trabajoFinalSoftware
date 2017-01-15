package Personajes;

public abstract class Avatar {
	public int vida;
	public int fuerza;
	public int poder;
	public int defensa;
	public int resistencia;
	public int vidaActual=vida;
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
}
