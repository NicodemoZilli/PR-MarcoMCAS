package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

public class PMFF implements IMProteccionEstado{
	
	
	private float PMFF;
	
	public PMFF() {}
	
	@Override
	public void Calcular() {
		this.PMFF=0;
	}

	@Override
	public void add(IMProteccionEstado IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionEstado IMP) {}

	

}
