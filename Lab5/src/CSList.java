import java.util.*;
import java.util.Comparator;

public class CSList<E> implements ICSList<E>
{	
	private CSNode<E> head;
	private CSNode<E> tail;
	private int nodeCount;
	
	public CSList(CSNode head, CSNode tail, int nodeCount)
	{
		this.head = null;
		this.tail = null;
		nodeCount = 0;
	}
	public int size()
	{
		int count = 0;
		CSNode<E> runner = head.next;
		while (runner != null)
		{
			count ++;
			runner = runner.next;
		}
		nodeCount = count;
		return count;
	}
	public boolean isEmpty()
	{
		if(head == null)
		{
			return true;
		}
		else
		{
			return true;
		}
	}
	public boolean contains( E o )
	{
		CSNode<E> runner = head;
		while (runner != null)
		{
			if (runner == o)
			{
				return true;
			}
			else
			{
				runner = runner.next;
			}
		}
		return false;
	}
	public boolean add(E e)
	{
		CSNode<E> node = new CSNode<E>();
		node.setElement(e);
		CSNode<E> runner = tail.prev;
		runner.next = node;
		runner = node;
		runner.next = tail;
		return true;
	}
	public boolean remove(E o)
	{
		CSNode<E> runner = head;
		while(runner.next != null)
		{
			if (runner == o)
			{
				CSNode<E> temp = runner.prev;
				temp.next = runner.next;
				return true;
			}
			else
			{
				runner = runner.next;
			}
		}
		return false;
	}
	public void clear()
	{
		head = null;
		tail = null;
	}
	public E get(int index)
	{
		if (index > nodeCount)
		{
			System.out.println("ERROR: the index is greater than the list size");
			return null;
		}
		int count = 0;
		CSNode<E> runner = head.next;
		while (runner != null)
		{
			count ++;
			if (count == index)
			{
				return runner.getElement();
			}
			else
			{
				runner = runner.next;
			}
		}
		return null;
	}
	public E set(int index, E element)throws IndexOutOfBoundsException
	{
		if (index > nodeCount)
		{
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		CSNode<E> runner = head.next;
		while (runner != null)
		{
			count ++;
			if (count == index)
			{
				E temp = runner.getElement();
				E item = runner.setElement(element);
				return temp;
			}
			else
			{
				runner = runner.next;
			}
		}
		return null;
	}
	public void add(int index, E element)throws IndexOutOfBoundsException
	{
		if (index > nodeCount)
		{
			throw new IndexOutOfBoundsException();
		}
		CSNode<E> node = new CSNode();
		node.setElement(element);
		int count = 0;
		CSNode<E> runner = head;
		while (runner.next != null)
		{
			
			count ++;
			if (count == index)
			{
				CSNode<E> temp = runner.prev;
				temp.next = node;
				node.next = runner;
			}
			else
			{
				runner = runner.next;
			}
		}
	}
	public E remove(int index)throws IndexOutOfBoundsException
	{
		if (index > nodeCount)
		{
			throw new IndexOutOfBoundsException();
		}
		int count = 0;
		CSNode<E> runner = head.next;
		while (runner.next!= null)
		{
			count ++;
			if (count == index)
			{
				CSNode<E> temp = runner.prev;
				temp.next = runner.next;
				return runner.getElement();
			}
			else
			{
				runner = runner.next;
			}
		}
		return null;
	}
	public int indexOf(E o)
	{
		int count = 0;
		CSNode<E> runner = head.next;
		while(runner.next != null)
		{
			count ++;
			if (runner.getElement() == o)
			{
				return count;
			}
			else
			{
				runner = runner.next;
			}
		}
		return -1;
	}
	public void sort(Comparator<E> comparator)
	{
		
	}
}