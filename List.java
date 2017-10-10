
 * <your name>
 * <the date>
 * <the file name>
 *
 * <a simple, short program/class description>
 *************************************************** */

// the Node class
class Node
{
	private int data;
	private Node link;

	// constructor
	public Node()
	{
		this.data = 0;
		this.link = null;
	}

	// accessor and mutator for the data component
	public int getData()
	{
		return this.data;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	// accessor and mutator for the link component
	public Node getLink()
	{
		return this.link;
	}

	public void setLink(Node link)
	{
		this.link = link;
	}
}

// the List class
public class List
{
	public static final int MAX_SIZE = 50;

	private Node head;
	private Node tail;
	private Node curr;
	private int num_items;

	// constructor
	// remember that an empty list has a "size" of -1 and its "position" is at -1
	public List()
	{
		head = new Node();
		tail = head;
		curr = head;
		curr.setData(-1);
	}

	// copy constructor
	// clones the list l and sets the last element as the current
	public List(List l)
	{

	}

	// navigates to the beginning of the list
	public void First()
	{
		if(!IsEmpty())
			curr = head;
	}

	// navigates to the end of the list
	// the end of the list is at the last valid item in the list
	public void Last()
	{
		curr = tail;
	}

	// navigates to the specified element (0-index)
	// this should not be possible for an empty list
	// this should not be possible for invalid positions
	public void SetPos(int pos)
	{
	}

	// navigates to the previous element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Prev()
	{
	}

	// navigates to the next element
	// this should not be possible for an empty list
	// there should be no wrap-around
	public void Next()
	{
		if(!IsEmpty() && curr.getData() != tail.getData())
			curr = curr.getLink();
	}

	// returns the location of the current element (or -1)
	public int GetPos()
	{
		return -1;
	}

	// returns the value of the current element (or -1)
	public int GetValue()
	{
		if(IsEmpty())
			return -1;
		else
			return curr.getData();
	}

	// returns the size of the list
	// size does not imply capacity
	public int GetSize()
	{
		return num_items;
	}

	// inserts an item before the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertBefore(int data)
	{
		if(IsEmpty())
		{
			tail.getLink() = new Node();
			curr = tail.getLink();
			tail = tail.getLink();
			curr.setData(data);
			num_items++;
		}
		else
		{
			if(!IsFull())
			{
				for (int i = num_items; i >= curr; i--)
					bleh
				curr.setData(data);
				tail.getLink() = new Node();
				tail = tail.getLink();
				num_items++;
			}
		}
	}

	// inserts an item after the current element
	// the new element becomes the current
	// this should not be possible for a full list
	public void InsertAfter(int data)
	{
		if(!IsFull())
		{
			if (curr.getData() == tail.getData())
			{
				tail.setLink(new Node());
				curr = tail.getLink();
				tail = tail.getLink();
				curr.setData(data);
				num_items++;
			}
			else
			{
				Next();
				InsertBefore(data);
				num_items++;
			}
		}
	}

	// removes the current element (collapsing the list)
	// this should not be possible for an empty list
	public void Remove()
	{
	}

	// replaces the value of the current element with the specified value
	// this should not be possible for an empty list
	public void Replace(int data)
	{
		if(!IsEmpty())
			curr.setData(data);
	}

	// returns if the list is empty
	public boolean IsEmpty()
	{
		if (tail.getData() == -1)
			return true;
		return false;
	}

	// returns if the list is full
	public boolean IsFull()
	{
		return (num_items >= MAX_SIZE - 1);
	}

	// returns if two lists are equal (by value)
	public boolean Equals(List l)
	{
		if (num_items != l.num_items)
			return false;

		curr = head;
		l.curr = l.head;
		for(int i = 0; i < GetSize(); i++)
		{
			if(curr != l.curr)
				return false;
			curr = curr.getLink();
			l.curr = l.curr.getLink();
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
		List m = new List(this);
		return m;
	}

	// returns a string representation of the entire list (e.g., 1 2 3 4 5)
	// the string "NULL" should be returned for an empty list
	public String toString()
	{
		if(IsEmpty())
			return "NULL";
		else
		{
			String s = "";
			curr = head;
			for(int i = 0; i < GetSize(); i++)
				s += (curr.getData() + " ");
				curr = curr.getLink();
			return s;
		}
	}
}
