package Project3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class list5 {

	public static void main(String[] args) {
	
		System.out.print("Введите число после 1000");
		Scanner ini = new Scanner(System.in);
		int A = ini.nextInt();
		 
		List<Integer> B = new ArrayList<>();
		int Suport= 0 ;
		
		
		Suport = A/1000;
	
			while(A !=0) 
		
			{
				
				//for (int i= A; i > 1; i /= 1000 ){Suport = A/1000;int Stek=0;Stek = i+1;i++;}
						
			
				
			if(A%10>0) 
			
			{
				
			B.add(A%10);
			
			}
			A/=10;
		
			}
		
			int Opt = A%10;
			
		Object obj = Collections.min(B);
		
		System.out.println("Минимальное число: " + obj );

		System.out.println("Сколько тысячных: " + Suport);
		
		System.out.println("Конец тысячного: " + Suport%10);
		}}