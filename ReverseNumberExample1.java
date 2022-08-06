//https://www.javatpoint.com/how-to-reverse-a-number-in-java

public class classReverseNumberExample1  {  

	public static void main(String[] args)   {
  
		int n =98765;
		int m=n;
		int rev = 0;
		int rem;
		
		while(n!=0){
			
			rem = n%10;
			rev = 10*rev+rem;
			n/=10;
		}
		System.out.println(m);
		System.out.println(rev);
	}  
}   
