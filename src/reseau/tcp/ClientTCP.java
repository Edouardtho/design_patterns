package reseau.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTCP {
	
	public static void main(String[] a){
		
		try{
			// connexion au serveur
			InetAddress addressServeur = InetAddress.getByName("127.0.0.1");
			int port = 8888;
			Socket socket = new Socket(addressServeur, port);
			
			// envoi donnée vers le serveur
			OutputStream outputStream = socket.getOutputStream();
			String s = "bonjour";
			outputStream.write(s.getBytes());
			
			// attente réponse
			InputStream inputStream = socket.getInputStream();
			byte[] b = new byte[256];
			inputStream.read(b);
			s = new String(b);
			System.out.println(s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
