package createur;

public class SingletonFactory {
	
	// creation d'un objet statique
	private static Singleton singleton = new Singleton();
	
	/**
	 * 
	 * @return toujours le même objet (car singleton est déclaré en static)
	 */
	public static Singleton getSingleton(){
		return singleton;
	}

}
