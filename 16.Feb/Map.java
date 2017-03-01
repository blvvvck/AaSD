package Feb14_Map;

public interface Map {


    void add(String key, Object value);

    Object get (String key);

    void set(String key, Object value);

    Object remove(String key);

    void removeAll();

    String[] getKeys();

    Object[] getValues();

    int size();
}
