package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

import main.Contexto;

public class PMFP implements IMProteccionEstado{
	
	private Contexto Ctx;
	private float PMFP;
	private float NTC;
	
	public PMFP(Contexto Ctx) {
		this.Ctx = Ctx;
	}
	
	@Override
	public void Calcular() {
		this.PMFP=0;
	}

	@Override
	public void add(IMProteccionEstado IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionEstado IMP) {}

	

}
