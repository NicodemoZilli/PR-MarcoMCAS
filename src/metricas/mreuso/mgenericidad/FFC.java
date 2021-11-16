package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FFC implements IMGenericidad {

	private float FFC;
	private float NOP;
	private float Tm;

	public FFC(Map<String, Object> Ctx) {
		this.NOP = Float.parseFloat(Ctx.get("FFCNOP").toString());
		this.Tm = Float.parseFloat(Ctx.get("FFCTm").toString());
	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		this.FFC = this.NOP / this.Tm;
		System.out.println("Metrica FFC: " + this.FFC);
		return "\"FFC\":\""+String.format("%.4f", this.FFC)+"\"";
	}

}
