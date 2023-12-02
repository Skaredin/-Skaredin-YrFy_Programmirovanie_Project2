package Project3;

import java.util.Iterator;
import java.util.Scanner;

public class list4 {
	public static void main(String[] args) {
		
		
		Scanner ini = new Scanner(System.in);	
		System.out.println("Введите любое число от 5 до 10 включительно");	
		
		for(int i=0; i<2; i++) {
		int A = ini.nextInt();
		
		
		if (5<=A & A<=10) 
		{
			System.out.println(A+" -- Число попадает под условие 5 и меньше 10 включительно \n");	
		}else 
		{
			System.out.println("Не попадает под условие \n");	
			
		}
	
		}
	
	}
}
