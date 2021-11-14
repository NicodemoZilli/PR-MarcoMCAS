package main;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Cleaner extends Parser implements HttpHandler{
	
	ArrayList<String> Cat;
	ArrayList<String> Met;
	Map<String, Object> Dat;
	
	public Cleaner(ArrayList<String> cat, ArrayList<String> met, Map<String, Object> dat) {
		this.Cat = cat;
		this.Met = met;
		this.Dat = dat;
	}

	public void handle(HttpExchange he) throws IOException {
		addCORS(he);
		 this.Cat.clear();
		 this.Met.clear();
		 this.Dat.clear();
		String response = "Datos Eliminados";
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();		
	}
	
}
