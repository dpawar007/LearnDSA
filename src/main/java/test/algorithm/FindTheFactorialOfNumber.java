package test.algorithm;

import java.util.Scanner;

/*Step 1: Start
Step 2: Declare variables n, factorial and i.
Step 3: Initialize variables
          factorial ← 1
          i ← 1
Step 4: Read value of n
Step 5: Repeat the steps until i = n
     5.1: factorial ← factorial*i
     5.2: i ← i+1
Step 6: Display factorial
Step 7: Stop*/

public class FindTheFactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for which we need to calculate the factorial");
		int n = sc.nextInt(), fact = 1;
		int i;
		for (i=1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);
	}
}
