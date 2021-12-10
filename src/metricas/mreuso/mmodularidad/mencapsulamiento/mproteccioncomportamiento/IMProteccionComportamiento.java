package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento;

import metricas.mreuso.mmodularidad.mencapsulamiento.IMEncapsulamiento;

public interface IMProteccionComportamiento extends IMEncapsulamiento{
	
	void add(IMProteccionComportamiento IMP);

	void remove(IMProteccionComportamiento IMP);

}