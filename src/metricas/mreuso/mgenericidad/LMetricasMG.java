package metricas.mreuso.mgenericidad;

import java.util.ArrayList;
import java.util.List;
import main.Contexto;

public class LMetricasMG implements MGenericidad {

	private List<MGenericidad> LisMet;
	private Contexto Ctx;

	public LMetricasMG( Contexto Ctx) {
		this.Ctx = Ctx;
		this.LisMet = new ArrayList<MGenericidad>();
		
		for(String metrica : this.Ctx.getMetricas()) 
	 	{
			switch(metrica) {
				case "DIT": this.add(new DIT(this.Ctx)); break;
				case "NOC": this.add(new NOC(this.Ctx)); break;
				case "FHI": this.add(new FHI(this.Ctx)); break;
				case "FHIJ": this.add(new FHIJ(this.Ctx)); break;
				case "FFC": this.add(new FFC(this.Ctx)); break;
				case "FHIAC": this.add(new FHIAC(this.Ctx)); break;
				case "FMFAC": this.add(new FMFAC(this.Ctx)); break;
			}
	 	}
	}

	@Override
	public void add(MGenericidad IMG) {
		assert IMG != null;
		this.LisMet.add(IMG);
	}

	@Override
	public void remove(MGenericidad IMG) {
		assert IMG != null;
		this.LisMet.remove(IMG);
	}

	@Override
	public void Calcular() {
		this.LisMet.forEach(MGenericidad::Calcular);
	}

}
