package Project3;
import java.util.Scanner;

public class lision1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Введите число которое делится на 3");
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
		int Chek = in.nextInt();
		
		
		if(Chek % 3 == 0) 
		{
			System.out.println("Число делится на 3, получается число( " + Chek/3 + " )");
			
			
			
		} 
		
		else 
		{
			System.out.println("число " + Chek+" не делится на 3" );
		}
	}
}}
