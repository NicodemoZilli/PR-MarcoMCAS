package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

import metricas.mreuso.mmodularidad.mencapsulamiento.MEncapsulamiento;

public interface MProteccionEstado extends MEncapsulamiento{
	
	void add(MProteccionEstado IMP);

	void remove(MProteccionEstado IMP);

}
