package Ex1;

import java.lang.Math;
import java.util.Scanner;

public class chain2 {

	public static void main(String[] args) {
		System.out.print("Enter Number:-");
	    Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int z = (int) Math.sqrt(x);
		System.out.println(Math.sqrt(x));
		
		int z1 = (int) Math.pow(z,2);
		if(x == z1) {
			System.out.println("Yes (power2)");
		}else {
			System.out.println("No");
		}
//		String y = ((Object)z).getClass().getSimpleName();
//		System.out.println("type:-"+y);
		

	}
}
