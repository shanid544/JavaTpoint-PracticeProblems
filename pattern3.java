class Pattern2 {
    public static void main(String[] args) {
        
        int i,j,n=6;
        for(i=0;i<n;i++){
            for(j=(n*2-1)/2;j>i;j--){
                
                System.out.print(" ");
            }
            for(j=0;j<i+1;j++){
                System.out.print("* ");
            }
			
			for(j=((n*2-1)/2)-1;j>i;j--){
                
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
