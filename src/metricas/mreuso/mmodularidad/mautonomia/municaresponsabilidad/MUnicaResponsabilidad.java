package metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad;

import metricas.mreuso.mmodularidad.mautonomia.MAutonomia;

public interface MUnicaResponsabilidad extends MAutonomia{
	
	void add(MUnicaResponsabilidad IMUR);
	
	void remove(MUnicaResponsabilidad IMUR);
}
