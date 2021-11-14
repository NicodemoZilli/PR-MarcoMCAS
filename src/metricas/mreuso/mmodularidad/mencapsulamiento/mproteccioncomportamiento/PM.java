package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;


public class PM implements IMProteccionComportamiento{
	
	private float PM;
	
	public PM() {}

	@Override
	public void Calcular() {
		this.PM=0;
	}

	@Override
	public void add(IMProteccionComportamiento IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionComportamiento IMP) {}

}
