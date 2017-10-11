import java.util.ArrayList;
import java.util.List;

/**
 * A class that implements the {@link ICSMap} interface.
 * 
 * @author <your name here>
 * Copyright (C) 2017 Canisius College of Buffalo
 */
public class CSMap<K, V> implements ICSMap<K, V>
{
    /** The maximum number of buckets allowed in the map. */
    private static final int MAX_BUCKETS = 10;
    
    /** The bucket list. */
    private List<List<CSEntry<K, V>>> buckets;
    
    /**
     * Creates a new instance of a {@link CSMap}.  Initializes the bucket list.
     */
    public CSMap()
    {
        buckets = new ArrayList<List<CSEntry<K, V>>>();
        
        for ( int i = 0; i < MAX_BUCKETS; i++ )
        {
            buckets.add( new ArrayList<CSEntry<K, V>>() );
        }
    }
    
    @Override
    public V get( K key )
    {
        // TODO: add implementation
    	if (key != null)
    	{
    		int bucketNum = getBucket(key);
    		List<CSEntry<K, V>> keys = buckets.get(bucketNum);
    		for (int i = 0; i < keys.size(); i++)
    		{
    			CSEntry<K,V> k = keys.get(i);
    			//System.out.println(k.getKey());
    			if (key.equals(k.getKey()))
    			{
    				V v = k.getValue();
    				return v;
    			}
    		}
    	}
    	return null;
    }

    @Override
    public V put( K key, V value )
    {
        // TODO: add implementation
    	int bucketNum = getBucket(key);
    	List<CSEntry<K, V>> keys = buckets.get(bucketNum);
    	V prevVal = null;
    		boolean found = false;
    		for (int i = 0; i < keys.size(); i++)
    		{
    			CSEntry<K, V> k = keys.get(i);  
    			
    			if (k.getKey().equals(key))
    			{
    				prevVal = k.setValue(value);
    				found = true;
    				break;
    			}
    		}
    		if (found == false)
    		{
    			CSEntry<K, V> pair = new CSEntry<K, V>(key, value);
    			keys.add(pair);
    		}
    	return prevVal;
    }

    @Override
    public List<K> getKeys()
    {
        // TODO: add implementation
    	List<K> keys = new ArrayList<K>();
    	for (int i = 0; i < buckets.size(); i++)
    	{
    		List<CSEntry<K, V>> key = buckets.get(i);
    		//if (key.isEmpty() == true)
    		//{
    		//	return keys;
    		//}
    		for (int j = 0; j < key.size(); j++)
    		{
    			CSEntry<K, V> Key = key.get(j);
    			K Key2 = Key.getKey();
    			if(Key2 != null)
    			{
    				keys.add((keys.size()), Key2);
    			}
    		}
    	}
    	return keys;
    }

    @Override
    public boolean containsKey( K key )
    {
        // TODO: add implementation
    	int bucketNum = getBucket(key);
    	List<CSEntry<K, V>> keys = buckets.get(bucketNum);
    	for (int i = 0; i < keys.size(); i++)
    	{
    		CSEntry<K, V> k = keys.get(i);
    		if (k.equals(key))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Calculates the bucket that is appropriate for the key.
     * 
     * @param key The key to calculate the bucket for
     * 
     * @return The bucket that is appropriate for the key.
     */
    public int getBucket( K key )
    {
        // XXX: DO NOT MODIFY
        return Math.abs( (key.hashCode() % 7) );
    }
}
