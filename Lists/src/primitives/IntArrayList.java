package primitives;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int count = 0;
    private int capacity;
    private static final double EXTENSION_COEF = 1.5;


    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        boolean content = false;
        for (int i = 0; i < count; i++) {
            if (get(i) == e)
                content = true;

        }
        return content;
    }


    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;


    }

    private void grow() { // служебный метод
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("No such index");

        return elements[index];
    }

    @Override
    public void remove(int index) { //сдвинуть
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("No such index");
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;

    }

    @Override
    public void sort() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < count - 1; i++) {
                if (elements[i] > elements[i + 1]) {
                    isSorted = false;
                    int buf = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = buf;

                }
            }
        }

    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            add(intList.get(i));
        }
    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        if (startPosition < 0 || startPosition >= intList.size()) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = startPosition; i < intList.size(); i++) {
            add(intList.get(i));


        }
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(elements, count);
    }


    @Override
    public int IndexOf(int value) {
        int h = 0;
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return i;
            }
            h++;
        }
        if (h == count) {
            throw new IllegalArgumentException("No such value");
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new MyIter();
    }

    class MyIter implements Iterator {
        private int currentIndex;

        public MyIter() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
            int val = elements[currentIndex++];
            return val;
        }
    }
}

