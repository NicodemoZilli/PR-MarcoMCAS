package metricas.mreuso.mgenericidad;

public class FMFAC implements IMGenericidad {

	private float FMFAC;
	private float FFC; // pedir
	private int Tc; // pedir

	public FMFAC(Object Ctx) {
		// this.FFC = Ctx.getFFC();
		// this.Tc = Ctx.Tc();
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
	public void Calcular() {
		this.FMFAC = this.FFC / this.Tc;
		System.out.println("Metrica FMFAC: " + this.FMFAC);
	}
}
