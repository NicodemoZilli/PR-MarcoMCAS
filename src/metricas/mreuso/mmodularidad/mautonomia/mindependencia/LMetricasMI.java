package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

/**
 * @author David Nicodemo Zilli Vazquez
 * @version 1.0
 * @created Oct Dic 2021
 */

import java.util.ArrayList;
import java.util.List;

import main.Contexto;

public class LMetricasMI implements MIndependencia{
	
	private List<MIndependencia> LisMet;
	private Contexto Ctx;
	
	public LMetricasMI(Contexto Ctx) {
		this.LisMet = new ArrayList<MIndependencia>();
		this.Ctx = Ctx;
		
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "Canales": this.add(new Canales(this.Ctx)); break;	
				case "COF": this.add(new COF(this.Ctx)); break;	
			}
	 	}
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MIndependencia::Calcular);
	}

	@Override
	public void add(MIndependencia IMI) {
		assert IMI != null;
		this.LisMet.add(IMI);
	}

	@Override
	public void remove(MIndependencia IMI) {
		assert IMI != null;
		this.LisMet.remove(IMI);
	}


}
