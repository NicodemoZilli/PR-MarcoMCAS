package metricas.mreuso.mmodularidad.mlegibilidad;

public class LOC implements IMLegibilidad{
	
	private float LOC;
	
	public LOC() {}

	@Override
	public void Calcular() {
		this.LOC=0;
	}

	@Override
	public void add(IMLegibilidad IML) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMLegibilidad IML) {}

}
