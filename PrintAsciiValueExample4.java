import java.util.Scanner;

public class PrintAsciiValueExample4{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		int ascii = ch;
		
		System.out.println("ASCII Value of charecter "+ ch + " is " +ascii);
		
	}
}
