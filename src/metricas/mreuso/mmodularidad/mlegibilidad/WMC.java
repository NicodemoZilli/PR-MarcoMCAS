package metricas.mreuso.mmodularidad.mlegibilidad;

public class WMC implements IMLegibilidad{
	
	private float WMC;
	
	public WMC() {}

	@Override
	public void Calcular() {
		this.WMC=0;
	}

	@Override
	public void add(IMLegibilidad IML) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMLegibilidad IML) {}

}
