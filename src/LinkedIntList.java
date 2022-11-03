//Lucas Frazao, 7th period, file will be called on to manipulate nodes, LinkedIntList
public class LinkedIntList 
{
	ListNode front = new ListNode();
	
	public LinkedIntList()
	{
		front = null;//sets front to null
	}

	public LinkedIntList(int value) 
	{
		front = new ListNode(value);//sets front to a listnode
	}
	
	public void add(int newValue)
	{
		ListNode New = new ListNode();//makes the listnode nw
		ListNode temp = new ListNode();//sets temp to listnode new
		New.data = newValue;//sets the data in new equal to the parameter
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
			
			temp.next = new ListNode(newValue);
		}
	}
	
	public void add(int index, int value)
	{
		ListNode Value = new ListNode(value);//makes a listnode out of the parameter
		int x = 0;//used to keep track in loop
		ListNode temp = front;//sets temp equal to front
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
	
	public int get(int index)
	{
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();//if index given is not good
		}
		int x = 0;//keeps track in loop
		ListNode temp = front;//sets temp to front
		while (x != index)//iterates through nodes
		{
			temp = temp.next;
			x++;
		}
		return temp.data;
	}
	
	public int indexOf(int value)
	{	
		
		int x = 0;//keeps track in loop
		ListNode temp = front;//sets temp to front
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
	
	public int remove(int index)
	{
		int x = 0;
		ListNode ret = new ListNode();//this will be used to keep track of the front part of list
		ListNode temp = front;
		
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
		ListNode temp = front;
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
		ListNode temp = new ListNode();
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
		ListNode Clear = new ListNode();//makes a null node
		front = Clear; //sets front to null node
	}
	
	public void sort()//sorts the list
	{
		 // Node current will point to head
        ListNode current = front;
        ListNode index = null;
 
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
	
	
	
}
