package metricas.mreuso.mgenericidad;

import java.util.Map;

public class DIT implements IMGenericidad {

	private float DIT;

	public DIT(Map<String, Object> Ctx) {

	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		System.out.println("Metrica FHIJ: " + this.DIT);
		return "\"DIT\":\""+String.format("%.4f", this.DIT)+"\"";	
	}

}
