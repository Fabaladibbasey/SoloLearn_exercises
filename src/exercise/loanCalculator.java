package exercise;

import java.util.Scanner;

public class loanCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
		int result = amountRemaining(amount);
		System.out.println(result);
	}

	
	public static int amountRemaining(int amount) {
		int remaining = amount;
		double payment = 0;
		int i;
		for(i = 1; i < 7; i++) {
			payment = 0.1 * remaining;
			remaining -= payment;
			
			System.out.println("Payment: "+ payment + " Remaining: "+ remaining);
		}
		return remaining;
	}
	
}
