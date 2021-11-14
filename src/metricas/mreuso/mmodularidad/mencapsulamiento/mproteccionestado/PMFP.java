package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

public class PMFP implements IMProteccionEstado{
	
	
	private float PMFP;
	
	public PMFP() {}
	
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
