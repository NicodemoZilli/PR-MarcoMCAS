package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FHIAC implements IMGenericidad {

	private float FHIAC;
	private float FHIJ;
	private float NOH;

	public FHIAC(Map<String, Object> Ctx) {
		this.FHIJ = Float.parseFloat(Ctx.get("FHIACFHIJ").toString());
		this.NOH = Float.parseFloat(Ctx.get("FHIACNOH").toString());
	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		this.FHIAC = this.FHIJ / this.NOH;
		System.out.println("Metrica FHIAC: " + this.FHIAC);
		return "\"FHIAC\":\""+String.format("%.4f", this.FHIAC)+"\"";
	}
}
