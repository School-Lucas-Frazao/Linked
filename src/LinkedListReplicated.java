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
    	
    	LinkedList<String> one = new LinkedList<String>();
    	LinkedList<Integer> two = new LinkedList<Integer>();
    	
    	

    	
		
      	//Test out each of your various methods (add, insert, get, indexOf, remove, size, toString)) 
      	//using either of the instantiated LinkedIntList objects
    	
    	
    	two.add(1);
    	two.add(2);
    	two.add(3);
    	System.out.println(two);
    	two.add(2,3);
    	two.add(0,0);
    	two.add(5);
    	System.out.println(two);
    	two.remove(0);
    	System.out.println(two);
    	System.out.println(two.get(0));
    	System.out.println(two.get(4));
    	System.out.println(two.indexOf(5));
    	System.out.println(two.size());
    	System.out.println(two.remove(0));
    	System.out.println(two);
    	two.clear();
    	System.out.println(two);
    	
    	
    	one.add("one");
    	one.add("two");
    	one.add("three");
    	System.out.println(one);
    	one.add(2,"three");
    	one.add(0,"zero");
    	one.add("five");
    	System.out.println(one);
    	one.remove(0);
    	System.out.println(one);
    	System.out.println(one.get(0));
    	System.out.println(one.get(4));
    	System.out.println(one.indexOf("five"));
    	System.out.println(one.size());
    	System.out.println(one.remove(0));
    	System.out.println(one);
    	two.clear();
    	System.out.println(one);
    	
    	
    	

    }
    
	//Create your LinkedIntList class in another file called "LinkedIntList"
}
