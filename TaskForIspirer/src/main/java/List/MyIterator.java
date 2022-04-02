package List;

import java.util.Iterator;

public class MyIterator<E> implements Iterator{

    private int index = 0;
    private E[] values;

    MyIterator(E[] values){
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
