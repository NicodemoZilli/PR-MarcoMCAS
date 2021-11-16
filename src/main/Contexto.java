package main;

import java.util.ArrayList;
import java.util.Map;

import metricas.mreuso.IMReuso;
import metricas.mreuso.mgenericidad.DIT;
import metricas.mreuso.mgenericidad.FFC;
import metricas.mreuso.mgenericidad.FHI;
import metricas.mreuso.mgenericidad.FHIAC;
import metricas.mreuso.mgenericidad.FHIJ;
import metricas.mreuso.mgenericidad.FMFAC;
import metricas.mreuso.mgenericidad.IMGenericidad;
import metricas.mreuso.mgenericidad.LMetricasMG;
import metricas.mreuso.mgenericidad.NOC;

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

	public String Ejecutar (String Cat, ArrayList<String> Met, Map<String, Object> Dat) {

		try {
			IMReuso obj=null;

				 if(Cat.equals("Genericidad") )
				 {
					obj = new LMetricasMG();
				 	for(String k1 : Met) 
				 	{
				 		if(k1.equals("DIT"))
						{
							((IMGenericidad) obj).add(new DIT(Dat));
						}
				 		else if(k1.equals("NOC"))
						{
							((IMGenericidad) obj).add(new NOC(Dat));
						}
				 		else if(k1.equals("FHI"))
				 		{
				 			((IMGenericidad) obj).add(new FHI(Dat));
				 		} 
						else if(k1.equals("FHIJ"))
						{
							((IMGenericidad) obj).add(new FHIJ(Dat));
						}
						else if(k1.equals("FFC"))
						{
							((IMGenericidad) obj).add(new FFC(Dat));
						}
						else if(k1.equals("FHIAC"))
						{
							((IMGenericidad) obj).add(new FHIAC(Dat));
						}
						else if(k1.equals("FMFAC"))
						{
							((IMGenericidad) obj).add(new FMFAC(Dat));
						}
				 	}
				 	
				 }
				 
			 this.Response += obj.Calcular();
			 this.Response+="}";
			 System.out.println("Response: "+this.Response);
		}catch(Exception e) {
			this.Response = "{\"message\":"
					+ "{\"tit\":\"Error\","
					+ "\"msj\":\""+e.getMessage()+"\","
					+ "\"icon\":\"error\"}}";
		}			 
		return this.Response;
	}

}
