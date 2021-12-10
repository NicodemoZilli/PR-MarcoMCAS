package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

import main.Contexto;

public class PM implements IMProteccionComportamiento{
	
	private Contexto Ctx;
	private float PM;
	private float FNP;
	private float TF;
	
	public PM(Contexto Ctx) {
		this.Ctx = Ctx;
		this.FNP = Float.parseFloat(this.Ctx.getDato("PMFNP").toString());
		this.TF = Float.parseFloat(this.Ctx.getDato("PMTF").toString());
	}

	@Override
	public void Calcular() {
		this.PM = this.FNP / this.TF;
		System.out.println("Metrica PM: " + this.PM);
		this.Ctx.addResponse("\"PM\":\""+String.format("%.4f", this.PM)+"\"");
	}

	@Override
	public void add(IMProteccionComportamiento IMP) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(IMProteccionComportamiento IMP) {}

}