package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import java.util.ArrayList;
import java.util.List;

import main.Contexto;



public class LMetricasMI implements IMIndependencia{
	
	private List<IMIndependencia> LisMet;
	private Contexto Ctx;
	
	public LMetricasMI(Contexto Ctx) {
		this.LisMet = new ArrayList<IMIndependencia>();
		this.Ctx = Ctx;
		
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "Canales": this.add(new Canales(this.Ctx)); break;	
				case "CBO": this.add(new CBO(this.Ctx)); break;	
				
			}
	 	}
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
