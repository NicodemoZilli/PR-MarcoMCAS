package main;

import java.util.ArrayList;
import java.util.Map;

import metricas.mreuso.IMReuso;
import metricas.mreuso.mgenericidad.FHI;
import metricas.mreuso.mgenericidad.IMGenericidad;
import metricas.mreuso.mgenericidad.LMetricasMG;

/**
 * @author Nicodemo Zilli
 * @version 1.0
 * @created 07-oct.-2021
 */

public class Contexto {

		
	private String Response;

	public Contexto() {
		this.Response ="{";
	}

	public String Ejecutar(ArrayList<String> Cat, ArrayList<String> Met, Map<String, Object> Dat) {

		try {
			IMReuso obj;
			 for (String key : Cat) {
				 if(key.equals("Genericidad") )
				 {
					obj = new LMetricasMG();
				 	for(String k1 : Met) 
				 	{
				 		if(k1.equals("FHI"))
				 		{
				 			((IMGenericidad) obj).add(new FHI(Dat));
				 		}
				 	}
				 	this.Response += obj.Calcular();
				 }
				 
			 }
			 this.Response+="}";
			 System.out.println("Response: "+this.Response);
		}catch(Exception e) {
			e.printStackTrace();;
		}			 
		return this.Response;
	}

}
