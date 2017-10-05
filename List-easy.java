/* ***************************************************
* John Spurgeon
* 9/27/17
* List.java
*
* Creates a List class that enables the manipulation of an array
 *************************************************** */

// the EasyList class
class List
{
	public static final int MAX_SIZE = 50;

	private int end;	// the index of the last valid item in the list
	private int curr;	// the index of the current item in the list

	//change char to int
	private int[] list;	// the list

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List()
	{
		this.end = -1;
		this.curr = -1;

		//change char to int
		this.list = new int[MAX_SIZE];
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{
		this.end = -1;
		this.curr = -1;

		//change char to int
		this.list = new int[MAX_SIZE];

		for (int i=0; i<l.GetSize(); i++)
			this.InsertAfter(l.list[i]);
	}

	// navigates to the beginning of the list
	public void First()
	{
		if (!this.IsEmpty())
			curr = 0;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last()
	{
		curr = end;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos)
	{
		if (!this.IsEmpty() && pos >= 0 && pos < GetSize())
			curr = pos;
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
		if (!this.IsEmpty() && GetPos() > 0)
			curr--;
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
		if (curr != end)
			curr++;
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		return curr;
	}

	// returns the value of the current element (or -1)

	//change char to int
	public int GetValue()
	{
		if (this.IsEmpty())
		//change the space char into the -1 that would represent an empty list
			return -1;
		else
			return list[curr];
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize()
	{
		return end + 1;
	}

	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list

	//change char to int
	public void InsertBefore(int data)
	{
		if (!this.IsFull())
		{
			if (this.IsEmpty())
				InsertAfter(data);
			else if (curr > 0)
			{
				curr--;
				InsertAfter(data);
			}
			else
			{
				for (int i=end; i>=curr; i--)
					list[i+1] = list[i];
				list[curr] = data;
				end++;
			}
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list

	//change char to int
	public void InsertAfter(int data)
	{
		if (!this.IsFull())
		{
			if (curr != end)
			{
				for (int i=end; i>curr; i--)
					list[i+1] = list[i];
			}

			curr++;
			end++;
			list[curr] = data;
		}
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
		if (!this.IsEmpty())
		{
			if (this.GetPos() == this.GetSize() - 1)
				curr--;
			else
			{
				for (int i=curr; i<end; i++)
					list[i] = list[i+1];
			}

			end--;
		}
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list

	//change char to int
	public void Replace(int data)
	{
		if (!this.IsEmpty())
			list[curr] = data;
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		return (this.GetSize() == 0);
	}

	// returns if the list is full
	public boolean IsFull()
	{
		return (MAX_SIZE == this.GetSize());
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		if (this.GetSize() != l.GetSize())
			return false;

		for (int i=0; i<GetSize(); i++)
		{
			if (this.list[i] != l.list[i])
				return false;
		}

		return true;
	}

	// returns the concatenation of two lists
	// l should not be modified
	// l should be concatenated to the end of *this
	// the returned list should not exceed MAX_SIZE elements
	// the last element of the new list is the current
	public List Add(List l)
	{
		List newList = new List(this);

		for (int i=0; i<l.GetSize(); i++)
			newList.InsertAfter(l.list[i]);

		return newList;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString()
	{
		if (this.IsEmpty())
			return "NULL";
		else
		{
			String s = "";

			for (int i=0; i<=end; i++)
				s += list[i] + " ";

			return s;
		}
	}
}
