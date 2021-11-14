package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import java.util.ArrayList;
import java.util.List;


public class LMetricasMI implements IMIndependencia{
	
	private List<IMIndependencia> LisMet;
	
	public LMetricasMI() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMIndependencia::Calcular);
	}

	@Override
	public void add(IMIndependencia IMI) {
		assert IMI != null;
		this.LisMet.add(IMI);
	}

	@Override
	public void remove(IMIndependencia IMI) {
		assert IMI != null;
		this.LisMet.remove(IMI);
	}


}
