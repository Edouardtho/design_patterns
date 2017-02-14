package createur;

public class PrototypeFactory {
	
	enum TypeObjet{
		TypeObjet1, TypeObjet2
	}
	
	/**
	 * 
	 * Noter le type de retour : un classe mère
	 * @param typeObjet le type d'objet à retourner
	 * @return soit un objet du type Prototype1 ou Prototype2
	 */
	public Prototype getPrototype(TypeObjet typeObjet){
		if(typeObjet == TypeObjet.TypeObjet1){
			return new Prototype1();
		} else {
			return new Prototype2();
		}
	}

}
