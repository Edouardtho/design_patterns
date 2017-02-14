package reseau.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP {
	
	public static void main(String[] a){
		try{
			// ouverture du port réseau 8888
			ServerSocket socket = new ServerSocket(8888);	
			System.out.println("port ouvert");
			// attente connexion réseau d'un client
			Socket clientConnecte = socket.accept();		
			System.out.println("client connecté");
			// attente données réseau
			InputStream inputStream = clientConnecte.getInputStream();			
			// lecture donnée réseau
			byte[] b = new byte[256];
			inputStream.read(b);			
			// conversion chaîne de caractères
			String s = new String(b);			
			// affichage chaîne
			System.out.println("données reçues : " + s);			
			// préparation réponse
			s = "merci bien reçu : " + s;
			// création flot réponse
			OutputStream outputStream = clientConnecte.getOutputStream();  
			// envoi la réponse
			outputStream.write(s.getBytes());		
			System.out.println("réponse envoyée");
		}catch(Exception e){
			e.printStackTrace();
		}
		
 	}

}
