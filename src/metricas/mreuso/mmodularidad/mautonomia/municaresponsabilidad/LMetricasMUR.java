package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import java.util.ArrayList;
import java.util.List;


public class LMetricasMUR implements IMUnicaResponsabilidad {
	
	
private List<IMUnicaResponsabilidad> LisMet;
	
	public LMetricasMUR() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMUnicaResponsabilidad::Calcular);
	}

	@Override
	public void add(IMUnicaResponsabilidad IMUR) {
		assert IMUR != null;
		this.LisMet.add(IMUR);
	}

	@Override
	public void remove(IMUnicaResponsabilidad IMUR) {
		assert IMUR != null;
		this.LisMet.remove(IMUR);
	}
}
