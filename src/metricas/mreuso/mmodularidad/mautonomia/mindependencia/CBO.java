package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

public class CBO implements IMIndependencia {

	private float CBO;
	
	public CBO() {}
	
	@Override
	public void Calcular() {
		this.CBO=0;
	}

	@Override
	public void add(IMIndependencia IMI) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMIndependencia IMI) {}

}
