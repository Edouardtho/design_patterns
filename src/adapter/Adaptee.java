package adapter;

public interface Adaptee {
	
	/**
	 * Signature de la m�thode qu'on ne veut pas toucher
	 * @param i
	 * @return
	 */
	int specificRequest(int i);

}
