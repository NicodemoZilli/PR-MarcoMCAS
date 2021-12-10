package main;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class ServidorMarcoMetricas {
	
	private static int port;
	private static HttpServer server;
	private static Contexto Ctx;
	
	public static void main(String[] args) {
		port=9009;
		Ctx= new Contexto();
		
		try {
			server = HttpServer.create(new InetSocketAddress(port), 0);
			System.out.println("Servidor iniciado en el puerto: " + port);
			server.createContext("/", new RootHandler());
			server.createContext("/setCat", new SetCat(Ctx));
			server.createContext("/setMet", new SetMet(Ctx));
			server.createContext("/setDat", new SetDat(Ctx));
			server.createContext("/Execute", new Cliente(Ctx));
			server.createContext("/DeleteData", new Cleaner(Ctx));		
			server.setExecutor(null);
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


