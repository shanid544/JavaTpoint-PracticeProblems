//The clone() method is the method of Object class. It creates a copy of an object and returns the same copy. The JVM creates a new object when the clone() method is //invoked. It copies all the content of the previously created object into new one object. Note that it does not call any constructor. We must implement the Cloneable //interface while using the clone() method. The method throws CloneNotSupportedException exception if the object's class does not support the Cloneable interface. The //subclasses that override the clone() method can throw an exception if an instance cannot be cloned.

//Syntax: protected Object clone() throws CloneNotSupportedException  

//Note: The method creates a copy of the object not a new object.

public class CreateObjectExample3 implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException{
	
		return super.clone();
	}
	
	String str = "shanid";
	
	public static void main(String[] args){
	
		CreateObjectExample3 obj1 = new CreateObjectExample3();
		
		try{
		
			CreateObjectExample3 obj2 = (CreateObjectExample3)obj1.clone();
			System.out.println(obj2.str);
		}
		catch (CloneNotSupportedException e){
		
			e.printStackTrace(); 
		}
	}
}
