
/**
 * A class that defines an object that represents a node in
 * a tree data structure.
 * 
 * @author Benjamin rood
 *
 * @param <T> The generic type for the data contained by a tree node.
 */
public class CSTreeNode<T>
{
    /** Marks this {@link CSTreeNode} instance as the root node in the tree. */
    private boolean isRoot;
    
    /** The parent of this node. */
    private CSTreeNode<T> parent;
    
    /** The left child of this node. */
    private CSTreeNode<T> leftChild;
    
    /** The right child of this node. */
    private CSTreeNode<T> rightChild;
    
    /** The data value associated with this node. */
    private T value;
    
    /**
     * Creates a new instance of a {@link CSTreeNode}.
     */
    public CSTreeNode()
    {
        isRoot     = false;
        parent     = null;
        leftChild  = null;
        rightChild = null;
    }

    /**
     * Returns <tt>true</tt> if this node is the 'root' node in the tree.
     * 
     * @return <tt>True</tt> if this node is the 'root' node in the tree, <tt>false</tt> otherwise.
     */
    public boolean isRoot()
    {
        return isRoot;
    }

    /**
     * Sets the 'root' property of this node instance.
     * 
     * @param isRoot Set to <tt>true</tt> if this node instance is the 'root' node in the tree, 
     *               <tt>false</tt> otherwise.
     */
    public void setRoot( boolean isRoot )
    {
        this.isRoot = isRoot;
    }

    /**
     * Retrieves the parent {@link CSTreeNode} instance of this node.
     * 
     * @return The parent {@link CSTreeNode} instance of this node, or <tt>null</tt> if this node does not
     *         have a parent (e.g. it's the 'root' node).
     */
    public CSTreeNode<T> getParent()
    {
        return parent;
    }

    /**
     * Sets the parent {@link CSTreeNode} instance of this node.
     * 
     * @param parent The parent {@link CSTreeNode} instance of this node.
     */
    public void setParent( CSTreeNode<T> parent )
    {
        this.parent = parent;
    }

    /**
     * Retrieves the left child {@link CSTreeNode} instance associated with this node instance.
     * 
     * @return The left child {@link CSTreeNode} instance associated with this node instance, or 
     *         <tt>null</tt> if this node does not have a left child.
     */
    public CSTreeNode<T> getLeftChild()
    {
        return leftChild;
    }

    /**
     * Sets the left child {@link CSTreeNode} instance associated with this node instance.
     * 
     * @param leftChild The left child {@link CSTreeNode} instance to associate with this node instance.
     */
    public void setLeftChild( CSTreeNode<T> leftChild )
    {
        this.leftChild = leftChild;
    }

    /**
     * Retrieves the right child {@link CSTreeNode} instance associated with this node instance.
     * 
     * @return The right child {@link CSTreeNode} instance associated with this node instance, or 
     *         <tt>null</tt> if this node does not have a right child.
     */
    public CSTreeNode<T> getRightChild()
    {
        return rightChild;
    }

    /**
     * Sets the right child {@link CSTreeNode} instance associated with this node instance.
     * 
     * @param rightChild The left child {@link CSTreeNode} instance to associate with this node instance.
     */
    public void setRightChild( CSTreeNode<T> rightChild )
    {
        this.rightChild = rightChild;
    }

    /**
     * Retrieves the value associated with this node.
     * 
     * @return The value associated with this node.
     */
    public T getValue()
    {
        return value;
    }

    /**
     * Sets the value associated with this node.
     * 
     * @param value The value to associate with this node.
     */
    public void setValue( T value )
    {
        this.value = value;
    }
}
