package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import main.Contexto;

public class RFC implements MUnicaResponsabilidad{
	
	private  Contexto Ctx;
	private float RFC;
	private float NML;
	private float NMR;
	
	public RFC(Contexto Ctx) {
		this.Ctx = Ctx;
		this.NML = Float.parseFloat(this.Ctx.getDato("RFCNML").toString());
		this.NMR = Float.parseFloat(this.Ctx.getDato("RFCNMR").toString());
	}
	@Override
	public void Calcular() {
		this.RFC = this.NML + this.NMR;
		System.out.println("Metrica RFC: " + this.RFC);
		this.Ctx.addResponse("\"RFC\":\""+String.format("%.1f", this.RFC)+"\"");
	}

	@Override
	public void add(MUnicaResponsabilidad IMUR) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(MUnicaResponsabilidad IMUR) {}

}
