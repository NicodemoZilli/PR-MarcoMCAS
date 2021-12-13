package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import main.Contexto;

public class RFC implements MUnicaResponsabilidad{
	
	private  Contexto Ctx;
	private float RFC;
	private float n;
	private float m;
	
	public RFC(Contexto Ctx) {
		this.Ctx = Ctx;
		this.n = Float.parseFloat(this.Ctx.getDato("RFCn").toString());
		this.m = Float.parseFloat(this.Ctx.getDato("RFCm").toString());
	}
	@Override
	public void Calcular() {
		this.RFC = this.n / this.m;
		System.out.println("Metrica RFC: " + this.RFC);
		this.Ctx.addResponse("\"RFC\":\""+String.format("%.4f", this.RFC)+"\"");
	}

	@Override
	public void add(MUnicaResponsabilidad IMUR) {
		throw new UnsupportedOperationException("Operacion no Soportada en add");		
	}

	@Override
	public void remove(MUnicaResponsabilidad IMUR) {}

}
