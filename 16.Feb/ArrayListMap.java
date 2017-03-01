package Feb14_Map;

import java.util.ArrayList;

public class ArrayListMap implements Map {

    private ArrayList<String> keys;
    private ArrayList<Object> values;

    public ArrayListMap(int size) {
        this.keys = new ArrayList<>(size);
        this.values = new ArrayList<>(size);
    }

    public ArrayListMap(){
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    @Override
    public void add(String key, Object value) {
        checkKey(key);
        keys.add(key);
        values.add(value);
    }

    @Override
    public Object get(String key) {
        checkKey(key);
        int num = keys.indexOf(key);
        return values.get(num);
    }

    @Override
    public void set(String key, Object value) {
        if (keys.contains(key)){
            throw new KeyException("Ключ не найден");
        }

        int num = keys.indexOf(key);
        values.set(num, value);
    }

    @Override
    public Object remove(String key) {
        checkKey(key);
        int num = keys.indexOf(key);
        Object obj = values.get(num);
        keys.remove(num);
        values.remove(num);
        return obj;
    }

    @Override
    public void removeAll() {
        keys.clear();
        values.clear();
    }

    @Override
    public String[] getKeys() {
        return (String[]) keys.toArray();
    }

    @Override
    public Object[] getValues() {
        return values.toArray();
    }

    @Override
    public int size() {
        return keys.size();
    }

    public void checkKey(String key){
        if (keys.contains(key)){
            throw new KeyException("Такой ключ уже использован");
        }

    }

}
