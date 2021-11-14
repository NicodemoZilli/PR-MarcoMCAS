package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class SetDat extends Parser implements HttpHandler {
	Map<String, Object> Dat;
	public SetDat(Map<String, Object> Dat) {
		this.Dat = Dat; 
	}

	public void handle(HttpExchange he) throws IOException {
		addCORS(he);
		
		InputStreamReader isr = new InputStreamReader(he.getRequestBody(), "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String query = br.readLine();
		this.Dat.clear();
		parseQuery(query, this.Dat);
		String response = "Datos Agregados";
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}

