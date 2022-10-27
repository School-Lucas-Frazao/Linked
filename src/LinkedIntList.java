
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
		if( front == null)
		{
			front = New;
		}
		else
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
		int x = 0;
		ListNode holder = front;
		ListNode temp = front;
		while ( x != index)
		{
			temp = temp.next;
			holder = holder.next;
			if( x == index)
			{
				holder.next = new ListNode(value);
				holder.next = temp;
			}
		}
		
		front = holder;
		
	}
	
	public void get(int index)
	{
		int x = 0;
		ListNode counter = front;
		
		while (x != index)
		{
			//counter.next;
		}
		
		System.out.println(counter.data);
	}
	
	public void indexOf(int value)
	{	
		int index = 0;
		while (front.next != null)
		{
			front = front.next;
			if (front.data == value)
			{
				System.out.println(index);
			}
			else
			{
				index++;
			}
		}
		
	}
	
	public int remove(int index)
	{
		ListNode temp1 = new ListNode();
		ListNode temp2 = new ListNode();
		ListNode temp3 = new ListNode();
		temp1 = front;
		temp2 = front;
		
		
		for(int x = 0; x < index; x++)
		{
			temp1 = temp1.next;
			temp2 = temp1.next.next;
			temp3 = temp3.next;
			
		}
		
		temp1.next = temp2;
		front = temp1;
		return temp3.data;
	}
	
	public int size()
	{
		int count = 0;
		ListNode temp = new ListNode();
		
		while(temp.next != null)
		{
			temp = temp.next;
			count ++;
		}
		
		return count;
	}
	
	public String toString()
	{
		String x = "";
		ListNode temp = new ListNode();
		while(temp != null)
		{
			x = x + temp.data;
			temp = temp.next;
		}
		return x;
		
	}
	
	
	
}
