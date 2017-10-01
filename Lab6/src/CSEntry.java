
public class CSEntry<K, V>
{
    /** The key object for this {@link CSEntry} instance. */
    private K key;
    
    /** The value object for this {@link CSEntry} instance. */
    private V value;
    
    /**
     * Creates a new instance of a {@link CSEntry}.
     * 
     * @param key The key object for this {@link CSEntry} instance
     * @param value The value object for this {@link CSEntry} instance
     */
    public CSEntry( K key, V value )
    {
        this.key   = key;
        this.value = value;
    }
    
    /**
     * Retrieves the key object for this {@link CSEntry} instance.
     * 
     * @return The key object for this {@link CSEntry} instance.
     */
    public K getKey()
    {
        return key;
    }
    
    /**
     * Retrieves the value object for this {@link CSEntry} instance.
     * 
     * @return The value object for this {@link CSEntry} instance.
     */
    public V getValue()
    {
        return value;
    }
    
    /**
     * Sets a new value to be associated with this {@link CSEntry} instance, and returns the
     * previously associated value.
     * 
     * @param newValue The new value to associate with this {@link CSEntry} instance
     * 
     * @return The value previously associated with this {@link CSEntry} instance.
     */
    public V setValue( V newValue )
    {
        V prevValue = value;
        
        value = newValue;
        
        return prevValue;
    }
}
