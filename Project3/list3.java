package Project3;

import java.util.Scanner;

public class list3 {
	public static void main(String[] args) {
		Scanner ini = new Scanner(System.in);
		System.out.println("ВВедите число после 10");
		
		for( int i=0; i<2; i++) {
		int A = ini.nextInt();
		
		//Scanner i = new Scanner(System.in);
		
		int B = 4;
		int C = 10;
	//	Scanner Cek = new Scanner(System.in);
		int Ceks = 0;
		
		if(A>=10 & A%B==Ceks )	
		{
		
			int T = A/B;
			System.out.println("Делится на 4: ="+T);
			
		}
		else  {System.out.println("Число не делится на 4 или больше 10");}
		
		}
		
		
		}
}
