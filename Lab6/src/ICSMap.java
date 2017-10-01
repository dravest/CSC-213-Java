import java.util.List;

/**
 * An interface that defines a simple Map data structure.  This Map 
 * data structure is similar to the one provided by the Java programming
 * language, however a lot of the advanced functions have been removed to
 * simplify the implementation requirements for students.
 * 
 * @author Benjamin Rood
 * Copyright (C) 2017 Canisius College of Buffalo
 * 
 * @param <K> The key data type used in the Map
 * @param <V> The value data type that is associated with a key in the Map
 */
public interface ICSMap<K, V>
{
    /**
     * Retrieves the data element that is associated with the input key.
     * 
     * @param key The key to retrieve the associated data element for
     * 
     * @return The data element (value) that is associated with the input key, or <tt>null</tt> if the input 
     *         key is not stored in the {@link ICSMap}.
     */
    public V get( K key );
    
    /**
     * Inserts the key-value pair into the {@link ICSMap}.  If the key already exists within the
     * {@link ICSMap}, the data value is replaced with the data value supplied to this method.
     * 
     * @param key The key with which the specified value is to be associated
     * @param value The value to to be associated with the specified key
     * 
     * @return The data element (value) that was previously associated with the key, or <tt>null</tt> if
     *         there was no mapping for the key. 
     */
    public V put( K key, V value );
    
    /**
     * Retrieves the {@link List} of keys that are stored in the {@link ICSMap} instance.  If no keys
     * are stored in the {@link ICSMap} instance, then an empty {@link List} is returned.
     * 
     * @return The {@link List} of keys that are stored in the {@link ICSMap} instance, or an empty 
     *         {@link List} if no keys are stored in the {@link ICSMap} instance.
     */
    public List<K> getKeys();
    
    /**
     * Determines if the input key is stored in the {@link ICSMap} instance.
     * 
     * @param key The key to search for
     * 
     * @return <tt>True</tt> if the input key is stored in the {@link ICSMap} instance, <tt>false</tt>
     *         otherwise.
     */
    public boolean containsKey( K key );
}
