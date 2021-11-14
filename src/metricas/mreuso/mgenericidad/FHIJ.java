package metricas.mreuso.mgenericidad;

public class FHIJ implements IMGenericidad {

	private float FHIJ;
	private float FHI; // pedir
	private int Tc; // pedir

	public FHIJ(Object Ctx) {

		// this.FHI = Ctx.getMv();
		// this.Tc = Ctx.getMv();

	}

	@Override
	public void add(IMGenericidad IMG) {
		throw new UnsupportedOperationException("Operacion no Soportada en DIT add");
	}

	@Override
	public void remove(IMGenericidad IMG) {
		// No hacer nada
	}

	@Override
	public void Calcular() {
		// DUDA SI LLAMAR A FHI EN UN NUEVO OBJETO O PEDIR EL VALOR DADO
		this.FHIJ = this.FHI / (this.Tc - 1);
		System.out.println("Metrica FHIJ: " + this.FHIJ);
	}

}
