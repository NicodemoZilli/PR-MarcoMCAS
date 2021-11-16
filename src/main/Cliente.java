package main;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class  Cliente extends Parser implements HttpHandler {
	
	String Cat;
	ArrayList<String> Met;
	Map<String, Object> Dat;
	
	public Cliente(String cat, ArrayList<String> met, Map<String, Object> dat) {
		this.Cat = cat;
		this.Met = met;
		this.Dat = dat;
	}

	public void handle(HttpExchange he) throws IOException {
		
		String response;
		try {
			addCORS(he);
			Contexto Ctx = new Contexto();
			if(this.Cat.length()>0 && this.Met.size()>0 && this.Dat.size()>0) {
				response = Ctx.Ejecutar(this.Cat,this.Met,this.Dat);
			}else {
				response = "{\"message\":"
							+ "{\"tit\":\"Error\","
							+ "\"msj\":\"No se han establecido todos los datos necesarios, "
							+ "Intente de nuevo\","
							+ "\"icon\":\"error\"}}";
			}
//			throw new Exception("Exception lanzada");
		}catch(Exception e) {
			response = "{\"message\":"
					+ "{\"tit\":\"Error\","
					+ "\"msj\":\""+e.getMessage()+"\","
					+ "\"icon\":\"error\"}}";
		}
			
			he.sendResponseHeaders(200, response.length());
			OutputStream os = he.getResponseBody();
			os.write(response.getBytes());
			os.close();
	}
}