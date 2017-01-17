package Strategy;

public abstract class Strategy {
	
	//el paquete Strategy junta los patrones estrategia y template
	// cada subclase de la clase Strategy sobreescribe la funcion nextAttack
	// dependiendo de la estrategia que sea
	public int nextAttack()
	{
		return 0;
	}
}
