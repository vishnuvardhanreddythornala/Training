package module11.oops;

public class Practice1 {
	static String CompanyName = "Capgemini";
	
	int empId = 122113;
	String empName = "Vicky";
	static void Companydetails(){
		System.out.println(CompanyName);
		
	}
	void Empdetails() {
		System.out.println(empId);
		System.out.println(empName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Companydetails();
		
		Practice1 obj = new Practice1();
		obj.Empdetails();
		

	}

}
