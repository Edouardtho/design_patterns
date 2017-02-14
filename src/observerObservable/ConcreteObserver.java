package observerObservable;

public class ConcreteObserver implements Observer{

	@Override
	public void update(Object objet) {
		System.out.println("je suis l'observateur " + this + " qui reçoit: " + objet);
	}

}
