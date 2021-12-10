package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

public class LCOM implements MUnicaResponsabilidad{
	
	private float LCOM;
	
	public LCOM() {}

	@Override
	public void Calcular() {
		this.LCOM=0;
	}

	@Override
	public void add(MUnicaResponsabilidad IMUR) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(MUnicaResponsabilidad IMUR) {}

}
