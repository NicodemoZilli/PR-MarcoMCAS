package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

import java.util.ArrayList;
import java.util.List;

import main.Contexto;


public class LMetricasMPE implements IMProteccionEstado{
	
	private Contexto Ctx;
	private List<IMProteccionEstado> LisMet;

	public LMetricasMPE(Contexto Ctx) {
		this.Ctx = Ctx;
		this.LisMet = new ArrayList<IMProteccionEstado>();
		
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "PMFP": this.add(new PMFP(this.Ctx)); break;
				//case "PMFPR": this.add(new PMFPR(this.Ctx)); break;
				//case "PMFF": this.add(new PMFF(this.Ctx)); break;
			}
	 	}
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
