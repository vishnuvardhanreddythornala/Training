package module21.Functionalinterface;

public class fact {

@FunctionalInterface
interface Factorial{
	int findFactorial(int n);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1 = new Factorial() {
			@Override
			public int findFactorial(int n) {
				int fact = 1;
				for(int i =n; i>= 1; i--) {
					fact = fact * i;
				}
				return fact;
			}
		};
		
		System.out.println("using anonumus class: "+f1.findFactorial(6));
		
		System.out.println("--------------------------------------------");
		
		Factorial f2 = (n) -> {
			int fact = 1;
			for(int i =n; i>= 1; i--) {
				fact = fact * i;
			}
			return fact;
		};
		System.out.println("using lambda: "+f2.findFactorial(5));
		
		}
	}


