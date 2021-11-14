package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class SetMet extends Parser implements HttpHandler {
	
	ArrayList<String> Met;
	public SetMet(ArrayList<String> Met) {
		this.Met = Met;
	}

	public void handle(HttpExchange he) throws IOException {
		addCORS(he);
		
		InputStreamReader isr = new InputStreamReader(he.getRequestBody(), "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String query = br.readLine();
		this.Met.clear();
		parseQuery(query, this.Met);		
		String response = "Metricas Agregadas";
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}
