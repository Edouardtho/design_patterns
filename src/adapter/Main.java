package adapter;

public class Main {

	public static void main(String[] args) {
		Target target = new Adapter();
		int i = target.request(0);
	}

}
