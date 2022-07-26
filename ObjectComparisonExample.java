public class ObjectComparisonExample{

	public static void main(String args[]){
	
		Double d = new Double(123.456);
		Long l = new Long(45896);
		boolean b1 = d.equals(l);
		boolean b2 = l.equals(45896L);// 'L' must aan
		boolean b3 = d.equals(123.456);
		System.out.println(b1+" "+b2 +" "+ b3);
	}


}
