package generics;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
        private T[] elements;
        private int count = 0;

        public MyArrayList() {
             this.elements = (T[]) new Object[10];
        }

        public void add(T e) {
            elements[count++] = e;
        }

        public T get(int index) {
            return elements[index];
        }

        //число элементов в списке
        int size() {
            return count;
        }

        //есть ли в списке такой элемент
        boolean contains(T value) {
            boolean content = false;
            for (int i = 0; i < count + 1 ; i++) {
                if (elements[i] ==  value){
                    content = true;
                }

            }
            return content;
        }

        //удаление элемента по индекс (со смещением элементов влево)
        void remove(int index) {
            if (index < 0 || index >= count)
                throw new IllegalArgumentException("No such index");
            for (int i = index; i < count - 1; i++) {
                elements[i] = elements[i + 1];
            }
            count--;

        }

        //возвращает все элементы из списка в виде массива
        T[] toArray() {
            return Arrays.copyOf(elements, count);
        }

        //добавление всех элементов из списка list в данный список(в конец)
        void addAll(MyArrayList<T> list) {
            for (int i = 0; i < size(); i++) {
                add(get(i));
            }
        }

        //добавление всех элементов из списка list в данный список
        //начиная с позиции index
        void addAll(MyArrayList <T> list, int index) {
            if (index < 0 || index >= size()) {
                throw new IllegalArgumentException("No such index");
            }
            for (int i = index; i < size(); i++) {
                add(get(i));

            }
        }

        public Iterator<T> iterator() {
            return new MyIter();
        }

         class MyIter implements Iterator<T> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public T next() {
                return elements[currentIndex++];
            }
        }
    }


