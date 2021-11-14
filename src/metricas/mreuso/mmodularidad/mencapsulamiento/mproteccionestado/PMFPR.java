package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

public class PMFPR implements IMProteccionEstado{
	
	
	private float PMFPR;
	
	public PMFPR() {}
	
	@Override
	public void Calcular() {
		this.PMFPR=0;
	}

	@Override
	public void add(IMProteccionEstado IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionEstado IMP) {}

	

}
