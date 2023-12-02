package timus_1785;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

public class timus_1785 {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter outPrintWriter = new PrintWriter(System.out);
		
		String a1 = ("few");
		String a2 = ("several");
		String a3 = ("pack");
		String a4 = ("lots");
		String a5 = ("horde");
		String a6 = ("throng");
		String a7 = ("swarm");
		String a8 = ("zounds");
		String a10 = ("legion");
		String a9 = (": ");
					
	for(int i=0; i<2; i++) {	
	int a = in.nextInt();
	
	if(a>=1 && a<=4) {
		System.out.println(a1+a9+a); 
	}
	else if(a>=5 && a<=9) {
		System.out.println(a2+a9+a); 
	}
	else if(a>=10 && a<=19) {
		System.out.println(a3+a9+a); 
	}
	else if(a>=20 && a<=49) {
		System.out.println(a4+a9+a); 
	}
	else if(a>=50 && a<=99) {
		System.out.println(a5+a9+a); 
	}
	else if(a>=100 && a<=249) {
		System.out.println(a6+a9+a); 
	}
	else if(a>=250 && a<=499) {
		System.out.println(a7+a9+a); 
	}
	else if(a>=500 && a<=999) {
		System.out.println(a8+a9+a); 
	}else if(a>=1000) {
		System.out.println(a10+a9+a); 
	}else {System.out.println("No deaposone");}
		
	}
	}

}
