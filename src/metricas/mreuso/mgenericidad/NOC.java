package metricas.mreuso.mgenericidad;

import java.util.Map;

public class NOC implements IMGenericidad {

	private float NOC;

	public NOC(Map<String, Object> Ctx) {

	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		System.out.println("Metrica FHIJ: " + this.NOC);
		return "\"NOC\":\""+String.format("%.4f", this.NOC)+"\"";	
	}

}
