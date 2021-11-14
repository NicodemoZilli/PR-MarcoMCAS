package metricas.mreuso.mgenericidad;

public class DIT implements IMGenericidad {

	private float DIT;

	public DIT(Object Ctx) {

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
