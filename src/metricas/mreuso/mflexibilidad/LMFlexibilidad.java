package metricas.mreuso.mflexibilidad;

import java.util.List;

public class LMFlexibilidad implements IMFlexibilidad {

	private List<IMFlexibilidad> LisMet;

	public LMFlexibilidad() {
		this.LisMet = null;
	}

	@Override
	public void add(IMFlexibilidad IMF) {
		assert IMF != null;
		this.LisMet.add(IMF);
	}

	@Override
	public void remove(IMFlexibilidad IMF) {
		assert IMF != null;
		this.LisMet.remove(IMF);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMFlexibilidad::Calcular);
	}

}
