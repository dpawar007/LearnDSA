package test.algorithm;

import java.util.Scanner;

/*Step 1: Start
Step 2: Declare variables a,b and c.
Step 3: Read variables a,b and c.
Step 4: If a > b
           If a > c
              Display a is the largest number.
           Else
              Display c is the largest number.
        Else
           If b > c
              Display b is the largest number.
           Else
              Display c is the greatest number.  
Step 5: Stop*/
public class FindLargestNumberAmongThree {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("First Number is Greater");
			} else {
				System.out.println("Third Number is Greater");
			}
		} else {
			if (num2 > num3) {
				System.out.println("Second Number is Greater");
			} else {
				System.out.println("Third Number is Greater");
			}
		}
	}
}
