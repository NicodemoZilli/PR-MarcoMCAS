package metricas.mreuso.mflexibilidad;

/**
 * @author David Nicodemo Zilli Vazquez
 * @version 1.0
 * @created Oct Dic 2021
 */

import java.util.ArrayList;
import java.util.List;

import main.Contexto;

public class LMetricasMF implements MFlexibilidad {

	private List<MFlexibilidad> LisMet;
	private Contexto Ctx;

	public LMetricasMF(Contexto Ctx) {
		this.LisMet = new ArrayList<MFlexibilidad>();
		this.Ctx = Ctx;
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "FA": this.add(new FA(this.Ctx));	break;
				case "FP": this.add(new FP(this.Ctx));  break;
			}
	 	}
	}
	
	@Override
	public void add(MFlexibilidad IMF) {
		assert IMF != null;
		this.LisMet.add(IMF);
	}

	@Override
	public void remove(MFlexibilidad IMF) {
		assert IMF != null;
		this.LisMet.remove(IMF);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MFlexibilidad::Calcular);
	}

}
