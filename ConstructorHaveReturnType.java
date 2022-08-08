public class TheClass {
    public TheClass(){
		System.out.println("shanid");
        return;
    }
    public void TheClass(){ //confusing, but this is void method not constructor
        return;
    }

    public static void main(String[]a){
        TheClass n = new TheClass();
        n.TheClass();//void method invocation
    }
}
