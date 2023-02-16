package Ex1;

import java.util.Scanner;

public class chain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x<0) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int sum = 0;
		//int z = x.length();
		while(x>0) {
		int y = x%10;
		x = x/10;
		if(y%2 != 0) {
			sum = sum+y;	
		 }
		System.out.println("y value:-"+ y);
		}
		System.out.println("sum of odd Digits:-"+sum);

	}

}
