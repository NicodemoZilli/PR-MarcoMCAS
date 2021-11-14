package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

public class Canales implements IMIndependencia {

	private float Canales;
	
	public Canales() {}
	
	@Override
	public void Calcular() {
		this.Canales=0;
	}

	@Override
	public void add(IMIndependencia IMI) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMIndependencia IMI) {}

}
