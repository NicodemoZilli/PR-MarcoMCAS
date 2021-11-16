package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FHI implements IMGenericidad {

	private float FHI;
	private float Mv;
	private float Mnv;
	private float Tm; 

	public FHI( Map<String, Object> Ctx) {
		this.Mv = Float.parseFloat(Ctx.get("FHIMv").toString());
		this.Mnv = Float.parseFloat(Ctx.get("FHIMnv").toString());
		this.Tm = Float.parseFloat(Ctx.get("FHITm").toString());
	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");
	}

	@Override
	public void remove(IMGenericidad IMG) {}

	@Override
	public String Calcular() {
		this.FHI = (this.Mv + this.Mnv)/this.Tm;
		System.out.println("Metrica FHI: " + this.FHI);
		return "\"FHI\":\""+String.format("%.4f", this.FHI)+"\"";
	}

}
