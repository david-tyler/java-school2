//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int x = 0; x<list.size(); x++)
		{
			total+=list.get(x);
		}
		return total;
	}

	public double getAvg(  )
	{
		double total=0;
		double avg;
		for(int x = 0; x<list.size(); x++)
		{
			total+=list.get(x);
		}
		avg = total/list.size();
		return avg;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int x = 0; x<list.size();x++)
		{
			if(list.get(x)>largest)
				largest = list.get(x);
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest =Integer.MAX_VALUE;
		for(int x = 0; x<list.size();x++)
		{
			if(list.get(x)<smallest)
				smallest = list.get(x);
		}
		return smallest;
	}

	public String toString()
	{
		String output=list.toString();
		return output;
	}
}