package metricas.mreuso.mgenericidad;

import java.util.Map;

public class FHI implements IMGenericidad {

	// Atributos para metrica Factor de Herencia de implementacion FHI
	private float FHI;
	private float Mv; // pedir
	private float Mnv; // pedir
	private float Tm; // pedir

	public FHI( Map<String, Object> Ctx) {
		this.Mv = Float.parseFloat((String) Ctx.get("Mv"));
		this.Mnv = Float.parseFloat((String) Ctx.get("Mnv"));
		this.Tm = Float.parseFloat((String) Ctx.get("Tm"));
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
	public String Calcular() {
	
		this.FHI = (this.Mv + this.Mnv)/this.Tm;
		System.out.println("Metrica FHI: " + this.FHI);
		return "\"FHI\":\""+String.format("%.4f", this.FHI)+"\"";
	}

}
