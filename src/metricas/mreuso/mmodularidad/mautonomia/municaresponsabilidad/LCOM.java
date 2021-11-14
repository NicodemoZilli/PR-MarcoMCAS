package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

public class LCOM implements IMUnicaResponsabilidad{
	
	private float LCOM;
	
	public LCOM() {}

	@Override
	public void Calcular() {
		this.LCOM=0;
	}

	@Override
	public void add(IMUnicaResponsabilidad IMUR) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMUnicaResponsabilidad IMUR) {}

}
