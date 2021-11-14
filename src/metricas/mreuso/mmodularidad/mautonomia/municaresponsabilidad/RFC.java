package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

public class RFC implements IMUnicaResponsabilidad{
	
	private float RFC;
	
	public RFC() {}

	@Override
	public void Calcular() {
		this.RFC=0;
	}

	@Override
	public void add(IMUnicaResponsabilidad IMUR) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMUnicaResponsabilidad IMUR) {}

}
