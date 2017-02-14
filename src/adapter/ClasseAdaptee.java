package adapter;

public class ClasseAdaptee implements Adaptee{

	/**
	 * Implantation qu'on ne veut pas toucher
	 */
	@Override
	public int specificRequest(int i) {
		System.out.println("Methode qu'on ne peut pas modifier");
		return i;
	}

}
