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
    		LinkedIntList one = new LinkedIntList(1);
    	
		
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      	//using either of the instantiated LinkedIntList objects
    		
    		one.add(1);
    		System.out.println(one.toString());
    		two.add(1);
    		System.out.println(two);
    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
