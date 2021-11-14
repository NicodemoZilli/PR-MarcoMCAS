package metricas.mreuso.mmodularidad.mlegibilidad;

import metricas.mreuso.mmodularidad.IMModularidad;

public interface IMLegibilidad extends IMModularidad{
	
	void add(IMLegibilidad IML);

	void remove(IMLegibilidad IML);

}
