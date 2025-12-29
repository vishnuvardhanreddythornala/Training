
package module10.arrays;

public class smartTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
		int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
		int n = temperatures.length;
		int s = sales.length;
		
	
/*
Activity 1 – Average Temperature
Goal: Find the average weekly temperature.
Use a method to sum all values and divide by the total number of days.
Expected Output:
Average Temperature: 30.3°C
		 */
		float sum = 0;
		for(int i = 0; i < temperatures.length; i++) {
			sum = sum + temperatures[i];
		}
		float avg = sum /n; 	
		System.out.printf("Average Temperature: %.1f°C", avg);
		System.out.println();
		
/*
 * Activity 2 – Hottest and Coldest Day
	Goal: Identify the highest and lowest recorded temperatures.
	Bonus: Try to print which day (e.g., Day 5) had those temperatures.

	Expected Output:
	Highest Temperature: 35°C
	Lowest Temperature: 27°C
	
		
 */	
		float highest = temperatures[0];
		float lowest = temperatures[0];
		int highday = 1;
		int lowday = 1;
		for(int i = 0; i<n; i++) {
			if(temperatures[i] > highest) {
				highest = temperatures[i];
				highday = i+1;
			}
			if(temperatures[i] < lowest) {
				lowest = temperatures[i];
				lowday = i +1;
			}
		}
		System.out.println("Highest Temperature: " + highest + "°C on Day " + highday);
		System.out.println("Lowest Temperature: " + lowest + "°C on Day " + lowday);
		
/*
 * Activity 3 – Count Hot Days
Goal: Count how many days the temperature was above 30°C.

Expected Output:
Number of hot days (>30°C): 3
 */
		int count = 0;
		for(int i=0; i< n ; i++) {
			if(temperatures[i] > 30) {
				count++;
			}
		}
		System.out.println("Number of hot days (>30°C): "+count);
		
/*
 * Activity 4 – Total and Average Sales
Goal: Calculate total revenue and average daily sales using array traversal.

Expected Output:
Total Sales: 825
Average Sales: 117.86
 */
		float sum1 = 0;
		for(int i = 0;  i < s; i++) {
			sum1 = sum1 + sales[i];
		}
		float avg1 = sum1/n;
		System.out.println("Total Sales: " + sum1);
		System.out.println("Average Sales: "+avg1);
		
/*
 * Activity 5 – Record-Breaking Sales
Goal: Identify the highest and lowest sales of the week and the days they occurred.

Expected Output:
Highest Sale: 200 on Day 5
Lowest Sale: 75 on Day 6
 */
		int highestsale = sales[0];
		int lowestsale = sales[0];
		int highsaleday = 1;
		int lowsaleday = 1;
		for(int i = 0; i<s; i++) {
			if(sales[i] > highestsale) {
				highestsale = sales[i];
				highsaleday = i+1;
			}
			if(sales[i] < lowestsale) {
				lowestsale = sales[i];
				lowsaleday = i +1;
			}
		}
		System.out.println("Highest sale: " + highestsale + " on Day " + highsaleday);
		System.out.println("Lowest sale: " + lowestsale + " on Day " + lowsaleday);
		
/*
 * Activity 6 – Count High-Sales Days
Goal: Find out how many days had sales above ₹100.

Expected Output:
Number of high sales days (>100): 4
 */
		int count1 = 0;
		for(int i=0; i< s ; i++) {
			if(sales[i] > 100) {
				count1++;
			}
		}
		System.out.println("Number of high sales days: "+count1);
		
/*
 * Activity 7 – Search for a Specific Sale
Goal: Search the array for a specific sale amount (for example, ₹150).
If found, print which day it occurred.

Expected Output:
Sale 150 found on Day 3
 */
		int saleday = 1;
		for(int i = 0; i<s; i++) {
			if(sales[i] == 150) {
				saleday= i+1;
				System.out.println("Sale 150 found on Day: "+saleday);
			}
		}
/*
 * 
Activity 8 – Update Sales Record
Goal: Suppose the shop owner updated the sales for Day 2 to ₹95.
Update the array and display the new value.

Expected Output:
Updated sales for Day 2: 95
 */
		sales[1] = 95;
		System.out.println("Updated sales for Day 2: "+sales[1]);
		System.out.print("Updated array: ");
		for(int i = 0; i<s; i++) {
			System.out.print(sales[i] + " ");
			
		}

		
	}

}
