import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Patrick Foltyn 10/2013
 */
public class KeyRing
{
    private ArrayList<Key> keyring;
    private HashMap<String, Key> keys;
    public KeyRing()
    {
        
    }

    public void addKey(Key k)
    {
        keyring.add(k);
    }

    public void use(Key p, Room e)
    {
        
    }
    
    public Key getKey(String keyName) 
    {
        return keys.get(keyName);
    }
    
    public void setKey(String keyName, Key key) 
    {
        keys.put(keyName, key);
    }
}