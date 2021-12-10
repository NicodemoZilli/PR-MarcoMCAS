package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

import java.util.ArrayList;
import java.util.List;

import main.Contexto;


public class LMetricasMPC implements IMProteccionComportamiento{

	private List<IMProteccionComportamiento> LisMet;
	private Contexto Ctx;
	
	public LMetricasMPC(Contexto Ctx) {
		this.LisMet = new ArrayList<IMProteccionComportamiento>();
		this.Ctx = Ctx;
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "PM": this.add(new PM(this.Ctx)); break;
				case "TPM": this.add(new TPM(this.Ctx)); break;
//				case "PMFP": this.add(new PMFP(this.Ctx)); break;
//				case "PMFPR": this.add(new PMFPR(this.Ctx)); break;
//				case "PMFF": this.add(new PMFF(this.Ctx)); break;
			}
	 	}
	}

	@Override
	public void add(IMProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.add(IMPC);
	}

	@Override
	public void remove(IMProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.remove(IMPC);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(IMProteccionComportamiento::Calcular);
	}

}