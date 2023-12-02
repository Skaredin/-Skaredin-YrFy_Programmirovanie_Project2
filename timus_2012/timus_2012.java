package timus_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus_2012 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		for(int i=0; i<2; i++ ) {
			
			int numT = in.nextInt();		
			int dif = 12- numT;				
			int tim = dif * 45;				
			if(tim <=240) 
		
			{			
				System.out.println("Yes");		
			}else {			
				System.out.println("No");		
			}
		
		out.print("dif "+dif + "\n");	
		out.print("fim "+tim+ "\n");
		out.flush();
	}
	}
}
