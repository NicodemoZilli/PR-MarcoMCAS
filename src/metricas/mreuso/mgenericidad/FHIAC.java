package metricas.mreuso.mgenericidad;

public class FHIAC implements IMGenericidad {

	// Atributos para metrica Factor de Herencia de implementacion FHI
	private float FHIAC;
	private float FHIJ; // pedir
	private int NOH; // pedir

	public FHIAC(Object Ctx) {
		// this.FHIJ = Ctx.getFHIJ();
		// this.NOH = Ctx.NOH();
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
		this.FHIAC = this.FHIJ / this.NOH;
		System.out.println("Metrica FHIAC: " + this.FHIAC);
	}
}
