package module15.ObjectClass;

public class Objectdemo {
	int id ;
	String name;
	
	public Objectdemo(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "Objectdemo [id=" + id +", name="+name+"]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectdemo ref = new Objectdemo(1,"Vishnu");
		System.out.println(ref);
		System.out.println(ref.toString());
		System.out.println();
		System.out.println(ref.hashCode());
		System.out.println(Integer.toHexString(64));
		System.out.println(Integer.toHexString(ref.hashCode()));
		System.out.println(ref.getClass());
		System.out.println(ref.getClass().getName()+"@"+Integer.toHexString(ref.hashCode()));

	}

}
