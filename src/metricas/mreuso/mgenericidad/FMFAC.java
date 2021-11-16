package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FMFAC implements IMGenericidad {

	private float FMFAC;
	private float FFC;
	private float Tc;

	public FMFAC(Map<String, Object> Ctx) {
		this.FFC = Float.parseFloat(Ctx.get("FMFACFFC").toString());
		this.Tc = Float.parseFloat(Ctx.get("FMFACTc").toString());
	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		this.FMFAC = this.FFC / this.Tc;
		System.out.println("Metrica FMFAC: " + this.FMFAC);
		return "\"FMFAC\":\""+String.format("%.4f", this.FMFAC)+"\"";
	}
}
