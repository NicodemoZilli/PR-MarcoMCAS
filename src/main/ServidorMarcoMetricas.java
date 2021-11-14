package main;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.sun.net.httpserver.HttpServer;

public class ServidorMarcoMetricas {
	public static ArrayList<String> Cat = new ArrayList<String>();
	public static ArrayList<String> Met = new ArrayList<String>();
	public static Map<String, Object> Dat = new HashMap<String, Object>();
	
	public static void main(String[] args) {
		
		try {
			final int port = 9009;
			HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
			System.out.println("Servidor iniciado en el puerto: " + port);
			server.createContext("/", new RootHandler());
			server.createContext("/setCat", new SetCat(Cat));
			server.createContext("/setMet", new SetMet(Met));
			server.createContext("/setDat", new SetDat(Dat));
			server.createContext("/Execute", new Cliente(Cat,Met,Dat));
			server.createContext("/DeleteData", new Cleaner(Cat,Met,Dat));
			server.setExecutor(null);
			server.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

