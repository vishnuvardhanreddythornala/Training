package module2.switchcase;
import java.util.Scanner;
public class EmployeeDesignation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Select Department:");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.println("3. Finance");
        System.out.println("4. Operations");
        System.out.print("Enter department choice: ");
        int dept = sc.nextInt();

        switch (dept) {

            case 1: // IT
                System.out.println("Select Role:");
                System.out.println("1. Developer");
                System.out.println("2. Tester");
                System.out.println("3. DevOps Engineer");
                System.out.print("Enter role choice: ");
                int itRole = sc.nextInt();

                switch (itRole) {
                    case 1:
                        System.out.println("Designation: IT Developer");
                        break;
                    case 2:
                        System.out.println("Designation: IT Tester");
                        break;
                    case 3:
                        System.out.println("Designation: DevOps Engineer");
                        break;
                    default:
                        System.out.println("Invalid IT role selection");
                }
                break;

            case 2: // HR
                System.out.println("Select Role:");
                System.out.println("1. Recruiter");
                System.out.println("2. HR Executive");
                System.out.println("3. Payroll Officer");
                System.out.print("Enter role choice: ");
                int hrRole = sc.nextInt();

                switch (hrRole) {
                    case 1:
                        System.out.println("Designation: HR Recruiter");
                        break;
                    case 2:
                        System.out.println("Designation: HR Executive");
                        break;
                    case 3:
                        System.out.println("Designation: Payroll Officer");
                        break;
                    default:
                        System.out.println("Invalid HR role selection");
                }
                break;

            case 3: // Finance
                System.out.println("Select Role:");
                System.out.println("1. Accountant");
                System.out.println("2. Financial Analyst");
                System.out.println("3. Auditor");
                System.out.print("Enter role choice: ");
                int finRole = sc.nextInt();

                switch (finRole) {
                    case 1:
                        System.out.println("Designation: Accountant");
                        break;
                    case 2:
                        System.out.println("Designation: Financial Analyst");
                        break;
                    case 3:
                        System.out.println("Designation: Auditor");
                        break;
                    default:
                        System.out.println("Invalid Finance role selection");
                }
                break;

            case 4: // Operations
                System.out.println("Select Role:");
                System.out.println("1. Operation Executive");
                System.out.println("2. Team Lead");
                System.out.println("3. Manager");
                System.out.print("Enter role choice: ");
                int opsRole = sc.nextInt();

                switch (opsRole) {
                    case 1:
                        System.out.println("Designation: Operation Executive");
                        break;
                    case 2:
                        System.out.println("Designation: Team Lead");
                        break;
                    case 3:
                        System.out.println("Designation: Manager");
                        break;
                    default:
                        System.out.println("Invalid Operations role selection");
                }
                break;

            default:
                System.out.println("Invalid department selection");
        }
        sc.close();

	}

}
