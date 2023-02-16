package Ex1;

import java.util.Scanner;

public class chain1 {
     
	public static void main(String[] args) {
		
		System.out.print("Enter the salary:-");
		Scanner obj = new Scanner(System.in);
        int salary = obj.nextInt();
        System.out.println("salary:-"+salary);
        System.out.print("Enter Shift:-");
        int shift = obj.nextInt();
        
        if(salary>0 && salary<=8000 && shift>0) {
        float exp = (float) (salary*0.5);
        float S_income =(float) (salary*0.02*shift);
        System.out.println("Total Income:-"+ (exp+S_income));
        }
        else if(salary>8000) {
        	System.out.println("Salary is too large.");
        }
        else if(salary<=0) {
        	System.out.println("salary is too small.");
        }
        else if(shift<0) {
        	System.out.println("Shift is too small.");
        }else {
            System.out.println("terminate.");
        }
	}

}
