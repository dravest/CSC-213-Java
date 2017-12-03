import java.io.PrintWriter;
import java.util.Comparator;
import java.util.*;

public class CSTree<T>
{
	private Comparator<T> comparer;
	private CSTreeNode<T> rootNode = null;
	private CSTreeNode<T> parent = null;
	private int count = 0;
	private int count1 = 0;
	
    public CSTree( Comparator<T> comparator )
    {
    	comparer = comparator;
    }
    
    public void add( T value )
    {
    	if (rootNode == null)
    	{
    		rootNode = new CSTreeNode<T>();
    		rootNode.setValue(value);
    		rootNode.setRoot(true);
    		count += 1;
    	}
    	else
    	{
    		addHelper(rootNode, value);
    		count += 1;
    	}
    }
    
    private CSTreeNode<T> addHelper(CSTreeNode<T> root, T value)
    {

		CSTreeNode<T> Node = new CSTreeNode<T>();
		Node.setValue(value);
		
			int compret = comparer.compare(value, root.getValue());
			if (compret == 0)
			{
				System.out.println("ERROR: There can not be duplicate nodes");
				return Node;
			}
			else if (compret == -1)
			{	
				if (root.getLeftChild() == null)
				{
					root.setLeftChild(Node);//root.setLeftChild(addHelper(root.getLeftChild(), value));
					root.getLeftChild().setParent(Node);
					return Node;
				}
				addHelper(root.getLeftChild(), value);
			}
			else if (compret == 1)
			{
				if (root.getRightChild() == null)
				{
					root.setRightChild(Node);
					root.getLeftChild().setParent(Node);
					return Node;
				}
				addHelper(root.getRightChild(), value);
			}
		return Node;
    }
    public void remove( T value )
    {
    	removeHelper(rootNode, value);
    }
    
