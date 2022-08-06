//It is similar to the newInstance() method of the Class class. It is known as a reflective way to create objects. The method is defined in the Constructor class which //is the class of java.lang.reflect package. We can also call the parameterized constructor and private constructor by using the newInstance() method. It is widely //preferred in comparison to newInstance() method of the Class class.

//Syntax: public T newInstance(Object... initargs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  

//The method parses an array of Objects as an argument. The values of primitive types wrapped in a wrapper Object of the appropriate type. It returns a new object //created by calling the constructor. It throws IllegalAccessException, IllegalArgumentException, InstantiationException, InvocationTargetException, //ExceptionInInitializerError Exceptions.

//We can create an object in the following way:

//Constructor<Employee> constructor = Employee.class.getConstructor();   
//Employee emp3 = constructor.newInstance();  

//Let's create a program that creates an object using the newInstance() method.

import java.lang.reflect.*;

public class CreateObjectExample5 {

	String str;
	
	CreateObjectExample5(){
		
	}

	void setName(String str){
		this.str=str;
	}
	
	public static void main(String[] args){
	
	    try{
			Constructor<CreateObjectExample5> constructor = CreateObjectExample5.class.getDeclaredConstructor();
            CreateObjectExample5 obj = constructor.newInstance();  
			
			obj.setName("shanid");
			System.out.println(obj.str);
		}
		catch(Exception e){
			e.printStackTrace();   
		}

		
	}
}
