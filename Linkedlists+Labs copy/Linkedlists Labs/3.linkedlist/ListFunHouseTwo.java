//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = null;
	}
	
	public void add(Comparable data)
	{
		theList = new ListNode(data,theList);

	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		ListNode list = theList;
   		int count=0;
   		while(list!=null)
   		{
   			count++;
   			list = list.getNext();
   		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		ListNode a = new ListNode(list.getValue(), list.getNext());
		theList.setNext(a);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;
		while(list.getNext()!=null)
		{
			list=list.getNext();
		}
   		list.setNext(new ListNode(list.getValue(), null));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		ListNode list = theList;
		int count = 1;
		while(list!=null)
		{
			if(count%2==1)
			{
				if(list.getNext() == null)
					break;
				list.setNext(list.getNext().getNext());
				
			}
			list = list.getNext();
			count++;
		}
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		ListNode list = theList;
		int count=1;
		while(list!= null)
		{
			if(count% x ==0)
			{
				list.setValue(value);
			}
			list = list.getNext();
			count++;
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		ListNode list = theList;
		int count=1;
		while(list!=null)
		{
			if(count%x==1)
			{
				if(list.getNext() == null)
					break;
				list.setNext(list.getNext().getNext());
				count++;
			}
			list = list.getNext();
			count++;
		}
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   		String output = "";
   		ListNode list = theList;
   		while(list != null)
   		{
   			output += list.getValue() + " ";
   			list = list.getNext();
   		}
		return output;
   }		
}