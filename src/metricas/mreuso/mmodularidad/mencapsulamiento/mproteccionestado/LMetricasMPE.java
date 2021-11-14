package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

import java.util.ArrayList;
import java.util.List;

public class LMetricasMPE implements IMProteccionEstado{
	
	private List<IMProteccionEstado> LisMet;

	public LMetricasMPE() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void add(IMProteccionEstado IMPE) {
		assert IMPE != null;
		this.LisMet.add(IMPE);
	}

	@Override
	public void remove(IMProteccionEstado IMPE) {
		assert IMPE != null;
		this.LisMet.remove(IMPE);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMProteccionEstado::Calcular);
	}

}
