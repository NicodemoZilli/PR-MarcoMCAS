package metricas.mreuso.mmodularidad.mautonomia.mindependencia;

import metricas.mreuso.mmodularidad.mautonomia.IMAutonomia;

public interface IMIndependencia extends IMAutonomia{
	
	void add(IMIndependencia IMI);
	
	void remove(IMIndependencia IMI);
}
