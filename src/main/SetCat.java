package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class SetCat extends Parser implements HttpHandler {
	
	String Cat;
	public SetCat(String Cat) {
		this.Cat =  Cat;
	}

	public void handle(HttpExchange he) throws IOException {
		addCORS(he);
		InputStreamReader isr = new InputStreamReader(he.getRequestBody(), "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String query = br.readLine();
		this.Cat="";
		parseQuery(query, this.Cat);
		String response = "Categoria Agregada";
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}