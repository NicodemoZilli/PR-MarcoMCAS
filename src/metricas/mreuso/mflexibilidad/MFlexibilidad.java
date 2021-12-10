package metricas.mreuso.mflexibilidad;

import metricas.mreuso.MReuso;

public interface MFlexibilidad extends MReuso {

	void add(MFlexibilidad IMF);

	void remove(MFlexibilidad IMF);

}
