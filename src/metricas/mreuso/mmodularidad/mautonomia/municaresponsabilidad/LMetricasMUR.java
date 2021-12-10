package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import java.util.ArrayList;
import java.util.List;

import main.Contexto;


public class LMetricasMUR implements MUnicaResponsabilidad {
	
	private Contexto Ctx;
	private List<MUnicaResponsabilidad> LisMet;
	
	public LMetricasMUR(Contexto Ctx) {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MUnicaResponsabilidad::Calcular);
	}

	@Override
	public void add(MUnicaResponsabilidad IMUR) {
		assert IMUR != null;
		this.LisMet.add(IMUR);
	}

	@Override
	public void remove(MUnicaResponsabilidad IMUR) {
		assert IMUR != null;
		this.LisMet.remove(IMUR);
	}
}
