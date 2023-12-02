package timus_1409;
import java.io.PrintWriter;
import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int a= in.nextInt();
		int b= in.nextInt();
		
		int nu = a + b - 1;
		int harry = nu-a;
		int larry = nu-b;
		
		
		
		out.println(harry+" "+larry);
		out.flush();
		
		
	}
}
