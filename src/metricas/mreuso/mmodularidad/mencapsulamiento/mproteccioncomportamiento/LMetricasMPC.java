package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

/**
 * @author David Nicodemo Zilli Vazquez
 * @version 1.0
 * @created Oct Dic 2021
 */

import java.util.ArrayList;
import java.util.List;

import main.Contexto;

public class LMetricasMPC implements MProteccionComportamiento{

	private List<MProteccionComportamiento> LisMet;
	private Contexto Ctx;
	
	public LMetricasMPC(Contexto Ctx) {
		this.LisMet = new ArrayList<MProteccionComportamiento>();
		this.Ctx = Ctx;
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "PM": this.add(new PM(this.Ctx)); break;
				case "TPM": this.add(new TPM(this.Ctx)); break;
				case "PMFP": this.add(new PMFP2(this.Ctx)); break;
				case "PMFPR": this.add(new PMFPR2(this.Ctx)); break;
				case "PMFF": this.add(new PMFF2(this.Ctx)); break;
			}
	 	}
	}

	@Override
	public void add(MProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.add(IMPC);
	}

	@Override
	public void remove(MProteccionComportamiento IMPC) {
		assert IMPC != null;
		this.LisMet.remove(IMPC);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MProteccionComportamiento::Calcular);
	}

}