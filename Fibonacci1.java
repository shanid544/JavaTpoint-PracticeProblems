class HelloWorld {
    static int n1=0,n2=1,count=10,n3;
    public static void fib(int c){
        if(c>0){
        n3=n1+n2;
        
        n1=n2;
        n2=n3;
        System.out.print(","+n3);
        fib(c-1);
        }
    }
    
    public static void main(String[] args) {
        
        
        System.out.print(n1+","+n2);
        fib(count-2);
        
    }
}
