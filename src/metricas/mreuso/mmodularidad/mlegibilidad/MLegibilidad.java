package metricas.mreuso.mmodularidad.mlegibilidad;

import metricas.mreuso.mmodularidad.MModularidad;

public interface MLegibilidad extends MModularidad{
	
	void add(MLegibilidad IML);

	void remove(MLegibilidad IML);

}
