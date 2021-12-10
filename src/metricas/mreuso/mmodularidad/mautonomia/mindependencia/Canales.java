package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import main.Contexto;

public class Canales implements IMIndependencia {

	private float Canales;
	private Contexto Ctx;
	
	public Canales(Contexto Ctx) {
		this.Ctx = Ctx;
	}
	
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
