public class classReverseNumberExample2  {  

	public static void main(String[] args)   {
  
		int n =98765;
		int m=n;
		int rev = 0;
		int rem;
		
		for(;n!=0;n/=10){
			
			rem = n%10;
			rev = 10*rev+rem;
		}
		System.out.println(m);
		System.out.println(rev);
	}  
}   
