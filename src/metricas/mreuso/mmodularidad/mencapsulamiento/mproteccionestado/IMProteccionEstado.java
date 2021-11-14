package metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado;

import metricas.mreuso.mmodularidad.mencapsulamiento.IMEncapsulamiento;

public interface IMProteccionEstado extends IMEncapsulamiento{
	
	void add(IMProteccionEstado IMP);

	void remove(IMProteccionEstado IMP);

}