    private void removeHelper(CSTreeNode<T> root, T value)
    {
    	if (root.getValue() != null)
    	{
    		int compret = comparer.compare(value, root.getValue());
    		if (compret == 1)
    		{
    			if (root.getRightChild() != null )
    			{
    				if (root.getRightChild().getValue() == value)
    				{
    					parent = root;
    					parent.setValue(root.getValue());
        				parent.setRightChild(root.getRightChild());
        				parent.setLeftChild(root.getLeftChild());
    				}
    				root = root.getRightChild();
    				removeHelper(root, value);
    			}
    		}
    		else if (compret == -1)
    		{
    			if (root.getLeftChild() != null )
    			{
    				if (root.getLeftChild().getValue() == value)
    				{
    					parent = root;
    					parent.setValue(root.getValue());
        				parent.setRightChild(root.getRightChild());
        				parent.setLeftChild(root.getLeftChild());
    				}
    				root = root.getLeftChild();
    				removeHelper(root, value);
    			}
    		}
    		else if (compret == 0)
    		{
    			
    			if (parent != null) 
    			{
    				if (parent.getRightChild() != null & parent.getLeftChild() != null)
    				{
    					if (parent.getRightChild().getValue() == value & parent.getRightChild().getRightChild() == null)
    					{
    						parent.setRightChild(null);
    						count -= 1;
    					}
    					else if (parent.getLeftChild().getValue() == value & parent.getLeftChild().getRightChild() == null)
    					{
    						parent.setLeftChild(null);
    						count -= 1;
    					}
    					else
    					{
    						if (root.getValue() == value)
    						{
    							if (root.getLeftChild() != null)
    							{
    								root.setValue(root.getLeftChild().getValue());
    								root.setLeftChild(null);
    							}
    							else if (root.getRightChild() != null)
    							{
    								root.setValue(root.getRightChild().getValue());
    								root.setRightChild(null);
    							}
    						}
    						else if (root.getRightChild() != null)
    						{
    							root = root.getRightChild();
    							while (root.getLeftChild() != null)
    							{
    								if (root.getLeftChild().getLeftChild() == null)
    								{
    									break;
    								}
    								root = root.getLeftChild();
    							}
    							if (parent.getLeftChild().getValue() == value)
    							{
    								parent.getLeftChild().setValue(root.getValue());
    								root.setLeftChild(null);
    								count -= 1;
    							}
    							else if(parent.getRightChild().getValue() == value)
    							{
    								parent.getRightChild().setValue(root.getLeftChild().getValue());
    								root.setLeftChild(null);
    								count -= 1;
    							}
    						}
    					}
    				}
    				else if(parent.getRightChild() != null | parent.getLeftChild() != null)
    				{
    					if (parent.getRightChild() != null)//& parent.getRightChild().getRightChild() == null)
    					{
    						if (parent.getRightChild().getRightChild() == null & parent.getRightChild().getValue() == value)
    						{
    							parent.setRightChild(null);
    							count -= 1;
    						}
    						else if (parent.getRightChild() != null & parent.getRightChild().getValue() == value)
    						{
    							parent.setRightChild(parent.getRightChild().getRightChild());
    							parent.getRightChild().setRightChild(null);
    							
    						}
    					}
    					else if (parent.getLeftChild() != null )//& parent.getLeftChild().getRightChild() == null)
    					{
    						if (parent.getLeftChild().getLeftChild() == null & parent.getLeftChild().getValue() == value)
    						{
    							parent.setLeftChild(null);
    							count -= 1;
    						}
    						else if (parent.getLeftChild().getLeftChild() != null)
    						{
    							parent.setLeftChild(parent.getLeftChild().getLeftChild());
    							count -= 1;
    						}
    						else if (parent.getLeftChild() != null & parent.getValue() == rootNode.getValue())
    						{
    							parent.setValue(parent.getLeftChild().getValue());
    							parent.setLeftChild(null);
    							count -= 1;
    						}
    					}
    				}
    				else
    				{
    					if (parent.getValue() == root.getValue() & parent.getValue() == value)
    					{
    						rootNode = null;
    						parent = null;
    						count = 0;
    					}
    				}
    			}
    		}
    	}
    }
    public boolean contains( T value )
    {
    	if (rootNode == null)
    	{
    		return false;
    	}
    	else
    	{
    		return containsHelper(rootNode, value);
    	}
        
    }
    
    private boolean containsHelper(CSTreeNode<T> root, T value)
    {
    	if (root == null)
    	{
      		return false;
    	}
    	int compret = comparer.compare(value, root.getValue());
    	
    	if (compret == -1)
    	{
    		return containsHelper(root.getLeftChild(), value);
    	}
    	else if (compret == 1)
    	{
    		return containsHelper(root.getRightChild(), value);
    	}
    	else if (compret == 0)
    	{
    		return true;
    	}
    	return false;
    }
    public int size()
    {
        return count;
    }
    
    public void traverseInorder( PrintWriter pw )
    {
        if (rootNode != null)
        {
        	inorderHelper(rootNode, pw);
        }
    }
    
    private void inorderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		inorderHelper(root.getLeftChild(), pw);
    		pw.print(root.getValue()+ " ");
    		pw.flush();
    		inorderHelper(root.getRightChild(), pw);
    	}
    }
    public void traversePreorder( PrintWriter pw )
    {
        if(rootNode != null)
        {
        	preorderHelper(rootNode, pw);
        }
    }
    
    private void preorderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		pw.print(root.getValue() + " ");
    		pw.flush();
    		preorderHelper(root.getLeftChild(), pw);
    		preorderHelper(root.getRightChild(), pw);
    	}
    }
    public void traversePostOrder( PrintWriter pw )
    {
        if (rootNode != null)
        {
        	postOrderHelper(rootNode, pw);
        }
    }
    
    private void postOrderHelper(CSTreeNode<T> root, PrintWriter pw)
    {
    	if (root != null)
    	{
    		postOrderHelper(root.getLeftChild(), pw);
    		postOrderHelper(root.getRightChild(), pw);
    		pw.print(root.getValue() + " ");
    		pw.flush();
    	}
    }
}
