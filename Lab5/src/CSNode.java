public class CSNode<E>
{
	public CSNode<E> next;
	public CSNode<E> prev;
	public E storedObject;
	
	public CSNode()
	{
		this.next = null;
		this.prev = null;
		this.storedObject = null;
	}
	public CSNode(CSNode<E> next, CSNode<E> prev, E storedObject)
	{
		this.next = prev;
		this.prev = next;
		this.storedObject = storedObject;
	}
	public CSNode<E> getNext()
	{
		return this.next;
	}
	public CSNode<E> setNext(CSNode<E> next)
	{
		this.next = next;
		return this.next;
	}
	public CSNode<E> getPrev()
	{
		return this.prev;
	}
	public CSNode<E> setPrev(CSNode<E> prev)
	{
		this.prev = prev;
		return this.prev;
	}
	public E getElement()
	{
		return this.storedObject;
	}
	public E setElement(E storedObject)
	{
		this.storedObject = storedObject;
		return this.storedObject;
	}
}