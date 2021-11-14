package metricas.mreuso.mgenericidad;

public class FFC implements IMGenericidad {

	private float FFC;
	private int NOP; // pedir
	private int Tm; // pedir

	public FFC(Object Ctx) {
		// thisNOP = Ctx.getNOP();
		// this.Tm = Ctx.getTm();
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
		this.FFC = this.NOP / this.Tm;
		System.out.println("Metrica FFC: " + this.FFC);
	}

}
