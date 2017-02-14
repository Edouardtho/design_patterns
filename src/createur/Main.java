package createur;

import createur.PrototypeFactory.TypeObjet;

public class Main {

	public static void main(String[] args) {
		// appeler une méthode statique sans new en passant par la class
		Singleton singleton = SingletonFactory.getSingleton();
		System.out.println(singleton);
		int i = singleton.getI();
				
		singleton = SingletonFactory.getSingleton();
		System.out.println(singleton);
		
		PrototypeFactory prototypeFactory = new PrototypeFactory();
		
		Prototype prototype = prototypeFactory.getPrototype(TypeObjet.TypeObjet1);
		if(prototype instanceof Prototype1){
			System.out.println("Objet du type : Prototype1");
		}
		
		prototype = prototypeFactory.getPrototype(TypeObjet.TypeObjet2);
		if(prototype instanceof Prototype2){
			System.out.println("Objet du type : Prototype2");
		}
	}

}
