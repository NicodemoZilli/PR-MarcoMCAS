package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;


public class TPM implements IMProteccionComportamiento{
	
	private float TPM;
	
	public TPM() {}

	@Override
	public void Calcular() {
		this.TPM=0;
	}

	@Override
	public void add(IMProteccionComportamiento IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionComportamiento IMP) {}

}
