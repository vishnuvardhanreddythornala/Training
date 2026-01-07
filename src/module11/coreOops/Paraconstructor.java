package module11.coreOops;

public class Paraconstructor {
	int id;
	String name;
	
	public Paraconstructor(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paraconstructor obj1 = new Paraconstructor(1,"Vishnu");
		
		
		System.out.println(obj1.id);
		System.out.println(obj1.name);

	}

}
