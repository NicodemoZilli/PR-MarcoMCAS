package metricas.mreuso.mmodularidad.mlegibilidad;

import java.util.ArrayList;
import java.util.List;


public class LMetricasML implements IMLegibilidad{
	
	
	private List<IMLegibilidad> LisMet;

	public LMetricasML() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void add(IMLegibilidad IML) {
		assert IML != null;
		this.LisMet.add(IML);
	}

	@Override
	public void remove(IMLegibilidad IML) {
		assert IML != null;
		this.LisMet.remove(IML);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMLegibilidad::Calcular);
	}

}
