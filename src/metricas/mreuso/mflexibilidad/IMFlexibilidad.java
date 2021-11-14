package metricas.mreuso.mflexibilidad;

import metricas.mreuso.IMReuso;

public interface IMFlexibilidad extends IMReuso {

	void add(IMFlexibilidad IMF);

	void remove(IMFlexibilidad IMF);

}
