package metricas.mreuso.mflexibilidad;

public class FP implements IMFlexibilidad {

	private float FP;

	public FP() {

	}

	@Override
	public void Calcular() {
		this.FP = 0; // poner formula

	}

	@Override
	public void add(IMFlexibilidad IMF) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");

	}

	@Override
	public void remove(IMFlexibilidad IMF) {}

}
