/*
 * LinkedListReplicated.java, Lucas Frazao, Period 7, file will serve to test all methods in
 * LinkedIntList.java
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
    		
    		/*
    		one.add(1);
    		one.add(2);
    		one.add(3);
    		one.add(4);
    		one.add(5);
    		one.add(1, 3);
    		System.out.println(one.get(3));
    		System.out.println(one.indexOf(5));
    		System.out.println(one.toString());
    		System.out.println(one.remove(3));
    		System.out.println(one);
    		System.out.println(one.size());
    		one.add(1);
    		System.out.println(one);
    		*/
    		
    		
    		one.add(1);
    		one.add(2);
    		one.add(0,0);
    		System.out.println(one);
    		System.out.println(one.indexOf(1));
    		one.add(3);
    		one.add(4);
    		System.out.println(one);
    		System.out.println(one.remove(0));
    		System.out.println(one.remove(0));
    		System.out.println(one.remove(1));
    		System.out.println(one);
    		one.clear();
    		System.out.println(one);
    		
    		two.add(1);
    		two.add(3);
    		two.add(0);
    		System.out.println(two);
    		two.sort();
    		System.out.println(two);
    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
