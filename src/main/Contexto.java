package main;

/**
 * @author David Nicodemo Zilli Vazquez
 * @version 1.0
 * @created Oct Dic 2021
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import metricas.mreuso.MReuso;
import metricas.mreuso.mflexibilidad.LMetricasMF;
import metricas.mreuso.mgenericidad.LMetricasMG;
import metricas.mreuso.mmodularidad.mautonomia.mindependencia.LMetricasMI;
import metricas.mreuso.mmodularidad.mautonomia.municaresponsabilidad.LMetricasMUR;
import metricas.mreuso.mmodularidad.mencapsulamiento.mproteccioncomportamiento.LMetricasMPC;
import metricas.mreuso.mmodularidad.mencapsulamiento.mproteccionestado.LMetricasMPE;
import metricas.mreuso.mmodularidad.mlegibilidad.LMetricasML;

public class Contexto {

		
	private String Response;
	private ArrayList<String> Categorias;
	private ArrayList<String> LMetricas;
	private Map<String, Object> LDatos;
	private MReuso oMRE;

	public Contexto() {
		this.Response ="{";
		this.Categorias = new ArrayList<String>();;
		this.LMetricas = new ArrayList<String>();
		this.LDatos = new HashMap<String, Object>();
		this.oMRE = null;
	}
	
	
	public void addResponse(String resp) {
		this.Response += resp+",";
	}
	public String getResponse() {
		System.out.println("Response: "+this.Response.substring(0, this.Response.length()-1)+"}");
		return this.Response.substring(0, this.Response.length()-1)+"}";
	}
	public ArrayList<String> getCategorias(){
		return this.Categorias;
	}
	
	public ArrayList<String> getMetricas(){
		return this.LMetricas;
	}
	
	public Map<String,Object> getDatos(){
		return this.LDatos;
	}
	public Object getDato(String key){
		return this.LDatos.get(key);
	}

	public boolean isComplete(){
		return this.Categorias.size()>0 && this.LMetricas.size()>0 && this.LDatos.size()>0;
	}
	
	public void ClearData() {
		this.Categorias.clear();
		this.LMetricas.clear();
		this.LDatos.clear();
		this.Response ="{";
	}
	
	public void Ejecutar () {

		try {
			for(String categoria : this.Categorias) {
				switch (categoria) {
					case "Genericidad" : this.oMRE = new LMetricasMG(this); break;
					case "Flexibilidad" : this.oMRE = new LMetricasMF(this); break;
					case "Legibilidad" : this.oMRE = new LMetricasML(this); break;
					case "PEstado" : this.oMRE = new LMetricasMPE(this); break;
					case "PComportamiento" : this.oMRE = new LMetricasMPC(this); break;
					case "Independencia" : this.oMRE = new LMetricasMI(this); break;
					case "UnicaResponsabilidad" : this.oMRE = new LMetricasMUR(this); break;
					case "Aislamiento" :  break;
				}
				 this.oMRE.Calcular();
			}
		}catch(Exception e) {
			this.Response = "{\"message\":"
					+ "{\"tit\":\"Error\","
					+ "\"msj\":\""+e.getMessage().toString()+"\","
					+ "\"icon\":\"error\"}}";
		}			 
	}

}
