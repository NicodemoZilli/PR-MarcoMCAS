package metricas.mreuso.mmodularidad.mlegibilidad;

public class WMC implements MLegibilidad{
	
	private float WMC;
	
	public WMC() {}

	@Override
	public void Calcular() {
		this.WMC=0;
	}

	@Override
	public void add(MLegibilidad IML) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(MLegibilidad IML) {}

}
