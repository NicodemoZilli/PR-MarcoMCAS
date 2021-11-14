package metricas.mreuso.mgenericidad;

import metricas.mreuso.IMReuso;

/**
 * @author Nicodemo Zilli
 * @version 1.0
 * @created 07-oct.-2021
 */

public interface IMGenericidad extends IMReuso {
	
	void add(IMGenericidad IMG);

	void remove(IMGenericidad IMG);

}
