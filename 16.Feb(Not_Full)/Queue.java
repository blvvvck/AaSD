package production.blvvvck;

public class Queue implements Sequance {

    private static final int INIT_CAPACITY = 10;
    private static final float RESIZE_FACTOR = 1.5f;

    private Object[] data;
    private int size = 0;

    public Queue(){
        this.data = new Object[INIT_CAPACITY];
    }
    public Queue(int initCapacity){
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
        size--;
        Object obj = data[0];

        Object[] newArr = new Object[size];
        System.arraycopy(data, 1, newArr, 0, size);
        return obj;
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