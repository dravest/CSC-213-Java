
/**
 * An class that represents an item in a linked data structure, to which any type may be mapped.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class Node<E> 
{
	/** The next {@link Node} in the chain. */
	private Node<E> next;
	
	/** The previous {@link Node} in the chain. */
	private Node<E> prev;
	
	/** The element to associate (or store) with the {@link Node}. */
	private E element;
	
	/**
	 * Creates a new empty and unlinked {@link Node}.
	 */
	public Node()
	{
		this.next    = null;
		this.prev    = null;
		this.element = null;
	}
	
	/**
	 * Retrieves the "next" {@link Node} which this {@link Node} references.
	 * 
	 * @return The "next" {@link Node} which this {@link Node} references, or <tt>null</tt> if this {@link Node}
	 * 		   doesn't reference another {@link Node}.
	 */
	public Node<E> getNext()
	{
		return next;
	}
	
	/**
	 * Sets the "next" {@link Node} to which this {@link Node} references.
	 * 
	 * @param next The "next" {@link Node} to which this {@link Node} references.  Pass <tt>null</tt> to de-link this
	 * 			   {@link Node} from another.
	 */
	public void setNext( Node<E> next )
	{
		this.next = next;
	}
	
	/**
	 * Retrieves the "previous" {@link Node} which this {@link Node} references.
	 * 
	 * @return The "previous" {@link Node} which this {@link Node} references, or <tt>null</tt> if this {@link Node}
	 * 		   doesn't reference another {@link Node}.
	 */
	public Node<E> getPrev()
	{
		return prev;
	}
	
	/**
	 * Sets the "previous" {@link Node} to which this {@link Node} references.
	 * 
	 * @param next The "previous" {@link Node} to which this {@link Node} references.  Pass <tt>null</tt> to de-link
	 * 			   this {@link Node} from another.
	 */
	public void setPrev( Node<E> prev )
	{
		this.prev = prev;
	}
	
	/**
	 * Retrieves the element that is associated with this {@link Node}.
	 * 
	 * @return The element that is associated with this {@link Node}, or <tt>null</tt> if no element is associated.
	 */
	public E getElement()
	{
		return element;
	}
	
	/**
	 * Sets the element that is associated with this {@link Node}.
	 * 
	 * @param element The element to associate with this {@link Node}.
	 */
	public void setElement( E element )
	{
		this.element = element;
	}
}
