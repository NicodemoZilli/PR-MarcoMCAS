package metricas.mreuso.mgenericidad;

import metricas.mreuso.MReuso;

/**
 * @author Nicodemo Zilli
 * @version 1.0
 * @created 07-oct.-2021
 */

public interface MGenericidad extends MReuso {
	
	void add(MGenericidad IMG);

	void remove(MGenericidad IMG);

}
