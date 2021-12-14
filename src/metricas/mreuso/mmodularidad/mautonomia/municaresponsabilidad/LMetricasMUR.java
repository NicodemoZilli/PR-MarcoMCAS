package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

/**
 * @author David Nicodemo Zilli Vazquez
 * @version 1.0
 * @created Oct Dic 2021
 */

import java.util.ArrayList;
import java.util.List;
import main.Contexto;

public class LMetricasMUR implements MUnicaResponsabilidad {
	
	private Contexto Ctx;
	private List<MUnicaResponsabilidad> LisMet;
	
	public LMetricasMUR(Contexto Ctx) {
		this.LisMet = new ArrayList<MUnicaResponsabilidad>();
		this.Ctx = Ctx;
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "LCOM": this.add(new LCOM(this.Ctx));	break;
				case "RFC": this.add(new RFC(this.Ctx));  break;
			}
	 	}
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
