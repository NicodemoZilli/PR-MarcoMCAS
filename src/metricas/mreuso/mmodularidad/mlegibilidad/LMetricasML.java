package metricas.mreuso.mmodularidad.mlegibilidad;

import java.util.ArrayList;
import java.util.List;


public class LMetricasML implements MLegibilidad{
	
	
	private List<MLegibilidad> LisMet;

	public LMetricasML() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void add(MLegibilidad IML) {
		assert IML != null;
		this.LisMet.add(IML);
	}

	@Override
	public void remove(MLegibilidad IML) {
		assert IML != null;
		this.LisMet.remove(IML);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MLegibilidad::Calcular);
	}

}
