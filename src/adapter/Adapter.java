package adapter;

public class Adapter implements Target, Adaptee{

	ClasseAdaptee classeAdaptee = new ClasseAdaptee();
	
	@Override
	public int specificRequest(int i) {
		return classeAdaptee.specificRequest(i);
	}

	@Override
	public int request(int i) {
		int j = this.specificRequest(i);
		System.out.println("Retour de la méthode qu'on ne veut pas modifier: " + j);
		// adpatation
		j = j+1;
		System.out.println("Adaptation : modification du retour: " + j);
		return j;
	}

}
