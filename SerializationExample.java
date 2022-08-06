//In Java, serialization is the process of converting an object into a sequence of byte-stream. The reverse process (byte-stream to object) of serialization is called //deserialization. The JVM creates a new object when we serialize or deserialize an object. It does not use constructor to create an object. While using deserialization, //the Serializable interface (marker interface) must be implemented in the class.

//Serialization: The writeObject() method of the ObjectOutputStream class is used to serialize an object. It sends the object to the output stream.

//Syntax: public final void writeObject(object x) throws IOException  

//Deserialization: The method readObject() of ObjectInputStream class is used to deserialize an object. It references objects out of a stream.

//Syntax: public final Object readObject() throws IOException,ClassNotFoundException  

//Note: Make the filed static or transient if we do not want to include a field as a part of the object. It will not include in the serialization process.

import java.io.*;    
class SerializationExample{

	public static void main(String[] args){
		
		try{
			Employee emp = new Employee(198054,"Andrew");
			FileOutputStream fout = new FileOutputStream("emplyee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(emp);
			out.flush();
			out.close();
			System.out.println("Successfully Created");   
        }catch (Exception e){
			System.out.println(e);
		}			
	}

}

import java.io.Serializable;    
public class Employee implements Serializable  {    
	int empid;    
	String empname;    
	public Employee(int empid, String empname)   {    
		this.empid = empid;    
		this.empname = empname;    
	}	
}  

