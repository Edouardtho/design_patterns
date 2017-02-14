package createur;

public class SingletonFactory {
	
	// creation d'un objet statique
	private static Singleton singleton = new Singleton();
	
	/**
	 * 
	 * @return toujours le m�me objet (car singleton est d�clar� en static)
	 */
	public static Singleton getSingleton(){
		return singleton;
	}

}
