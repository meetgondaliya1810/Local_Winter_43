class Superclass {
	int number;
	
	Superclass (int n) {
		number = n;
		System.out.println(" Super class constructor called.Number = " + number);
		}
	}
	class Q21 extends Superclass {
		Q21 (int n) {
		super(n);
		System.out.println("Superclass constructor called.");
	}
	public static void main(String[] args) {
	Q21 obj = new Q21(100);
	}
}
