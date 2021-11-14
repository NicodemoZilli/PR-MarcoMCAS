package metricas.mreuso.mgenericidad;

public class NOC implements IMGenericidad {

	private float NOC;

	public NOC(Object Ctx) {

	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {
		// No hacer nada
	}

	@Override
	public void Calcular() {
		// Esperar formula
	}

}
