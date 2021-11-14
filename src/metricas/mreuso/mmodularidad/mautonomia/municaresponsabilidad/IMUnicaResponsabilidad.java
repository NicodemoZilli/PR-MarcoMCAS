package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import metricas.mreuso.mmodularidad.mautonomia.IMAutonomia;

public interface IMUnicaResponsabilidad extends IMAutonomia{
	
	void add(IMUnicaResponsabilidad IMUR);
	
	void remove(IMUnicaResponsabilidad IMUR);
}
