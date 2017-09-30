public class CSNode
{
	private CSNode next;
	private CSNode prev;
	private Object storedObject;
	
	public CSNode(CSNode next, CSNode prev, Object storedObject)
	{
		this.next = null;
		this.prev = null;
		this.storedObject = null;
	}
	public CSNode getNode()
	{
		return this.next;
	}
	public CSNode setNode(CSNode next)
	{
		this.next = next;
		return this.next;
	}
	public CSNode getPrev()
	{
		return this.prev;
	}
	public CSNode setPrev(CSNode prev)
	{
		this.prev = prev;
		return this.prev;
	}
	public Object getElement()
	{
		return this.storedObject;
	}
	public Object setElement(Object stroedObject)
	{
		this.storedObject = storedObject;
		return this.storedObject;
	}
}