package module11.coreOops;

public class CopyConstructor {
	int id;
	String name;
	public CopyConstructor(int id, String name) {
		this.id= id;
		this.name = name;
	}
	public CopyConstructor(CopyConstructor obj) {
		this.id = obj.id;
		this.name = obj.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main start");
		CopyConstructor ref1 = new CopyConstructor(1,"vishnu");
		System.out.println(ref1.id);
		System.out.println(ref1.name);
		
		System.out.println("Copy constructor start");
		CopyConstructor ref2 = new CopyConstructor(ref1);
		System.out.println(ref2.id);
		System.out.println(ref2.name);

	}

}
