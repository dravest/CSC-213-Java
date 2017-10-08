import java.util.Comparator;

public class CSList<E> implements ICSList<E>
{	
	private CSNode<E> head;
	private CSNode<E> tail;
	private int nodeCount;
	
	public CSList()
	{
		nodeCount = 0;
		this.tail = new CSNode<E>();
		this.head = new CSNode<E>();
		head.setNext(tail);
		head.setPrev(null);
		tail.setPrev(head);
		tail.setNext(null);
	}
	public int size()
	{
		if (nodeCount < Integer.MAX_VALUE)
		{
			return nodeCount;
		}
		else
		{
			return Integer.MAX_VALUE;
		}
	}
	public boolean isEmpty()
	{
		if(head.getNext() == tail)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean contains( E o )
	{
		CSNode<E> runner = head;
		while (runner.getNext() != null)
		{
			if (runner.getElement() == o)
			{
				return true;
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return false;
	}
	public boolean add(E e)
	{
		CSNode<E> node = new CSNode<E>();
		node.setElement(e);
		
		CSNode<E> runner = tail.getPrev();
		node.setNext(tail);
		tail.setPrev(node);
		runner.setNext(node);
		node.setPrev(runner);
		nodeCount += 1;
		return true;
	}
	public boolean remove(E o)
	{
		CSNode<E> runner = head.getNext();
		while(runner != tail)
		{
			if (runner.getElement() == o)
			{
				CSNode<E> temp = runner.getNext();
				runner.setNext(temp);
				runner = runner.getPrev();
				temp.setPrev(runner);
				return true;
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return false;
	}
	public void clear()
	{
		head.setNext(tail);
		tail.setPrev(head);
		nodeCount = 0;
	}
	public E get(int index)throws IndexOutOfBoundsException
	{
		if (index > nodeCount | index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int count = -1;
		CSNode<E> runner = head.getNext();
		while (runner != tail)
		{
			count = count + 1;
			if (count == index)
			{
				return runner.getElement();
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return null;
	}
	public E set(int index, E element)throws IndexOutOfBoundsException
	{
		if (index > nodeCount | index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int count = -1;
		CSNode<E> runner = head.getNext();
		while (runner != tail)
		{
			count += 1;
			if (count == index)
			{
				E temp = runner.getElement();
				runner.setElement(element);
				return temp;
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return null;
	}
	public void add(int index, E element)throws IndexOutOfBoundsException
	{
		if (index > nodeCount | index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		CSNode<E> node = new CSNode<E>();
		node.setElement(element);
		int count = -1;
		CSNode<E> runner = head;
		while (runner.getNext() != null)
		{
			
			count += 1;
			if (count == index)
			{
				CSNode<E> temp = runner.getPrev();
				temp.setNext(node);
				node.setNext(runner);
			}
			else
			{
				runner = runner.getNext();
			}
		}
	}
	public E remove(int index)throws IndexOutOfBoundsException
	{
		if (index > nodeCount | index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		int count = -1;
		CSNode<E> runner = head.getNext();
		while (runner.getNext()!= null)
		{
			count += 1;
			if (count == index)
			{
				CSNode<E> temp = runner.getPrev();
				temp.setNext(runner.getNext());
				return runner.getElement();
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return null;
	}
	public int indexOf(E o)
	{
		int count = -1;
		CSNode<E> runner = head.getNext();
		while(runner.next != null)
		{
			count += 1;
			if (runner.getElement() == o)
			{
				return count;
			}
			else
			{
				runner = runner.getNext();
			}
		}
		return -1;
	}
	public void sort(Comparator<E> comparator)throws NullPointerException
	{
		CSNode<E> newHead = new CSNode<E>();
		CSNode<E> newTail = new CSNode<E>();
		newHead.setNext(newTail);
		newTail.setPrev(newHead);
		CSNode<E> runner = head.getNext();
		while(runner != tail)
		{
			CSNode<E> temp = runner;
			head.setNext(temp.getNext());
			temp.setPrev(head.getNext());
			CSNode<E> first = new CSNode<E>();
			first.setElement(runner.getElement());
			newHead.setNext(first);
			first.setNext(newTail);
			newTail.setPrev(first);
			while(runner != tail )
			{
				CSNode<E> current = newTail.getPrev();
				if (comparator.compare(current.getElement(), runner.getElement()) == 0)
				{//equals
					CSNode<E> node = new CSNode<E>();
					node.setElement(runner.getElement());
					node.setNext(current.getNext());
					node.setPrev(current);
					current.setNext(node);
				}
				else if (comparator.compare(current.getElement(), runner.getElement()) == 1)
				{//greater than
					CSNode<E> node = new CSNode<E>();
					node.setElement(runner.getElement());
					node.setPrev(current.getPrev());
					node.setNext(current);
					current.setPrev(node);
				}
				else if (comparator.compare(current.getElement(), runner.getElement()) == -1)
				{//less than
					CSNode<E> node = new CSNode<E>();
					node.setElement(runner.getElement());
					node.setNext(current.getNext());
					node.setPrev(current);
					current.setNext(node);
				}
				runner = runner.getNext();
			}
		}
	}
}