package production.blvvvck;

public class Stack implements Sequance {

    private static final int INIT_CAPACITY = 10;
    private static final float RESIZE_FACTOR = 1.5f;

    private Object[] data;
    private int size = 0;

    public Stack(){
        this.data = new Object[INIT_CAPACITY];
    }
    public Stack(int initCapacity){
        this.data = new Object[initCapacity];
    }


    @Override
    public void add(Object obj) {
        if(this.size >= this.data.length){
            int newCapacity = new Double(Math.floor(this.data.length*RESIZE_FACTOR)).intValue();
            Object[] temp = new Object[newCapacity];
            System.arraycopy(this.data, 0, temp, 0, this.data.length);
            this.data = temp;
        }
        this.data[this.size] = obj;
        this.size++;
    }

    @Override
    public Object pop() {
        Object temp = data[size];
        data[size] = null;
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek(int i) {
        return data[i];
    }
}
