package metricas.mreuso.mflexibilidad;

public class FA implements IMFlexibilidad {

	private float FA;

	public FA() {

	}

	@Override
	public void Calcular() {
		this.FA = 0; // poner formula

	}

	@Override
	public void add(IMFlexibilidad IMF) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");

	}

	@Override
	public void remove(IMFlexibilidad IMF) {}

}
