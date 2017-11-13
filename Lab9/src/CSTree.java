import java.io.PrintWriter;
import java.util.Comparator;
import java.util.*;

public class CSTree<T>
{
	private Comparator<T> comparer;
	private CSTreeNode<T> root = null;
	private int count = 0;
	
    public CSTree( Comparator<T> comparator )
    {
    	comparer = comparator;
    }
    
    public void add( T value )
    {
    	if (root == null)
    	{
    		root = new CSTreeNode<T>();
    		root.setValue(value);
    		root.setRoot(true);
    	}
    	else
    	{
    		addHelper(root, value);
    	}
    	count += 1;
    }
    
    private void addHelper(CSTreeNode<T> root, T value)
    {

		CSTreeNode<T> Node = new CSTreeNode<T>();
		Node.setValue(value);
		if (root.getValue() == null)
		{}
		else
		{
		int compret = comparer.compare(root.getValue(), value);
		if (compret == 0)
		{
			System.out.println("ERROR: There can not be duplicate nodes");
		}
		else if (compret == -1)
		{
			if (root.getLeftChild() != null )
			{
				root = root.getLeftChild();
				addHelper(root, value);
			}
			Node.setParent(root);
			root.setLeftChild(Node);
			root = root.getLeftChild();
		}
		else if (compret == 1)
		{
			if (root.getRightChild() != null )
			{
				root = root.getRightChild();
				addHelper(root, value);
			}
			Node.setParent(root);
			root.setRightChild(Node);
			root = root.getRightChild();
		}
		}
    }
    public void remove( T value )
    {
        // TODO: remove the value from the tree - this is tricky! (AND OPTIONAL - 20 points if you complete it!)
    }
    
    public boolean contains( T value )
    {
    	if (root == null)
    	{
    		return false;
    	}
    	return containsHelper(root, value);
        
    }
    
    private boolean containsHelper(CSTreeNode<T> root, T value)
    {
    	if (root.getValue() == null)
    	{
    		return false;
    	}
    	
    	int compret = comparer.compare(root.getValue(), value);
    	if (root.getValue() == value)
    	{
    		return true;
    	}
    	if (compret == 0)
    	{
    		return true;
    	}
    	if (compret == -1)
    	{
    		if (root.getLeftChild() != null )
			{
				root = root.getLeftChild();
				containsHelper(root, value);
			}
    	}
    	if (compret == 1)
    	{
    		if (root.getRightChild() != null )
			{
				root = root.getRightChild();
				containsHelper(root, value);
			}
    	}
    	return false;
    }
    public int size()
    {
        return count;
    }
    
    public void traverseInorder( PrintWriter pw )
    {
        if (root != null)
        {
        	inorderHelper(root, pw);
        }
    }
    
    public void inorderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		inorderHelper(root.getLeftChild(), pw);
    		pw.println("Node: " + root.getValue().toString());
    		pw.flush();
    		inorderHelper(root.getRightChild(), pw);
    	}
    }
    public void traversePreorder( PrintWriter pw )
    {
        if(root != null)
        {
        	preorderHelper(root, pw);
        }
    }
    
    public void preorderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		pw.println("Node: " + root.getValue().toString());
    		pw.flush();
    		preorderHelper(root.getLeftChild(), pw);
    		preorderHelper(root.getRightChild(), pw);
    	}
    }
    public void traversePostOrder( PrintWriter pw )
    {
        if (root != null)
        {
        	postOrderHelper(root, pw);
        }
    }
    
    public void postOrderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		postOrderHelper(root.getLeftChild(), pw);
    		postOrderHelper(root.getRightChild(), pw);
    		pw.println("Node: " + root.getValue().toString());
    		pw.flush();
    	}
    }
}
