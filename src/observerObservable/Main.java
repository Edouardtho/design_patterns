package observerObservable;

public class Main {

	public static void main(String[] args) {
		
		Subject subject = new Subject();
		
		Observer concreteObserver1 = new ConcreteObserver();
		subject.attach(concreteObserver1);
		
		Observer concreteObserve2 = new ConcreteObserver();
		subject.attach(concreteObserve2);
		
		subject.notify("Essai");
		
	}

}
