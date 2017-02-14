package reseau.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeurTCP {
	
	public static void main(String[] a){
		try{
			// ouverture du port r�seau 8888
			ServerSocket socket = new ServerSocket(8888);	
			System.out.println("port ouvert");
			// attente connexion r�seau d'un client
			Socket clientConnecte = socket.accept();		
			System.out.println("client connect�");
			// attente donn�es r�seau
			InputStream inputStream = clientConnecte.getInputStream();			
			// lecture donn�e r�seau
			byte[] b = new byte[256];
			inputStream.read(b);			
			// conversion cha�ne de caract�res
			String s = new String(b);			
			// affichage cha�ne
			System.out.println("donn�es re�ues : " + s);			
			// pr�paration r�ponse
			s = "merci bien re�u : " + s;
			// cr�ation flot r�ponse
			OutputStream outputStream = clientConnecte.getOutputStream();  
			// envoi la r�ponse
			outputStream.write(s.getBytes());		
			System.out.println("r�ponse envoy�e");
		}catch(Exception e){
			e.printStackTrace();
		}
		
 	}

}
