package List;

import java.awt.event.ActionEvent;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    public MyArrayList(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            ActionChanged changed = new ActionChanged();
            int startSize = values.length;
            int endSize = 0;

            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length-1] = e;

            endSize = values.length;
            if (startSize != endSize)
                changed.Changed("add");
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            ActionChanged changed = new ActionChanged();
            int startSize = values.length;
            int endSize = 0;

            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountAfterIndex);


            endSize = values.length;
            if (startSize != endSize)
                changed.Changed("delete");
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(values);
    }
}
