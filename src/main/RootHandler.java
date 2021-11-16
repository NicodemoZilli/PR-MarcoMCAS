package main;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class RootHandler extends Parser implements HttpHandler {

	public void handle(HttpExchange he) throws IOException {
		addCORS(he);
		String response = "Servidor Funcionando Correctamente";
		he.sendResponseHeaders(200, response.length());
		OutputStream os = he.getResponseBody();
		os.write(response.getBytes());
		os.close();
	}
}

