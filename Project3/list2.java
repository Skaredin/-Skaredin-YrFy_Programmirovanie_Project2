package Project3;
import java.util.Scanner;

public class list2 {
	public static void main(String[] args) {
		int A = 7;	
		int B = 5;
		
		System.out.println("Ведите число");
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
		int Chek = in.nextInt();
		
		

		if(Chek%A==0)	
		{
			int K = (Chek%A)+1 ;
			System.out.println("Остаток "+K);
			
		}
		else if(Chek%B==0)
		{
			
			int T=(Chek%B)+2;
			
			System.out.println("Остаток "+T);
		}
		else {System.out.println("Не попадает под параметр Деление на 5 и 7 ");}
	}
}}
