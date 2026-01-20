package ArraysPracticeProblems;

public class StaticOverloading {
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));

	}

}
