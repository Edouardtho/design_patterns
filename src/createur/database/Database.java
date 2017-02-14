package createur.database;

public class Database {
	
	static Connexion connexion;

	public static Connexion getConnexion(String url, String login, String password) {
		if(connexion == null){
			connexion = new Connexion(url, login, password);
		}
		
		return connexion;
	}

}
