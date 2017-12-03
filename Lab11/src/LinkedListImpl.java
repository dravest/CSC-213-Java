
import java.util.Comparator;

/**
 * An implementation of the {@link List} interface that defines
 * the interface using a linked list implementation.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class LinkedListImpl<E> implements List<E> 
{
	/** The head node in the linked list. */
	private Node<E> headNode;
	
	/** The tail node in the linked list. */
	private Node<E> tailNode;
	
	/** The number of nodes stored in the linked list, not including the head and tail nodes. */
	private long nodeCount;
	
	/**
	 * Creates a new instance of a {@link LinkedListImpl}.
	 */
	public LinkedListImpl()
	{
		this.headNode  = new Node<E>();
		this.tailNode  = new Node<E>();
		this.nodeCount = 0;
		
		this.headNode.setNext( this.tailNode );
		this.tailNode.setPrev( this.headNode );
	}
	
	@Override
	public int size() 
	{
		if ( nodeCount > Integer.MAX_VALUE )
			return Integer.MAX_VALUE;
		else
			return (int)nodeCount;
	}

	@Override
	public boolean isEmpty() 
	{
		return (nodeCount == 0);
	}

	@Override
	public boolean contains( Object o ) 
	{
		Node<E> trav = headNode;
		boolean ret  = false;
		
		while( trav.getNext() != null && trav.getNext() != tailNode )
		{
			Node<E> next = trav.getNext();
			
			if ( next.getElement().equals( o ) )
			{
				ret = true;
				break; // Stop searching once element is found
			}
			
			trav = next;
		}
		
		return ret;
	}

	@Override
	public boolean add( E e ) 
	{
		Node<E> tailPrev = tailNode.getPrev();
		Node<E> newNode  = new Node<E>();
		
		newNode.setElement( e );
		newNode.setNext( tailNode );
		newNode.setPrev( tailNode.getPrev() );
		
		tailPrev.setNext( newNode );
		tailNode.setPrev( newNode );
		
		nodeCount++;
		
		return true;
	}

	@Override
	public boolean remove( Object o ) 
	{
		Node<E> trav = headNode.getNext();
		
		while( trav != tailNode )
		{
			if ( trav.getElement().equals( o ) )
			{
				Node<E> prev = trav.getPrev();
				Node<E> next = trav.getNext();
				
				prev.setNext( next );
				next.setPrev( prev );
				
				nodeCount--;
				
				return true;
			}
			
			trav = trav.getNext();
		}
		
		return false;
	}

	@Override
	public void clear() 
	{
		headNode.setNext( tailNode );
		tailNode.setPrev( headNode );
		
		nodeCount = 0;
	}

	@Override
	public E get( int index ) 
	{
		if ( index < 0 || index > (nodeCount - 1) )
			throw new IndexOutOfBoundsException();
		
		Node<E> trav = headNode;
		int		idx  = -1;
		
		while( trav != tailNode )
		{
			if ( idx == index )
				return trav.getElement();
			
			trav = trav.getNext();
			idx++;
		}
		
		return null;
	}

	@Override
	public E set( int index, E element ) 
	{
		if ( index < 0 || index > (nodeCount - 1) )
			throw new IndexOutOfBoundsException();
		
		Node<E> trav = headNode;
		int     idx  = -1;
		
		while( trav != tailNode )
		{
			if ( idx == index )
			{
				E ret = trav.getElement();
				trav.setElement( element );
				return ret;
			}
			
			trav = trav.getNext();
			idx++;
		}
		
		return null;
	}

	@Override
	public void add( int index, E element ) 
	{
		if ( index < 0 || index > (nodeCount - 1) )
			throw new IndexOutOfBoundsException();
		
		Node<E> trav    = headNode;
		Node<E> newNode = new Node<E>();
		int     idx     = -1;
		
		newNode.setElement( element );
		
		while( trav != tailNode )
		{
			if ( idx == index )
			{
				Node<E> prev = trav.getPrev();
				
				prev.setNext( newNode );
				newNode.setPrev( prev );
				newNode.setNext( trav );
				trav.setPrev( newNode );
				
				nodeCount++;
				return;
			}
			
			trav = trav.getNext();
			idx++;
		}
	}

	@Override
	public E remove( int index ) 
	{
		if ( index < 0 || index > (nodeCount - 1) )
			throw new IndexOutOfBoundsException();
		
		Node<E> trav = headNode;
		int     idx  = -1;
		
		while( trav != tailNode )
		{
			if ( idx == index )
			{
				E       ret  = trav.getElement();
				Node<E> prev = trav.getPrev();
				Node<E> next = trav.getNext();
				
				prev.setNext( next );
				next.setPrev( prev );
				
				nodeCount--;
				
				return ret;
			}
			
			trav = trav.getNext();
			idx++;
		}
		
		return null;
	}

	@Override
	public int indexOf( Object o ) 
	{
		Node<E> trav = headNode.getNext();
		int     idx  = 0;
		
		while( trav != tailNode )
		{	
			if ( trav.getElement().equals( o ) )
			{
				return idx;
			}
			
			trav = trav.getNext();
			idx++;
		}
		
		return -1;
	}
	
	public List<E> insertionSort( Comparator<E> comparator )
	{
		/* TODO: sort this list instance by performing the following steps:
		 * 
		 * 1. Create a new head node (and potentially a tail node, depending on your implementation) to start the chain
		 * 	  of nodes for the new sorted list.
		 * 2. Remove each element from the original list
		 * 3. For each element removed from the original list, use the input comparator instance to determine where
		 *    the node should be placed in the sorted list
		 * 4. Once all elements from the original list have been consumed, return the newly sorted list.
		 * 
		 * The reason why a Comparator instance is used, is to facilitate changing the method by which the items
		 * stored in this implementation are sorted (ascending vs. descending), and/or to abstract the method by
		 * which the items are compared.
		 * 
		 * To use the input Comparator instance, all you need to use in the compare( E, E ) method.  This method
		 * returns -1 if the first element is "less than" the second, 0 if they are equal, and 1 if the first element
		 * is "greater than" the second.
		 * 
		 * To determine where to put the "orig" element into the sorted list, you should examine the elements in the
		 * sorted list according to the following algorithm:
		 * 
		 * Node orig = headNode.getNext();
		 * Node trav = newListHeadNode;
		 *
		 * 	while( trav.getNext() != null && 
		 * 		   (comparator.compare( trav.getNext().getElement(), orig.getElement() ) == -1 ) ){
		 * 		trav = trav.getNext();
		 *  }
		 *  // Now insert the new node into the sorted list.
		 */
		
		// Initialize the new list that will replace the original
		Node<E> newHead = new Node<E>();
		Node<E> newTail = new Node<E>();
		
		newHead.setNext( newTail );
		newTail.setPrev( newHead );
		
		// Node to walk through the original list, starting with the first node that contains a value
		Node<E> trav = headNode.getNext();
		
		while( trav != tailNode )
		{
			// Unlink the trav node from the original list
			Node<E> travNext = trav.getNext();
			
			headNode.setNext( travNext );
			travNext.setPrev( trav.getPrev() );
			
			// Insert the trav node into the new sorted list.
			Node<E> newTrav = newHead.getNext();
			if ( newTrav == newTail )
			{
				// Special case for empty list - just link things up
				newHead.setNext( trav );
				newTail.setPrev( trav );
				trav.setNext( newTail );
				trav.setPrev( newHead );
			}
			else
			{
				while( newTrav != newTail &&
					   comparator.compare( trav.getElement(), newTrav.getElement() ) == -1 )
				{
					newTrav = newTrav.getNext();
				}
				
				trav.setPrev( newTrav.getPrev() );
				trav.setNext( newTrav );
				newTrav.getPrev().setNext( trav );
				newTrav.setPrev( trav );
			}
			
			trav = travNext;
		}
		
		headNode = newHead;
		tailNode = newTail;
		
		return this;
	}
}
