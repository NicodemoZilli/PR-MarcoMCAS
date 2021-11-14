package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

import java.util.ArrayList;
import java.util.List;


public class LMetricasMPC implements IMProteccionComportamiento{

	private List<IMProteccionComportamiento> LisMet;

	public LMetricasMPC() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void add(IMProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.add(IMPC);
	}

	@Override
	public void remove(IMProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.remove(IMPC);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMProteccionComportamiento::Calcular);
	}


}
