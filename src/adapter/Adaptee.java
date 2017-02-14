package adapter;

public interface Adaptee {
	
	/**
	 * Signature de la méthode qu'on ne veut pas toucher
	 * @param i
	 * @return
	 */
	int specificRequest(int i);

}
