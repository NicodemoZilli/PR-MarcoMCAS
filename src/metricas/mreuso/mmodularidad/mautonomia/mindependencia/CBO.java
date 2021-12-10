package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import main.Contexto;

public class CBO implements IMIndependencia {

	private float CBO;
	private Contexto Ctx;
	
	public CBO(Contexto Ctx) {
		this.Ctx = Ctx;
	}
	
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
