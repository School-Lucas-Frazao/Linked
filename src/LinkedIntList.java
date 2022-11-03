//Lucas Frazao, 7th period, method will manipulate nodes
public class LinkedIntList 
{
	ListNode front = new ListNode();
	
	public LinkedIntList()
	{
		front = null;
	}

	public LinkedIntList(int value) 
	{
		front = new ListNode(value);
	}
	
	public void add(int newValue)
	{
		ListNode New = new ListNode();
		ListNode temp = new ListNode();
		New.data = newValue;
		temp = front;
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
		ListNode Value = new ListNode(value);
		int x = 0;
		ListNode temp = front;
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		if(index == 0)
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
			throw new IndexOutOfBoundsException();
		}
		int x = 0;
		ListNode temp = front;
		while (x != index)
		{
			temp = temp.next;
			x++;
		}
		return temp.data;
	}
	
	public int indexOf(int value)
	{	
		
		int x = 0;
		ListNode temp = front;
		if(temp.data == value)
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
		ListNode ret = new ListNode();
		ListNode temp = front;
		
		if(index > size() || index < 0)
		{
			throw new IndexOutOfBoundsException();
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
		int x = 1;
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
		String x = "";
		ListNode temp = new ListNode();
		temp = front;
		while(temp != null)
		{
			x = x + temp.data + ",";
			temp = temp.next;
		}
		return x;
		
	}
	
	
	
}
