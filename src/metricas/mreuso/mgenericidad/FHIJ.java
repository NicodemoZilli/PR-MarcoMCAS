package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FHIJ implements IMGenericidad {

	private float FHIJ;
	private float FHI;
	private float Tc;

	public FHIJ(Map<String, Object> Ctx) {
		this.FHI = Float.parseFloat(Ctx.get("FHIJFHI").toString());
		this.Tc = Float.parseFloat(Ctx.get("FHIJTc").toString());
	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en DIT add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		this.FHIJ = this.FHI / (this.Tc - 1);
		System.out.println("Metrica FHIJ: " + this.FHIJ);
		return "\"FHIJ\":\""+String.format("%.4f", this.FHIJ)+"\"";
	}

}
