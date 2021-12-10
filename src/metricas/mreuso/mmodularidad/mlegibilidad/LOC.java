package metricas.mreuso.mmodularidad.mlegibilidad;

public class LOC implements MLegibilidad{
	
	private float LOC;
	
	public LOC() {}

	@Override
	public void Calcular() {
		this.LOC=0;
	}

	@Override
	public void add(MLegibilidad IML) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(MLegibilidad IML) {}

}
