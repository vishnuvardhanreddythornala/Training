/*
 * Loan Payable Amount Calculation

Question Description

A bank wants to compute the payable loan amount under different interest structures.

Implement overloaded methods named loan to calculate the final payable amount based on the provided inputs.

Overloads Required
double loan(double principal)
double loan(double principal, int years)
double loan(double principal, int years, String loanType)


Rules
Base Interest
	Default interest is 8% simple interest when only principal is provided.
With Years
	When years are provided, interest is compounded annually at 10%.
With Loan Type
	HOME → compound annually at 7%
	AUTO → compound annually at 9%
	PERSONAL → compound annually at 12%
	
Hardcoded Data Set to Use
	Principal = 200000
	Years = 5
	Loan Type = "HOME"
	
Expected Output
	HOME loan compound rate = 7%
	Amount = 200000 * (1.0.07)^5 = 280510.35
 */
package module8.methods;

public class LoanPayableAmountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loanDetails = loan(200000,5,"HOME");
		System.out.println(loanDetails);

	}
	public static double loan(double principal) {
		return principal + (principal * 8 /100 );
		
		
	}
	public static double loan(double principal, int years) {
		return principal * Math.pow(1.10, years);
		
	}
	public static double loan(double principal, int years, String loanType) {
		double rate  = 0;
		if(loanType == "HOME") {
			rate = 0.07;
			System.out.println("HOME loan compound rate = 7%");
		}else if(loanType == "AUTO") {
			rate = 0.09;
		
		}else if(loanType == "PERSONAL") {
			rate = 0.12;
			
		}
		return principal * Math.pow(1 + rate, years);
	}
}

