package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

import metricas.mreuso.mmodularidad.mencapsulamiento.MEncapsulamiento;

public interface MProteccionComportamiento extends MEncapsulamiento{
	
	void add(MProteccionComportamiento IMP);

	void remove(MProteccionComportamiento IMP);

}