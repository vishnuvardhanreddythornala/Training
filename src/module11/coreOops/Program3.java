package module11.coreOops;
//wajp to create a static method which will return address of an object.

public class Program3 {
	
	//
	static Program3 getObjAddress() {
		Program3 obj = new Program3();
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 ref = getObjAddress();
		
		System.out.println(ref);
		
		
		

	}

}
