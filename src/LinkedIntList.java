//Lucas Frazao, 7th period, file will be called on to manipulate nodes, LinkedIntList

public class LinkedIntList <T>
{
	
	ListNode<T> front = new ListNode<T>();
	
	public LinkedIntList()
	{
		front = null;//sets front to null
	}

	public LinkedIntList(T t) 
	{
		front = new ListNode<T>(t);//sets front to a listnode
	}
	
	public void add(T t)
	{
		ListNode<T> New = new ListNode<T>();//makes the listnode nw
		ListNode<T> temp = new ListNode<T>();//sets temp to listnode new
		New.data = t;//sets the data in new equal to the parameter
		temp = front;//sets temp equal to front
		if( front == null)//if list is empty
		{
			front = New;
		}
		else//if list is not empty
		{
			
			while( temp.next != null)
			{
				temp = temp.next;
			}
			
			temp.next = new ListNode<T>(t);
		}
	}
	
	public void add(int index, T value)
	{
		ListNode<T> Value = new ListNode<T>(value);//makes a listnode out of the parameter
		int x = 0;//used to keep track in loop
		ListNode<T> temp = front;//sets temp equal to front
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();//if index given is out of bounds
		}
		if(index == 0)//deals with the front part of list
		{
			front = Value;
			front.next = temp;
		}
		else
		{
		
			while ( x != index-1)
			{
				temp = temp.next;
				x++;
			}
			
			Value.next = temp.next;
			temp.next = Value;
		}
	}
	
	public T get(int index)
	{
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();//if index given is not good
		}
		int x = 0;//keeps track in loop
		ListNode<T> temp = front;//sets temp to front
		while (x != index)//iterates through nodes
		{
			temp = temp.next;
			x++;
		}
		return temp.data;
	}
	
	public int indexOf(T value)
	{	
		
		int x = 0;//keeps track in loop
		ListNode<T> temp = front;//sets temp to front
		if(temp.data == value)//takes care of the front of list
		{
			return 0;
		}
		else
		{
			while(temp.data != value)
			{
				temp = temp.next;
				x++;
				if (temp.next == null && temp.data != value)
				{
					return -1;
				}
			}
			return x;
		}	
	}
	
	public T remove(int index)
	{
		int x = 0;
		ListNode<T> ret = new ListNode<T>();//this will be used to keep track of the front part of list
		ListNode<T> temp = front;
		
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();// if parameter given is not good
		}
		
		if (index == 0)
		{
			front = front.next;
			return temp.data;
		}
		else
		{
			while(x != index-1)
			{
				temp = temp.next;
				x++;
				ret = temp.next;
				
			}
			temp.next = temp.next.next;
			return ret.data;
		}
		
	}
	
	public int size()
	{
		int x = 1;//starts at one because it will count the size
		ListNode<T> temp = front;
		while(temp != null)
		{
			x++;
			temp = temp.next;
			
		}
		return x;
		
	}

	
	public String toString()
	{
		String x = "";//will be what is returned
		ListNode<T> temp = new ListNode<T>();
		temp = front;
		while(temp != null)
		{
			x = x + temp.data + ",";
			temp = temp.next;
		}
		return x;
		
	}
	
	public void clear()//clears the list
	{
		ListNode<T> Clear = new ListNode<T>();//makes a null node
		front = Clear; //sets front to null node
	}
	
	/*
	
	public void sort()//sorts the list
	{
		 // Node current will point to head
        ListNode<T> current = front;
        ListNode<T> index = null;
 
        int temp;
 
        if (front == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;
 
                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
		
	}
	
	*/
	
	
	
}
