package metricas.mreuso.mgenericidad;

import java.util.ArrayList;
import java.util.List;

public class LMetricasMG implements IMGenericidad {

	private List<IMGenericidad> LisMet;

	public LMetricasMG() {
		this.LisMet = new ArrayList<>();
	}

	@Override
	public void add(IMGenericidad IMG) {
		assert IMG != null;
		this.LisMet.add(IMG);
	}

	@Override
	public void remove(IMGenericidad IMG) {
		assert IMG != null;
		this.LisMet.remove(IMG);
	}

	@Override
	public String Calcular() {
		String resp = "";
		for(int i=0; i<this.LisMet.size(); i++) {
			resp += this.LisMet.get(i).Calcular();
			if(i<(this.LisMet.size()-1)) resp += ",";
		}
		return resp;
	}

}
