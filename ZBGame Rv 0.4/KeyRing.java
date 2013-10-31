import java.util.ArrayList;
/**
 * Patrick Foltyn 10/2013
 */
public class KeyRing
{
    String key;
    private ArrayList<String> keyring;
    public KeyRing()
    {
        ArrayList<String> k1 = new ArrayList<String>();
    }

    public void addKey(String key)
    {
        keyring.add(key);
    }

    public void setKey(String k)
    {
       key = k;
    }

    public String getKey()
    {
        return key;
    }

    public boolean checkKeyRing(String key)
    {
        for (String k1 : keyring)
        {
            if(keyring.equals(key))
                return true;
        }     
        return false;
    }
}