package main;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class  Cliente extends Parser implements HttpHandler {
	
	ArrayList<String> Cat;
	ArrayList<String> Met;
	Map<String, Object> Dat;
	
	public Cliente(ArrayList<String> cat, ArrayList<String> met, Map<String, Object> dat) {
		this.Cat = cat;
		this.Met = met;
		this.Dat = dat;
	}

	public void handle(HttpExchange he) throws IOException {
				
		addCORS(he);
		Contexto Ctx = new Contexto();
		String response;
		if(this.Cat.size()>0 && this.Met.size()>0 && this.Dat.size()>0) {
			response = Ctx.Ejecutar(this.Cat,this.Met,this.Dat);
		}else {
			response = "{\"message\":\"No se han establecido todos los datos necesarios\"}";
		}
		
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}