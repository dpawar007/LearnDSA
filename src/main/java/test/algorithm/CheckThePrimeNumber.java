package test.algorithm;

import java.util.Scanner;

/*Step 1: Start
Step 2: Declare variables n, i, flag.
Step 3: Initialize variables
        flag ← 1
        i ← 2  
Step 4: Read n from the user.
Step 5: Repeat the steps until i=(n/2)
     5.1 If remainder of n÷i equals 0
            flag ← 0
            Go to step 6
     5.2 i ← i+1
Step 6: If flag = 0
           Display n is not prime
        else
           Display n is prime
Step 7: Stop */

public class CheckThePrimeNumber {
	public static void main(String[] args) {
		boolean flag = false;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check it is prime or not");
		int n = sc.nextInt();
		for(i=2; i<n; i++) {
			if (n % i == 0) {
				flag = true;
			}	
		}		
		if (flag) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
}
