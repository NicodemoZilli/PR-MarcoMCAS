package metricas.mreuso.mmodularidad.mlegibilidad;

public class CC implements MLegibilidad{
	
	private float CC;
	
	public CC() {}

	@Override
	public void Calcular() {
		this.CC=0;
	}

	@Override
	public void add(MLegibilidad IML) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(MLegibilidad IML) {}

}
