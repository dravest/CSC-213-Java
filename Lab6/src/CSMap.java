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
        return null;
    }

    @Override
    public V put( K key, V value )
    {
        // TODO: add implementation
        return null;
    }

    @Override
    public List<K> getKeys()
    {
        // TODO: add implementation
        return null;
    }

    @Override
    public boolean containsKey( K key )
    {
        // TODO: add implementation
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
