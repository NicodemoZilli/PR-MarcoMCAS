package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import metricas.mreuso.mmodularidad.mautonomia.MAutonomia;

public interface MIndependencia extends MAutonomia{
	
	void add(MIndependencia IMI);
	
	void remove(MIndependencia IMI);
}
