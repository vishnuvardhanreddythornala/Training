package module8.methods;

public class methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method start");
		powerbutton();
		volumebutton();
		powerbutton();
		System.out.println("Main method end");

	}
	public static void powerbutton() {
		System.out.println("Screen on");
		System.out.println("Screen off");
	}
	public static void volumebutton() {
		System.out.println("Volume increase");
		powerbutton();
		System.out.println("Volume decrease");
	}

}

