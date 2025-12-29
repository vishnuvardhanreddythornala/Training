/*
 * Savings Prediction Calculation

Question Description
A finance app predicts savings based on monthly income and expense habits.

	Implement overloaded methods named predict to calculate the expected savings.
	
	Methods
		double predict(double income, double expenses)
		double predict(double income, double expenses, boolean festiveMonth)
		
	Rules
		Base Savings = income − expenses
		Festive Month → expenses increase by 20%
		
	Hardcoded Data Set to Use
		Income = 45000
		Expenses = 30000
		Festive Month = true
	
	Expected Output
		Festive expenses = 36000
		Savings = 9000
 */
package module8.methods;

public class SavingsPredictionCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double savings = predict(45000,30000,true);
		System.out.println("Savings: "+ savings);
		

	}
	public static double predict(double income, double expenses) {
		return income-expenses;
		
	}
	public static double predict(double income, double expenses, boolean festiveMonth) {
		if(festiveMonth) {
			expenses = expenses + ( expenses * 20/100);
			System.out.println("Festive expenses = " + expenses);
		}
		return income - expenses;
		
	}

}
