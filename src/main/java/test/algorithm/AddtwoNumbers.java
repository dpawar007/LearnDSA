package test.algorithm;

import java.util.Scanner;

//Steps of algorithm
/*Step 1: Start
Step 2: Declare variables num1, num2 and sum. 
Step 3: Read values num1 and num2. 
Step 4: Add num1 and num2 and assign the result to sum.
        sum←num1+num2 
Step 5: Display sum 
Step 6: Stop*/

public class AddtwoNumbers {
	public static void main(String[] args) {
		// Step 2: Declare variables num1, num2 and sum
		int num1 = 0, num2 = 0, sum = 0;
		// Step 3: Read values num1 and num2.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		// Step 4: Add num1 and num2 and assign the result to sum. sum←num1+num2
		sum = num1 + num2;
		// Step 5: Display sum
		System.out.println("SUM IS : " + sum);
	}
}
