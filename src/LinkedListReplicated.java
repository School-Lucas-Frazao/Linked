/*
 * LinkedListReplicated.java
 * 
 */

//import java.io.File;
//import java.io.IOException;


public class LinkedListReplicated  
{
 
    public static void main(String s[]) 
    {
    	
		//Students create 2 LinkedIntList objects.
    	
            LinkedIntList two = new LinkedIntList();
    		LinkedIntList one = new LinkedIntList();
    	
		
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      	//using either of the instantiated LinkedIntList objects
    		
    		one.add(1);
    		one.add(2);
    		one.add(3);
    		one.add(4);
    		one.add(2,1);
    		System.out.println(one.toString());
    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
