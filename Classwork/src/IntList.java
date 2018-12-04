public interface IntList {
    int size(); //возвращает количество элментов

    boolean contains(int e); //возвращает True если элемент есть в списке

    void add (int e); //добавляет новый элемент в конец списка

    int get(int index); // возвращает элемент по индексу

    void remove(int index); // удаляет по индексу

    void sort(); //сортитрует по возрастанию

    void addAll(IntList IntList); // добавляет в конец все из даннгосписка
    void addAll (IntList IntList, int startPosition);

    int[] toArray();// вовзращает все элементы в виде массива
    int IndexOf(int value);
}
